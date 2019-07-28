package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnBLECharacteristicValueChangeSuccess extends js.Object {
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: js.UndefOr[String] = js.undefined
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[String] = js.undefined
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: js.UndefOr[String] = js.undefined
  /**
    * 特征值最新的值 （注意：vConsole 无法打印出 ArrayBuffer 类型数据）
    */
  var value: js.UndefOr[js.Array[_]] = js.undefined
}

object OnBLECharacteristicValueChangeSuccess {
  @scala.inline
  def apply(
    characteristicId: String = null,
    deviceId: String = null,
    serviceId: String = null,
    value: js.Array[_] = null
  ): OnBLECharacteristicValueChangeSuccess = {
    val __obj = js.Dynamic.literal()
    if (characteristicId != null) __obj.updateDynamic("characteristicId")(characteristicId)
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[OnBLECharacteristicValueChangeSuccess]
  }
}

