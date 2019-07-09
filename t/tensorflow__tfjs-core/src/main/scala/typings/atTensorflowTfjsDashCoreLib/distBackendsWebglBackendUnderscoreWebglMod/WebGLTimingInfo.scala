package typings
package atTensorflowTfjsDashCoreLib.distBackendsWebglBackendUnderscoreWebglMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WebGLTimingInfo
  extends atTensorflowTfjsDashCoreLib.distEngineMod.TimingInfo {
  var downloadWaitMs: scala.Double
  var uploadWaitMs: scala.Double
}

object WebGLTimingInfo {
  @scala.inline
  def apply(
    downloadWaitMs: scala.Double,
    kernelMs: scala.Double,
    uploadWaitMs: scala.Double,
    wallMs: scala.Double,
    getExtraProfileInfo: () => java.lang.String = null
  ): WebGLTimingInfo = {
    val __obj = js.Dynamic.literal(downloadWaitMs = downloadWaitMs, kernelMs = kernelMs, uploadWaitMs = uploadWaitMs, wallMs = wallMs)
    if (getExtraProfileInfo != null) __obj.updateDynamic("getExtraProfileInfo")(js.Any.fromFunction0(getExtraProfileInfo))
    __obj.asInstanceOf[WebGLTimingInfo]
  }
}

