package typings.weixinApp.wx

import typings.weixinApp.anon.characteristiccharacteris
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBLECharacteristicValue
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: String
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: String
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: String
  @JSName("success")
  def success_MReadBLECharacteristicValue(res: characteristiccharacteris): Unit
}

object ReadBLECharacteristicValue {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: characteristiccharacteris => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): ReadBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ReadBLECharacteristicValue]
  }
}

