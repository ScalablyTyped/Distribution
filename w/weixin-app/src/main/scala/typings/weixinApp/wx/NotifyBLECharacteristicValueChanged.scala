package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBLECharacteristicValueChanged
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
  /**
    * true: 启用 notify; false: 停用 notify
    */
  var state: Boolean
  @JSName("success")
  def success_MNotifyBLECharacteristicValueChanged(res: ErrMsgResponse): Unit
}

object NotifyBLECharacteristicValueChanged {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    state: Boolean,
    success: ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): NotifyBLECharacteristicValueChanged = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChanged]
  }
}

