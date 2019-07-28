package typings.weixinDashApp.wxNs

import typings.std.ArrayBuffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteBLECharacteristicValue
  extends BaseOptions[js.Any, js.Any] {
  /**
  		 * 蓝牙特征值的 uuid
  		 */
  var characteristicId: String
  @JSName("complete")
  var complete_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 蓝牙设备 id，参考 device 对象
  		 */
  var deviceId: String
  @JSName("fail")
  var fail_WriteBLECharacteristicValue: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
  		 * 蓝牙特征值对应服务的 uuid
  		 */
  var serviceId: String
  /**
  		 * 蓝牙设备特征值对应的二进制值
  		 */
  var value: ArrayBuffer
  @JSName("success")
  def success_MWriteBLECharacteristicValue(res: ErrMsgResponse): Unit
}

object WriteBLECharacteristicValue {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: ErrMsgResponse => Unit,
    value: ArrayBuffer,
    complete: () => Unit = null,
    fail: () => Unit = null
  ): WriteBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, success = js.Any.fromFunction1(success), value = value)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    __obj.asInstanceOf[WriteBLECharacteristicValue]
  }
}

