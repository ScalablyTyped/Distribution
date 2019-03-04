package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadBLECharacteristicValue
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: java.lang.String
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: java.lang.String
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: java.lang.String
  @JSName("success")
  def success_MReadBLECharacteristicValue(res: weixinDashAppLib.Anon_Characteristic with ErrMsgResponse): scala.Unit
}

object ReadBLECharacteristicValue {
  @scala.inline
  def apply(
    characteristicId: java.lang.String,
    deviceId: java.lang.String,
    serviceId: java.lang.String,
    success: js.Function1[weixinDashAppLib.Anon_Characteristic with ErrMsgResponse, scala.Unit],
    complete: js.Function1[/* res */ js.Any, scala.Unit] = null,
    fail: js.Function1[js.Any, scala.Unit] = null
  ): ReadBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, success = success)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    __obj.asInstanceOf[ReadBLECharacteristicValue]
  }
}

