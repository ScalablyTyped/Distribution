package typings.tensorflowTfjsBackendWebgl.backendWebglMod

import typings.tensorflowTfjsCore.anon.Error
import typings.tensorflowTfjsCore.engineMod.TimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebGLTimingInfo extends TimingInfo {
  var downloadWaitMs: Double = js.native
  var uploadWaitMs: Double = js.native
}

object WebGLTimingInfo {
  @scala.inline
  def apply(downloadWaitMs: Double, kernelMs: Double | Error, uploadWaitMs: Double, wallMs: Double): WebGLTimingInfo = {
    val __obj = js.Dynamic.literal(downloadWaitMs = downloadWaitMs.asInstanceOf[js.Any], kernelMs = kernelMs.asInstanceOf[js.Any], uploadWaitMs = uploadWaitMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[WebGLTimingInfo]
  }
  @scala.inline
  implicit class WebGLTimingInfoOps[Self <: WebGLTimingInfo] (val x: Self) extends AnyVal {
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
    def setDownloadWaitMs(value: Double): Self = this.set("downloadWaitMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setUploadWaitMs(value: Double): Self = this.set("uploadWaitMs", value.asInstanceOf[js.Any])
  }
  
}

