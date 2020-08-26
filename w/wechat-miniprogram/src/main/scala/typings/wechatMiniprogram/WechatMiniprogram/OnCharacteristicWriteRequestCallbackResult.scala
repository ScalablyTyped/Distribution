package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCharacteristicWriteRequestCallbackResult extends js.Object {
  /** 唯一标识码，调用 writeCharacteristicValue 时使用 */
  var callbackId: Double = js.native
  /** characteristic对应的uuid */
  var characteristicId: String = js.native
  /** service对应的uuid */
  var serviceId: String = js.native
  /** 请求写入的特征值数据 */
  var value: ArrayBuffer = js.native
}

object OnCharacteristicWriteRequestCallbackResult {
  @scala.inline
  def apply(callbackId: Double, characteristicId: String, serviceId: String, value: ArrayBuffer): OnCharacteristicWriteRequestCallbackResult = {
    val __obj = js.Dynamic.literal(callbackId = callbackId.asInstanceOf[js.Any], characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicWriteRequestCallbackResult]
  }
  @scala.inline
  implicit class OnCharacteristicWriteRequestCallbackResultOps[Self <: OnCharacteristicWriteRequestCallbackResult] (val x: Self) extends AnyVal {
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
    def setCallbackId(value: Double): Self = this.set("callbackId", value.asInstanceOf[js.Any])
    @scala.inline
    def setCharacteristicId(value: String): Self = this.set("characteristicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

