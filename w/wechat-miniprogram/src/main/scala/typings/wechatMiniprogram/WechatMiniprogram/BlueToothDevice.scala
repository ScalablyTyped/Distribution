package typings.wechatMiniprogram.WechatMiniprogram

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BlueToothDevice extends StObject {
  
  /** 当前蓝牙设备的信号强度 */
  var RSSI: Double = js.native
  
  /** 当前蓝牙设备的广播数据段中的 ManufacturerData 数据段。 */
  var advertisData: ArrayBuffer = js.native
  
  /** 当前蓝牙设备的广播数据段中的 ServiceUUIDs 数据段 */
  var advertisServiceUUIDs: js.Array[String] = js.native
  
  /** 用于区分设备的 id */
  var deviceId: String = js.native
  
  /** 当前蓝牙设备的广播数据段中的 LocalName 数据段 */
  var localName: String = js.native
  
  /** 蓝牙设备名称，某些设备可能没有 */
  var name: String = js.native
  
  /** 当前蓝牙设备的广播数据段中的 ServiceData 数据段 */
  var serviceData: IAnyObject = js.native
}
object BlueToothDevice {
  
  @scala.inline
  def apply(
    RSSI: Double,
    advertisData: ArrayBuffer,
    advertisServiceUUIDs: js.Array[String],
    deviceId: String,
    localName: String,
    name: String,
    serviceData: IAnyObject
  ): BlueToothDevice = {
    val __obj = js.Dynamic.literal(RSSI = RSSI.asInstanceOf[js.Any], advertisData = advertisData.asInstanceOf[js.Any], advertisServiceUUIDs = advertisServiceUUIDs.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], localName = localName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], serviceData = serviceData.asInstanceOf[js.Any])
    __obj.asInstanceOf[BlueToothDevice]
  }
  
  @scala.inline
  implicit class BlueToothDeviceMutableBuilder[Self <: BlueToothDevice] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdvertisData(value: ArrayBuffer): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisServiceUUIDs(value: js.Array[String]): Self = StObject.set(x, "advertisServiceUUIDs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAdvertisServiceUUIDsVarargs(value: String*): Self = StObject.set(x, "advertisServiceUUIDs", js.Array(value :_*))
    
    @scala.inline
    def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceData(value: IAnyObject): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
  }
}
