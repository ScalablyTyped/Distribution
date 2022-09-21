package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devices extends StObject {
  
  var devices: js.Array[typings.trezorConnect.deviceMod.Device]
  
  var webusb: Boolean
}
object Devices {
  
  inline def apply(devices: js.Array[typings.trezorConnect.deviceMod.Device], webusb: Boolean): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], webusb = webusb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  extension [Self <: Devices](x: Self) {
    
    inline def setDevices(value: js.Array[typings.trezorConnect.deviceMod.Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: typings.trezorConnect.deviceMod.Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setWebusb(value: Boolean): Self = StObject.set(x, "webusb", value.asInstanceOf[js.Any])
  }
}
