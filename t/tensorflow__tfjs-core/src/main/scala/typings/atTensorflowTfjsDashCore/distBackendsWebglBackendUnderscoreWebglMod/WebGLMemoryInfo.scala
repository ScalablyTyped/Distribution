package typings.atTensorflowTfjsDashCore.distBackendsWebglBackendUnderscoreWebglMod

import typings.atTensorflowTfjsDashCore.distEngineMod.MemoryInfo
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
    val __obj = js.Dynamic.literal(numBytes = numBytes, numBytesInGPU = numBytesInGPU, numDataBuffers = numDataBuffers, numTensors = numTensors, reasons = reasons, unreliable = unreliable)
  
    __obj.asInstanceOf[WebGLMemoryInfo]
  }
}

