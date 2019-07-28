package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartBluetoothDevicesDiscoveryOptions extends js.Object {
  /**
    * 是否允许重复上报同一设备， 如果允许重复上报，则onDeviceFound 方法会多次上报同一设备，但是 RSSI 值会有不同
    */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.undefined
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.undefined
  /**
    * 上报设备的间隔，默认为0，意思是找到新设备立即上报，否则根据传入的间隔上报
    */
  var interval: js.UndefOr[Double] = js.undefined
  /**
    * 蓝牙设备主 service 的 uuid 列表
    */
  var services: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.undefined
}

object StartBluetoothDevicesDiscoveryOptions {
  @scala.inline
  def apply(
    allowDuplicatesKey: js.UndefOr[Boolean] = js.undefined,
    complete: () => Unit = null,
    fail: () => Unit = null,
    interval: Int | Double = null,
    services: js.Array[_] = null,
    success: () => Unit = null
  ): StartBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowDuplicatesKey)) __obj.updateDynamic("allowDuplicatesKey")(allowDuplicatesKey)
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction0(complete))
    if (fail != null) __obj.updateDynamic("fail")(js.Any.fromFunction0(fail))
    if (interval != null) __obj.updateDynamic("interval")(interval.asInstanceOf[js.Any])
    if (services != null) __obj.updateDynamic("services")(services)
    if (success != null) __obj.updateDynamic("success")(js.Any.fromFunction0(success))
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOptions]
  }
}

