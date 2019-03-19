package typings
package uniDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NotifyBLECharacteristicValueChangeOptions extends js.Object {
  /**
    * 蓝牙特征值的 uuid
    */
  var characteristicId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * 蓝牙特征值对应服务的 uuid
    */
  var serviceId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * true: 启用 notify; false: 停用 notify
    */
  var state: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ StopBluetoothDevicesDiscoverySuccess, scala.Unit]] = js.undefined
}

object NotifyBLECharacteristicValueChangeOptions {
  @scala.inline
  def apply(
    characteristicId: java.lang.String = null,
    complete: () => scala.Unit = null,
    deviceId: java.lang.String = null,
    fail: () => scala.Unit = null,
    serviceId: java.lang.String = null,
    state: js.UndefOr[scala.Boolean] = js.undefined,
    success: /* result */ StopBluetoothDevicesDiscoverySuccess => scala.Unit = null
  ): NotifyBLECharacteristicValueChangeOptions = {
    val __obj = js.Dynamic.literal()
    if (characteristicId != null) __obj.updateDynamic("characteristicId")(characteristicId)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId)
    if (!js.isUndefined(state)) __obj.updateDynamic("state")(state)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[NotifyBLECharacteristicValueChangeOptions]
  }
}

