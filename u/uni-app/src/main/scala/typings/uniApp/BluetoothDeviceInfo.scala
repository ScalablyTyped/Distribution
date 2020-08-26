package typings.uniApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BluetoothDeviceInfo extends js.Object {
  /**
    * 当前蓝牙设备的信号强度
    */
  var RSSI: js.UndefOr[Double] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的ManufacturerData数据段 （注意：vConsole 无法打印出 ArrayBuffer 类型数据）
    */
  var advertisData: js.UndefOr[js.Array[_]] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的ServiceUUIDs数据段
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[_]] = js.native
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[String] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的LocalName数据段
    */
  var localName: js.UndefOr[String] = js.native
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[String] = js.native
  /**
    * 当前蓝牙设备的广播数据段中的ServiceData数据段
    */
  var serviceData: js.UndefOr[js.Array[_]] = js.native
}

object BluetoothDeviceInfo {
  @scala.inline
  def apply(): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
  @scala.inline
  implicit class BluetoothDeviceInfoOps[Self <: BluetoothDeviceInfo] (val x: Self) extends AnyVal {
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
    def setRSSI(value: Double): Self = this.set("RSSI", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRSSI: Self = this.set("RSSI", js.undefined)
    @scala.inline
    def setAdvertisDataVarargs(value: js.Any*): Self = this.set("advertisData", js.Array(value :_*))
    @scala.inline
    def setAdvertisData(value: js.Array[_]): Self = this.set("advertisData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisData: Self = this.set("advertisData", js.undefined)
    @scala.inline
    def setAdvertisServiceUUIDsVarargs(value: js.Any*): Self = this.set("advertisServiceUUIDs", js.Array(value :_*))
    @scala.inline
    def setAdvertisServiceUUIDs(value: js.Array[_]): Self = this.set("advertisServiceUUIDs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvertisServiceUUIDs: Self = this.set("advertisServiceUUIDs", js.undefined)
    @scala.inline
    def setDeviceId(value: String): Self = this.set("deviceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceId: Self = this.set("deviceId", js.undefined)
    @scala.inline
    def setLocalName(value: String): Self = this.set("localName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocalName: Self = this.set("localName", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setServiceDataVarargs(value: js.Any*): Self = this.set("serviceData", js.Array(value :_*))
    @scala.inline
    def setServiceData(value: js.Array[_]): Self = this.set("serviceData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceData: Self = this.set("serviceData", js.undefined)
  }
  
}

