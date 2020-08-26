package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopBeaconDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("complete")
  var complete_StopBeaconDiscoveryOptions: js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("fail")
  var fail_StopBeaconDiscoveryOptions: js.UndefOr[js.Function0[Unit]] = js.native
  @JSName("success")
  var success_StopBeaconDiscoveryOptions: js.UndefOr[js.Function1[/* res */ ErrMsgResponse, Unit]] = js.native
}

object StopBeaconDiscoveryOptions {
  @scala.inline
  def apply(): StopBeaconDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopBeaconDiscoveryOptions]
  }
  @scala.inline
  implicit class StopBeaconDiscoveryOptionsOps[Self <: StopBeaconDiscoveryOptions] (val x: Self) extends AnyVal {
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
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ ErrMsgResponse => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

