package typings.systeminformation.mod.Systeminformation

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BluetoothDeviceData extends StObject {
  
  var batteryPercent: Double
  
  var connected: Boolean
  
  var device: String
  
  var macDevice: String
  
  var macHost: String
  
  var manufacturer: String
  
  var name: String
  
  var `type`: String
}
object BluetoothDeviceData {
  
  inline def apply(
    batteryPercent: Double,
    connected: Boolean,
    device: String,
    macDevice: String,
    macHost: String,
    manufacturer: String,
    name: String,
    `type`: String
  ): BluetoothDeviceData = {
    val __obj = js.Dynamic.literal(batteryPercent = batteryPercent.asInstanceOf[js.Any], connected = connected.asInstanceOf[js.Any], device = device.asInstanceOf[js.Any], macDevice = macDevice.asInstanceOf[js.Any], macHost = macHost.asInstanceOf[js.Any], manufacturer = manufacturer.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[BluetoothDeviceData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BluetoothDeviceData] (val x: Self) extends AnyVal {
    
    inline def setBatteryPercent(value: Double): Self = StObject.set(x, "batteryPercent", value.asInstanceOf[js.Any])
    
    inline def setConnected(value: Boolean): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
    
    inline def setDevice(value: String): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setMacDevice(value: String): Self = StObject.set(x, "macDevice", value.asInstanceOf[js.Any])
    
    inline def setMacHost(value: String): Self = StObject.set(x, "macHost", value.asInstanceOf[js.Any])
    
    inline def setManufacturer(value: String): Self = StObject.set(x, "manufacturer", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
