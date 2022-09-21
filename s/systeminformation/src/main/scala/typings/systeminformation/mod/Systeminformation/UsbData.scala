package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsbData extends StObject {
  
  var bus: Double
  
  var deviceId: Double
  
  var id: Double | String
  
  var manufacturer: String
  
  var maxPower: String
  
  var name: String
  
  var removable: Boolean
  
  var serialNumber: String
  
  var `type`: String
  
  var vendor: String
}
object UsbData {
  
  inline def apply(
    bus: Double,
    deviceId: Double,
    id: Double | String,
    manufacturer: String,
    maxPower: String,
    name: String,
    removable: Boolean,
    serialNumber: String,
    `type`: String,
    vendor: String
  ): UsbData = {
    val __obj = js.Dynamic.literal(bus = bus.asInstanceOf[js.Any], deviceId = deviceId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], maxPower = maxPower.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], removable = removable.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], vendor = vendor.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsbData]
  }
  
  extension [Self <: UsbData](x: Self) {
    
    inline def setBus(value: Double): Self = StObject.set(x, "bus", value.asInstanceOf[js.Any])
    
    inline def setDeviceId(value: Double): Self = StObject.set(x, "deviceId", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double | String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setMaxPower(value: String): Self = StObject.set(x, "maxPower", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setRemovable(value: Boolean): Self = StObject.set(x, "removable", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVendor(value: String): Self = StObject.set(x, "vendor", value.asInstanceOf[js.Any])
  }
}
