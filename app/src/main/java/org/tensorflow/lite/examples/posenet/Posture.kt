package org.tensorflow.lite.examples.posenet

data class Posture(
    var image : String,
    var posture : String,
    var date : String,
    var score : String
)
