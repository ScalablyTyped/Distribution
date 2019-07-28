package typings.atTensorflowTfjsDashCore.distEngineMod

import typings.atTensorflowTfjsDashCore.distBackendsBackendMod.BackendTimingInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingInfo extends BackendTimingInfo {
  var wallMs: Double
}

object TimingInfo {
  @scala.inline
  def apply(kernelMs: Double, wallMs: Double, getExtraProfileInfo: () => String = null): TimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs, wallMs = wallMs)
    if (getExtraProfileInfo != null) __obj.updateDynamic("getExtraProfileInfo")(js.Any.fromFunction0(getExtraProfileInfo))
    __obj.asInstanceOf[TimingInfo]
  }
}

