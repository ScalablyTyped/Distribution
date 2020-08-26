package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NavigateToSuccessCallbackResult extends js.Object {
  var errMsg: String = js.native
  /** [EventChannel](https://developers.weixin.qq.com/miniprogram/dev/api/route/EventChannel.html)
    *
    * 和被打开页面进行通信 */
  var eventChannel: EventChannel = js.native
}

object NavigateToSuccessCallbackResult {
  @scala.inline
  def apply(errMsg: String, eventChannel: EventChannel): NavigateToSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(errMsg = errMsg.asInstanceOf[js.Any], eventChannel = eventChannel.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigateToSuccessCallbackResult]
  }
  @scala.inline
  implicit class NavigateToSuccessCallbackResultOps[Self <: NavigateToSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def setEventChannel(value: EventChannel): Self = this.set("eventChannel", value.asInstanceOf[js.Any])
  }
  
}

