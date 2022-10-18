package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceType extends StObject {
  
  var device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device
  
  var `type`: scala.Unit
}
object DeviceType {
  
  inline def apply(device: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device, `type`: scala.Unit): DeviceType = {
    val __obj = js.Dynamic.literal(device = device.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceType]
  }
  
  extension [Self <: DeviceType](x: Self) {
    
    inline def setDevice(value: typings.trezorConnect.libTypescriptTrezorDeviceMod.Device): Self = StObject.set(x, "device", value.asInstanceOf[js.Any])
    
    inline def setType(value: scala.Unit): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
