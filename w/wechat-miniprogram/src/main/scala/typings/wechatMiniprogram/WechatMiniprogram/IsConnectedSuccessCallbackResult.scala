package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IsConnectedSuccessCallbackResult extends js.Object {
  /** 是否连接 */
  var connected: Boolean = js.native
  var errMsg: String = js.native
}

object IsConnectedSuccessCallbackResult {
  @scala.inline
  def apply(connected: Boolean, errMsg: String): IsConnectedSuccessCallbackResult = {
    val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], errMsg = errMsg.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsConnectedSuccessCallbackResult]
  }
  @scala.inline
  implicit class IsConnectedSuccessCallbackResultOps[Self <: IsConnectedSuccessCallbackResult] (val x: Self) extends AnyVal {
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
    def setConnected(value: Boolean): Self = this.set("connected", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrMsg(value: String): Self = this.set("errMsg", value.asInstanceOf[js.Any])
  }
  
}

