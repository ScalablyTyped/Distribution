package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Devices
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SelectDevice
  extends StObject
     with _UiEvent {
  
  var payload: Devices
  
  var `type`: /* "ui-select_device" */ String
}
object SelectDevice {
  
  inline def apply(payload: Devices, `type`: /* "ui-select_device" */ String): SelectDevice = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectDevice]
  }
  
  extension [Self <: SelectDevice](x: Self) {
    
    inline def setPayload(value: Devices): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-select_device" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
