package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateBackMiniProgramOption extends js.Object {
  /** 接口调用结束的回调函数（调用成功、失败都会执行） */
  var complete: js.UndefOr[NavigateBackMiniProgramCompleteCallback] = js.native
  /** 需要返回给上一个小程序的数据，上一个小程序可在 `App.onShow` 中获取到这份数据。 [详情](https://developers.weixin.qq.com/miniprogram/dev/reference/api/App.html)。 */
  var extraData: js.UndefOr[IAnyObject] = js.native
  /** 接口调用失败的回调函数 */
  var fail: js.UndefOr[NavigateBackMiniProgramFailCallback] = js.native
  /** 接口调用成功的回调函数 */
  var success: js.UndefOr[NavigateBackMiniProgramSuccessCallback] = js.native
}

object NavigateBackMiniProgramOption {
  @scala.inline
  def apply(): NavigateBackMiniProgramOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NavigateBackMiniProgramOption]
  }
  @scala.inline
  implicit class NavigateBackMiniProgramOptionOps[Self <: NavigateBackMiniProgramOption] (val x: Self) extends AnyVal {
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
    def setComplete(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("complete", js.Any.fromFunction1(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setExtraData(value: IAnyObject): Self = this.set("extraData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExtraData: Self = this.set("extraData", js.undefined)
    @scala.inline
    def setFail(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("fail", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setSuccess(value: /* res */ GeneralCallbackResult => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

