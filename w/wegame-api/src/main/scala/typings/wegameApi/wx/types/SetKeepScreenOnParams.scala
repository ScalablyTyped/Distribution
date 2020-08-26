package typings.wegameApi.wx.types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetKeepScreenOnParams extends js.Object {
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  var keepScreenOn: Boolean = js.native
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object SetKeepScreenOnParams {
  @scala.inline
  def apply(keepScreenOn: Boolean): SetKeepScreenOnParams = {
    val __obj = js.Dynamic.literal(keepScreenOn = keepScreenOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetKeepScreenOnParams]
  }
  @scala.inline
  implicit class SetKeepScreenOnParamsOps[Self <: SetKeepScreenOnParams] (val x: Self) extends AnyVal {
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
    def setKeepScreenOn(value: Boolean): Self = this.set("keepScreenOn", value.asInstanceOf[js.Any])
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

