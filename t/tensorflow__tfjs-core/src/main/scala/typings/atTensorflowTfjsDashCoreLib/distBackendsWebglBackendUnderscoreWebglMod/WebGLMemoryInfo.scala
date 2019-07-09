package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLMemoryInfo
  extends atTensorflowTfjsDashCoreLib.distEngineMod.MemoryInfo {
  var numBytesInGPU: scala.Double
  @JSName("unreliable")
  var unreliable_WebGLMemoryInfo: scala.Boolean
}

object WebGLMemoryInfo {
  @scala.inline
  def apply(
    numBytes: scala.Double,
    numBytesInGPU: scala.Double,
    numDataBuffers: scala.Double,
    numTensors: scala.Double,
    reasons: js.Array[java.lang.String],
    unreliable: scala.Boolean
  ): WebGLMemoryInfo = {
    val __obj = js.Dynamic.literal(numBytes = numBytes, numBytesInGPU = numBytesInGPU, numDataBuffers = numDataBuffers, numTensors = numTensors, reasons = reasons, unreliable = unreliable)
  
    __obj.asInstanceOf[WebGLMemoryInfo]
  }
}

