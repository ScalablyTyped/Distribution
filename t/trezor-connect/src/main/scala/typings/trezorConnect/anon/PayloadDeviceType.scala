package typings.trezorConnect.anon

import typings.trezorConnect.libTypescriptEventsMod.DeviceMessage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PayloadDeviceType
  extends StObject
     with DeviceMessage {
  
  var payload: DeviceType
  
  var `type`: /* "ui-invalid_pin" */ String
}
object PayloadDeviceType {
  
  inline def apply(payload: DeviceType, `type`: /* "ui-invalid_pin" */ String): PayloadDeviceType = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PayloadDeviceType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PayloadDeviceType] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: DeviceType): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-invalid_pin" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
