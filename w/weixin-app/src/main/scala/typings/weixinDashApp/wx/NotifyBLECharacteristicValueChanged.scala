package typings.weixinDashApp.wx

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
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, state = state, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChanged]
  }
}

@JSGlobal("wx.notifyBLECharacteristicValueChanged")
@js.native
object notifyBLECharacteristicValueChanged extends js.Object {
  /**
  	 * 启用低功耗蓝牙设备特征值变化时的 notify 功能。
  	 * 注意：必须设备的特征值支持notify才可以成功调用，具体参照 characteristic 的 properties 属性
  	 * 另外，必须先启用notify才能监听到设备 characteristicValueChange 事件
  	 */
  def apply(options: NotifyBLECharacteristicValueChanged): Unit = js.native
}

