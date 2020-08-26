package typings.tensorflowTfjsCore.backendMod

import typings.tensorflowTfjsCore.anon.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BackendTimingInfo extends js.Object {
  var getExtraProfileInfo: js.UndefOr[js.Function0[String]] = js.native
  var kernelMs: Double | Error = js.native
}

object BackendTimingInfo {
  @scala.inline
  def apply(kernelMs: Double | Error): BackendTimingInfo = {
    val __obj = js.Dynamic.literal(kernelMs = kernelMs.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackendTimingInfo]
  }
  @scala.inline
  implicit class BackendTimingInfoOps[Self <: BackendTimingInfo] (val x: Self) extends AnyVal {
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
    def setKernelMs(value: Double | Error): Self = this.set("kernelMs", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetExtraProfileInfo(value: () => String): Self = this.set("getExtraProfileInfo", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetExtraProfileInfo: Self = this.set("getExtraProfileInfo", js.undefined)
  }
  
}

