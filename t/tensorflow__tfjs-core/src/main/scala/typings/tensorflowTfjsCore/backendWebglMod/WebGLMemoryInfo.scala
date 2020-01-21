package typings.tensorflowTfjsCore.backendWebglMod

import typings.tensorflowTfjsCore.engineMod.MemoryInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLMemoryInfo extends MemoryInfo {
  var numBytesInGPU: Double
  @JSName("unreliable")
  var unreliable_WebGLMemoryInfo: Boolean
}

object WebGLMemoryInfo {
  @scala.inline
  def apply(
    numBytes: Double,
    numBytesInGPU: Double,
    numDataBuffers: Double,
    numTensors: Double,
    reasons: js.Array[String],
    unreliable: Boolean
  ): WebGLMemoryInfo = {
    val __obj = js.Dynamic.literal(numBytes = numBytes.asInstanceOf[js.Any], numBytesInGPU = numBytesInGPU.asInstanceOf[js.Any], numDataBuffers = numDataBuffers.asInstanceOf[js.Any], numTensors = numTensors.asInstanceOf[js.Any], reasons = reasons.asInstanceOf[js.Any], unreliable = unreliable.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WebGLMemoryInfo]
  }
}

