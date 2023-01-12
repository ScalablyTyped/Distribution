package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Devices extends StObject {
  
  var devices: js.Array[typings.trezorConnect.libTypescriptTrezorDeviceMod.Device]
  
  var webusb: Boolean
}
object Devices {
  
  inline def apply(devices: js.Array[typings.trezorConnect.libTypescriptTrezorDeviceMod.Device], webusb: Boolean): Devices = {
    val __obj = js.Dynamic.literal(devices = devices.asInstanceOf[js.Any], webusb = webusb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Devices]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Devices] (val x: Self) extends AnyVal {
    
    inline def setDevices(value: js.Array[typings.trezorConnect.libTypescriptTrezorDeviceMod.Device]): Self = StObject.set(x, "devices", value.asInstanceOf[js.Any])
    
    inline def setDevicesVarargs(value: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device*): Self = StObject.set(x, "devices", js.Array(value*))
    
    inline def setWebusb(value: Boolean): Self = StObject.set(x, "webusb", value.asInstanceOf[js.Any])
  }
}
