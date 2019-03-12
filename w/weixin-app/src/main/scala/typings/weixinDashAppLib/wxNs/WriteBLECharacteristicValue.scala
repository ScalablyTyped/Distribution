package typings
package weixinDashAppLib.wxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteBLECharacteristicValue
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: java.lang.String
  @JSName("complete")
  var complete_WriteBLECharacteristicValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: java.lang.String
  @JSName("fail")
  var fail_WriteBLECharacteristicValue: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: java.lang.String
  /**
  		 * 蓝牙设备特征值对应的二进制值
  		 */
  var value: stdLib.ArrayBuffer
  @JSName("success")
  def success_MWriteBLECharacteristicValue(res: ErrMsgResponse): scala.Unit
}

object WriteBLECharacteristicValue {
  @scala.inline
  def apply(
    characteristicId: java.lang.String,
    deviceId: java.lang.String,
    serviceId: java.lang.String,
    success: ErrMsgResponse => scala.Unit,
    value: stdLib.ArrayBuffer,
    complete: () => scala.Unit = null,
    fail: () => scala.Unit = null
  ): WriteBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, success = js.Any.fromFunction1(success), value = value)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    __obj.asInstanceOf[WriteBLECharacteristicValue]
  }
}

