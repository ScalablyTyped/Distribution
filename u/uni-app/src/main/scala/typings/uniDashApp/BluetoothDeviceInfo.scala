package typings.uniDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BluetoothDeviceInfo extends js.Object {
  /**
    * 当前蓝牙设备的信号强度
    */
  var RSSI: js.UndefOr[Double] = js.undefined
  /**
    * 当前蓝牙设备的广播数据段中的ManufacturerData数据段 （注意：vConsole 无法打印出 ArrayBuffer 类型数据）
    */
  var advertisData: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 当前蓝牙设备的广播数据段中的ServiceUUIDs数据段
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * 用于区分设备的 id
    */
  var deviceId: js.UndefOr[String] = js.undefined
  /**
    * 当前蓝牙设备的广播数据段中的LocalName数据段
    */
  var localName: js.UndefOr[String] = js.undefined
  /**
    * 蓝牙设备名称，某些设备可能没有
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * 当前蓝牙设备的广播数据段中的ServiceData数据段
    */
  var serviceData: js.UndefOr[js.Array[_]] = js.undefined
}

object BluetoothDeviceInfo {
  @scala.inline
  def apply(
    RSSI: Int | Double = null,
    advertisData: js.Array[_] = null,
    advertisServiceUUIDs: js.Array[_] = null,
    deviceId: String = null,
    localName: String = null,
    name: String = null,
    serviceData: js.Array[_] = null
  ): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    if (RSSI != null) __obj.updateDynamic("RSSI")(RSSI.asInstanceOf[js.Any])
    if (advertisData != null) __obj.updateDynamic("advertisData")(advertisData.asInstanceOf[js.Any])
    if (advertisServiceUUIDs != null) __obj.updateDynamic("advertisServiceUUIDs")(advertisServiceUUIDs.asInstanceOf[js.Any])
    if (deviceId != null) __obj.updateDynamic("deviceId")(deviceId.asInstanceOf[js.Any])
    if (localName != null) __obj.updateDynamic("localName")(localName.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (serviceData != null) __obj.updateDynamic("serviceData")(serviceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
}

