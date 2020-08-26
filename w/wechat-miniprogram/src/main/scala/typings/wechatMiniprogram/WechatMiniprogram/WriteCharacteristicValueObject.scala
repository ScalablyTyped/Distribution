package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteCharacteristicValueObject extends js.Object {
  /** 可选，处理回包时使用 */
  var callbackId: js.UndefOr[Double] = js.native
  /** characteristic对应的uuid */
  var characteristicId: String = js.native
  /** 是否需要通知主机value已更新 */
  var needNotify: Boolean = js.native
  /** service 的 uuid */
  var serviceId: String = js.native
  /** 特征值对应的二进制值 */
  var value: ArrayBuffer = js.native
}

object WriteCharacteristicValueObject {
  @scala.inline
  def apply(characteristicId: String, needNotify: Boolean, serviceId: String, value: ArrayBuffer): WriteCharacteristicValueObject = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], needNotify = needNotify.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteCharacteristicValueObject]
  }
  @scala.inline
  implicit class WriteCharacteristicValueObjectOps[Self <: WriteCharacteristicValueObject] (val x: Self) extends AnyVal {
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
    def setCharacteristicId(value: String): Self = this.set("characteristicId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNeedNotify(value: Boolean): Self = this.set("needNotify", value.asInstanceOf[js.Any])
    @scala.inline
    def setServiceId(value: String): Self = this.set("serviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: ArrayBuffer): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setCallbackId(value: Double): Self = this.set("callbackId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallbackId: Self = this.set("callbackId", js.undefined)
  }
  
}

