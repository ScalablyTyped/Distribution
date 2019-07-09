package typings
package atTensorflowTfjsDashCoreLib.distBackendsBackendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendTimingInfo extends js.Object {
  var getExtraProfileInfo: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  var kernelMs: scala.Double
}

object BackendTimingInfo {
  @scala.inline
  def apply(kernelMs: scala.Double, getExtraProfileInfo: () => java.lang.String = null): BackendTimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs)
    if (getExtraProfileInfo != null) __obj.updateDynamic("getExtraProfileInfo")(js.Any.fromFunction0(getExtraProfileInfo))
    __obj.asInstanceOf[BackendTimingInfo]
  }
}

