package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBluetoothDevicesDiscoveryOptions extends js.Object {
  /**
    * 是否允许重复上报同一设备， 如果允许重复上报，则onDeviceFound 方法会多次上报同一设备，但是 RSSI 值会有不同
    */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.native
  /**
    * 接口调用结束的回调函数（调用成功、失败都会执行）
    */
  var complete: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 接口调用失败的回调函数
    */
  var fail: js.UndefOr[js.Function0[Unit]] = js.native
  /**
    * 上报设备的间隔，默认为0，意思是找到新设备立即上报，否则根据传入的间隔上报
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * 蓝牙设备主 service 的 uuid 列表
    */
  var services: js.UndefOr[js.Array[_]] = js.native
  /**
    * 成功则返回本机蓝牙适配器状态
    */
  var success: js.UndefOr[js.Function0[Unit]] = js.native
}

object StartBluetoothDevicesDiscoveryOptions {
  @scala.inline
  def apply(): StartBluetoothDevicesDiscoveryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartBluetoothDevicesDiscoveryOptions]
  }
  @scala.inline
  implicit class StartBluetoothDevicesDiscoveryOptionsOps[Self <: StartBluetoothDevicesDiscoveryOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllowDuplicatesKey(value: Boolean): Self = this.set("allowDuplicatesKey", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowDuplicatesKey: Self = this.set("allowDuplicatesKey", js.undefined)
    @scala.inline
    def setComplete(value: () => Unit): Self = this.set("complete", js.Any.fromFunction0(value))
    @scala.inline
    def deleteComplete: Self = this.set("complete", js.undefined)
    @scala.inline
    def setFail(value: () => Unit): Self = this.set("fail", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFail: Self = this.set("fail", js.undefined)
    @scala.inline
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setServicesVarargs(value: js.Any*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[_]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
    @scala.inline
    def setSuccess(value: () => Unit): Self = this.set("success", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

