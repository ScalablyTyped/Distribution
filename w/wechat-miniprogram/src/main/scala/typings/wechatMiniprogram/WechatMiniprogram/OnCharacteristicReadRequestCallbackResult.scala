package typings.wechatMiniprogram.WechatMiniprogram

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnCharacteristicReadRequestCallbackResult extends js.Object {
  /** 唯一标识码，调用 writeCharacteristicValue 时使用 */
  var callbackId: Double = js.native
  /** characteristic对应的uuid */
  var characteristicId: String = js.native
  /** service对应的uuid */
  var serviceId: String = js.native
}

object OnCharacteristicReadRequestCallbackResult {
  @scala.inline
  def apply(callbackId: Double, characteristicId: String, serviceId: String): OnCharacteristicReadRequestCallbackResult = {
    val __obj = js.Dynamic.literal(callbackId = callbackId.asInstanceOf[js.Any], characteristicId = characteristicId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnCharacteristicReadRequestCallbackResult]
  }
  @scala.inline
  implicit class OnCharacteristicReadRequestCallbackResultOps[Self <: OnCharacteristicReadRequestCallbackResult] (val x: Self) extends AnyVal {
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
  }
  
}

