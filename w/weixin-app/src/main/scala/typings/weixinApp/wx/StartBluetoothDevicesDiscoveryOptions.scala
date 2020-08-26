package typings.weixinApp.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartBluetoothDevicesDiscoveryOptions
  extends BaseOptions[js.Any, js.Any] {
  /**
    * 否允许重复上报同一设备， 如果允许重复上报，则onDeviceFound 方法会多次上报同一设备，但是 RSSI 值会有不同
    */
  var allowDuplicatesKey: js.UndefOr[Boolean] = js.native
  /**
    * 上报设备的间隔，默认为0，意思是找到新设备立即上报，否则根据传入的间隔上报
    */
  var interval: js.UndefOr[Double] = js.native
  /**
    * 蓝牙设备主 service 的 uuid 列表
    * 某些蓝牙设备会广播自己的主 service 的 uuid。如果这里传入该数组，那么根据该 uuid 列表，只搜索有这个主服务的设备。
    */
  var services: js.UndefOr[js.Array[String]] = js.native
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
    def setInterval(value: Double): Self = this.set("interval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
    @scala.inline
    def setServicesVarargs(value: String*): Self = this.set("services", js.Array(value :_*))
    @scala.inline
    def setServices(value: js.Array[String]): Self = this.set("services", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServices: Self = this.set("services", js.undefined)
  }
  
}

