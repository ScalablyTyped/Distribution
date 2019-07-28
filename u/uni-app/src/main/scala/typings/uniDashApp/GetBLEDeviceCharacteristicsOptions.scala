package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBLEDeviceCharacteristicsOptions extends js.Object {
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 蓝牙设备 id，参考 device 对象
    */
  var deviceId: js.UndefOr[String] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 蓝牙服务 uuid
    */
  var serviceId: js.UndefOr[String] = js.undefined
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function1[/* result */ GetBLEDeviceCharacteristicsSuccess, Unit]] = js.undefined
}

object GetBLEDeviceCharacteristicsOptions {
  @scala.inline
  def apply(
    complete: () => Unit = null,
    deviceId: String = null,
    fail: () => Unit = null,
    serviceId: String = null,
    success: /* result */ GetBLEDeviceCharacteristicsSuccess => Unit = null
  ): GetBLEDeviceCharacteristicsOptions = {
    val __obj = js.Dynamic.literal()
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId)
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (serviceId != null) __obj.updateDynamic("serviceId")(serviceId)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction1(success))
    __obj.asInstanceOf[GetBLEDeviceCharacteristicsOptions]
  }
}

