package typings.weixinDashApp.wx

import typings.weixinDashApp.Anon_Characteristic
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
  def success_MReadBLECharacteristicValue(res: Anon_Characteristic with ErrMsgResponse): Unit
}

object ReadBLECharacteristicValue {
  @scala.inline
  def apply(
    characteristicId: String,
    deviceId: String,
    serviceId: String,
    success: Anon_Characteristic with ErrMsgResponse => Unit,
    complete: /* res */ js.Any => Unit = null,
    fail: js.Any => Unit = null
  ): ReadBLECharacteristicValue = {
    val __obj = js.Dynamic.literal(characteristicId = characteristicId, deviceId = deviceId, serviceId = serviceId, success = js.Any.fromFunction1(success))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction1(fail))
    __obj.asInstanceOf[ReadBLECharacteristicValue]
  }
}

@JSGlobal("wx.readBLECharacteristicValue")
@js.native
object readBLECharacteristicValue extends js.Object {
  /**
  	 * 读取低功耗蓝牙设备的特征值的二进制数据值。
  	 * 注意：必须设备的特征值支持read才可以成功调用，具体参照 characteristic 的 properties 属性
  	 */
  def apply(options: ReadBLECharacteristicValue): Unit = js.native
}

