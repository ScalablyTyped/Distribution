package typings.tensorflowTfjsBackendWebgl.backendWebglMod

import typings.tensorflowTfjsCore.engineMod.MemoryInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLMemoryInfo extends MemoryInfo {
  var numBytesInGPU: Double = js.native
  @JSName("unreliable")
  var unreliable_WebGLMemoryInfo: Boolean = js.native
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
  @scala.inline
  implicit class WebGLMemoryInfoOps[Self <: WebGLMemoryInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNumBytesInGPU(value: Double): Self = this.set("numBytesInGPU", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnreliable(value: Boolean): Self = this.set("unreliable", value.asInstanceOf[js.Any])
  }
  
}

