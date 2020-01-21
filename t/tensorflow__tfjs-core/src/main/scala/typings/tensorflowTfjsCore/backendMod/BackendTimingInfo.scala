package typings.tensorflowTfjsCore.backendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackendTimingInfo extends js.Object {
  var getExtraProfileInfo: js.UndefOr[js.Function0[String]] = js.undefined
  var kernelMs: Double
}

object BackendTimingInfo {
  @scala.inline
  def apply(kernelMs: Double, getExtraProfileInfo: () => String = null): BackendTimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any])
    if (getExtraProfileInfo != null) __obj.updateDynamic("getExtraProfileInfo")(js.Any.fromFunction0(getExtraProfileInfo))
    __obj.asInstanceOf[BackendTimingInfo]
  }
}

