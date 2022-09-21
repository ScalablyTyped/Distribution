package typings.trezorConnect.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined trezor-connect.trezor-connect/lib/typescript/trezor/device.DeviceEvent & {  event :/ * "DEVICE_EVENT" * / string} */
trait DeviceEventeventstring extends StObject {
  
  var event: /* "DEVICE_EVENT" */ String
  
  var payload: typings.trezorConnect.deviceMod.Device
  
  var `type`: /* "device-connect" */ String
}
object DeviceEventeventstring {
  
  inline def apply(
    event: /* "DEVICE_EVENT" */ String,
    payload: typings.trezorConnect.deviceMod.Device,
    `type`: /* "device-connect" */ String
  ): DeviceEventeventstring = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeviceEventeventstring]
  }
  
  extension [Self <: DeviceEventeventstring](x: Self) {
    
    inline def setEvent(value: /* "DEVICE_EVENT" */ String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    
    inline def setPayload(value: typings.trezorConnect.deviceMod.Device): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "device-connect" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
