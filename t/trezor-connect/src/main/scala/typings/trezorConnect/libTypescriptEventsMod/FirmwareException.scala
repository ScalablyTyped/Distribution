package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.libTypescriptTrezorDeviceMod.Device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirmwareException extends StObject {
  
  var payload: Device
  
  var `type`: /* "ui-device_firmware_old" */ String
}
object FirmwareException {
  
  inline def apply(payload: Device, `type`: /* "ui-device_firmware_old" */ String): FirmwareException = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirmwareException]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FirmwareException] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Device): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-device_firmware_old" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
