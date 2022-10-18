package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptEventsMod.DeviceMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadDevice
  extends StObject
     with DeviceMessage {
  
  var payload: Device
  
  var `type`: /* "ui-request_pin" */ String
}
object PayloadDevice {
  
  inline def apply(payload: Device, `type`: /* "ui-request_pin" */ String): PayloadDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadDevice]
  }
  
  extension [Self <: PayloadDevice](x: Self) {
    
    inline def setPayload(value: Device): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-request_pin" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
