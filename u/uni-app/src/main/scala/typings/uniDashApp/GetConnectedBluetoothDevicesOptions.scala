package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetConnectedBluetoothDevicesOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 蓝牙设备主 service 的 uuid 列表
    */
  var services: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ GetConnectedBluetoothDevicesSuccess, Unit]] = js.undefined
}

object GetConnectedBluetoothDevicesOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    fail: () => Unit = null,
    services: js.Array[_] = null,
    success: /* result */ GetConnectedBluetoothDevicesSuccess => Unit = null
  ): GetConnectedBluetoothDevicesOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (services != null) __obj.updateDynamic("services")(services)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetConnectedBluetoothDevicesOptions]
  }
}

