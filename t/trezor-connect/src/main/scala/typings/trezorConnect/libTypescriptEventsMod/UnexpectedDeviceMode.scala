package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.libTypescriptTrezorDeviceMod.Device
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnexpectedDeviceMode
  extends StObject
     with _UiEvent {
  
  var payload: Device
  
  var `type`: /* "ui-device_bootloader_mode" */ String
}
object UnexpectedDeviceMode {
  
  inline def apply(payload: Device, `type`: /* "ui-device_bootloader_mode" */ String): UnexpectedDeviceMode = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnexpectedDeviceMode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UnexpectedDeviceMode] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Device): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-device_bootloader_mode" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
