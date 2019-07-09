package typings
package atTensorflowTfjsDashCoreLib.distEngineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimingInfo
  extends atTensorflowTfjsDashCoreLib.distBackendsBackendMod.BackendTimingInfo {
  var wallMs: scala.Double
}

object TimingInfo {
  @scala.inline
  def apply(kernelMs: scala.Double, wallMs: scala.Double, getExtraProfileInfo: () => java.lang.String = null): TimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs, wallMs = wallMs)
    if (getExtraProfileInfo != null) __obj.updateDynamic("getExtraProfileInfo")(js.Any.fromFunction0(getExtraProfileInfo))
    __obj.asInstanceOf[TimingInfo]
  }
}

