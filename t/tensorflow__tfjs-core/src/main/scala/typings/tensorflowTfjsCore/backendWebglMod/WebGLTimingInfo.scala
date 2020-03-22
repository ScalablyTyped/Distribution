package typings.tensorflowTfjsCore.backendWebglMod

import typings.tensorflowTfjsCore.AnonError
import typings.tensorflowTfjsCore.engineMod.TimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLTimingInfo extends TimingInfo {
  var downloadWaitMs: Double
  var uploadWaitMs: Double
}

object WebGLTimingInfo {
  @scala.inline
  def apply(
    downloadWaitMs: Double,
    kernelMs: Double | AnonError,
    uploadWaitMs: Double,
    wallMs: Double,
    getExtraProfileInfo: () => String = null
  ): WebGLTimingInfo = {
    val __obj = js.Dynamic.literal(downloadWaitMs = downloadWaitMs.asInstanceOf[js.Any], kernelMs = kernelMs.asInstanceOf[js.Any], uploadWaitMs = uploadWaitMs.asInstanceOf[js.Any], wallMs = wallMs.asInstanceOf[js.Any])
    if (getExtraProfileInfo != null) __obj.updateDynamic("getExtraProfileInfo")(js.Any.fromFunction0(getExtraProfileInfo))
    __obj.asInstanceOf[WebGLTimingInfo]
  }
}

