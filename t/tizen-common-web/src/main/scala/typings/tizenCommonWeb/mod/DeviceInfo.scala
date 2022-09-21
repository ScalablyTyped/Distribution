package typings.tizenCommonWeb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceInfo extends StObject {
  
  /**
    * The version of specification which the device's data model is implemented
    */
  val dataModelVersion: String | Null
  
  /**
    * The device name
    */
  val deviceName: String | Null
  
  /**
    * The unique identifier for OIC device.
    */
  val oicDeviceId: String | Null
  
  /**
    * The version of core specification.
    */
  val specVersion: String | Null
}
object DeviceInfo {
  
  inline def apply(): DeviceInfo = {
    val __obj = js.Dynamic.literal(dataModelVersion = null, deviceName = null, oicDeviceId = null, specVersion = null)
    __obj.asInstanceOf[DeviceInfo]
  }
  
  extension [Self <: DeviceInfo](x: Self) {
    
    inline def setDataModelVersion(value: String): Self = StObject.set(x, "dataModelVersion", value.asInstanceOf[js.Any])
    
    inline def setDataModelVersionNull: Self = StObject.set(x, "dataModelVersion", null)
    
    inline def setDeviceName(value: String): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameNull: Self = StObject.set(x, "deviceName", null)
    
    inline def setOicDeviceId(value: String): Self = StObject.set(x, "oicDeviceId", value.asInstanceOf[js.Any])
    
    inline def setOicDeviceIdNull: Self = StObject.set(x, "oicDeviceId", null)
    
    inline def setSpecVersion(value: String): Self = StObject.set(x, "specVersion", value.asInstanceOf[js.Any])
    
    inline def setSpecVersionNull: Self = StObject.set(x, "specVersion", null)
  }
}
