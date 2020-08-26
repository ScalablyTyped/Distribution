package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`1`
import typings.wechatMiniprogram.wechatMiniprogramNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnHCEMessageCallbackResult extends js.Object {
  /** `messageType=1` 时 ,客户端接收到 NFC 设备的指令 */
  var data: ArrayBuffer = js.native
  /** 消息类型
    *
    * 可选值：
    * - 1: HCE APDU Command类型，小程序需对此指令进行处理，并调用 sendHCEMessage 接口返回处理指令;
    * - 2: 设备离场事件类型; */
  var messageType: `1` | `2` = js.native
  /** `messageType=2` 时，原因 */
  var reason: Double = js.native
}

object OnHCEMessageCallbackResult {
  @scala.inline
  def apply(data: ArrayBuffer, messageType: `1` | `2`, reason: Double): OnHCEMessageCallbackResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnHCEMessageCallbackResult]
  }
  @scala.inline
  implicit class OnHCEMessageCallbackResultOps[Self <: OnHCEMessageCallbackResult] (val x: Self) extends AnyVal {
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
    def setData(value: ArrayBuffer): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessageType(value: `1` | `2`): Self = this.set("messageType", value.asInstanceOf[js.Any])
    @scala.inline
    def setReason(value: Double): Self = this.set("reason", value.asInstanceOf[js.Any])
  }
  
}

