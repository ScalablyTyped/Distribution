package typings.wegameApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined wegame-api.wx.types.Callbacks & {  muteConfig :{  muteMicrophone :boolean | undefined,   muteEarphone :boolean | undefined}} */
@js.native
trait CallbacksmuteConfigmuteMi extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 静音设置
    */
  var muteConfig: MuteEarphone = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object CallbacksmuteConfigmuteMi {
  @scala.inline
  def apply(muteConfig: MuteEarphone): CallbacksmuteConfigmuteMi = {
    val __obj = js.Dynamic.literal(muteConfig = muteConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[CallbacksmuteConfigmuteMi]
  }
  @scala.inline
  implicit class CallbacksmuteConfigmuteMiOps[Self <: CallbacksmuteConfigmuteMi] (val x: Self) extends AnyVal {
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
    def setMuteConfig(value: MuteEarphone): Self = this.set("muteConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

