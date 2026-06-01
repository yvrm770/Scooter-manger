package com.example.scootermanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            var text by remember { mutableStateOf("שלום עולם 🚀") }

            Column {
                Text(text)
                Button(onClick = { text = "האפליקציה עובדת ✔️" }) {
                    Text("לחץ")
                }
            }
        }
    }
}
