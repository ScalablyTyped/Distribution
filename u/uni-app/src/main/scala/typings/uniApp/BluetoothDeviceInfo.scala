package typings.uniApp

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDeviceInfo extends StObject {
  
  /**
    * 当前蓝牙设备的信号强度
    */
  var RSSI: js.UndefOr[Double] = js.undefined
  
  /**
    * 当前蓝牙设备的广播数据段中的ManufacturerData数据段 （注意：vConsole 无法打印出 ArrayBuffer 类型数据）
    */
  var advertisData: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * 当前蓝牙设备的广播数据段中的ServiceUUIDs数据段
    */
  var advertisServiceUUIDs: js.UndefOr[js.Array[Any]] = js.undefined
  
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
  var serviceData: js.UndefOr[js.Array[Any]] = js.undefined
}
object BluetoothDeviceInfo {
  
  inline def apply(): BluetoothDeviceInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BluetoothDeviceInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothDeviceInfo] (val x: Self) extends AnyVal {
    
    inline def setAdvertisData(value: js.Array[Any]): Self = StObject.set(x, "advertisData", value.asInstanceOf[js.Any])
    
    inline def setAdvertisDataUndefined: Self = StObject.set(x, "advertisData", js.undefined)
    
    inline def setAdvertisDataVarargs(value: Any*): Self = StObject.set(x, "advertisData", js.Array(value*))
    
    inline def setAdvertisServiceUUIDs(value: js.Array[Any]): Self = StObject.set(x, "advertisServiceUUIDs", value.asInstanceOf[js.Any])
    
    inline def setAdvertisServiceUUIDsUndefined: Self = StObject.set(x, "advertisServiceUUIDs", js.undefined)
    
    inline def setAdvertisServiceUUIDsVarargs(value: Any*): Self = StObject.set(x, "advertisServiceUUIDs", js.Array(value*))
    
    inline def setDeviceId(value: String): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setDeviceIdUndefined: Self = StObject.set(x, "deviceId", js.undefined)
    
    inline def setLocalName(value: String): Self = StObject.set(x, "localName", value.asInstanceOf[js.Any])
    
    inline def setLocalNameUndefined: Self = StObject.set(x, "localName", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRSSI(value: Double): Self = StObject.set(x, "RSSI", value.asInstanceOf[js.Any])
    
    inline def setRSSIUndefined: Self = StObject.set(x, "RSSI", js.undefined)
    
    inline def setServiceData(value: js.Array[Any]): Self = StObject.set(x, "serviceData", value.asInstanceOf[js.Any])
    
    inline def setServiceDataUndefined: Self = StObject.set(x, "serviceData", js.undefined)
    
    inline def setServiceDataVarargs(value: Any*): Self = StObject.set(x, "serviceData", js.Array(value*))
  }
}
