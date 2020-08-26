package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UDPSocketOnMessageCallbackResult extends js.Object {
  /** 收到的消息 */
  var message: ArrayBuffer = js.native
  /** 消息来源的结构化信息 */
  var remoteInfo: RemoteInfo = js.native
}

object UDPSocketOnMessageCallbackResult {
  @scala.inline
  def apply(message: ArrayBuffer, remoteInfo: RemoteInfo): UDPSocketOnMessageCallbackResult = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], remoteInfo = remoteInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[UDPSocketOnMessageCallbackResult]
  }
  @scala.inline
  implicit class UDPSocketOnMessageCallbackResultOps[Self <: UDPSocketOnMessageCallbackResult] (val x: Self) extends AnyVal {
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
    def setMessage(value: ArrayBuffer): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoteInfo(value: RemoteInfo): Self = this.set("remoteInfo", value.asInstanceOf[js.Any])
  }
  
}

