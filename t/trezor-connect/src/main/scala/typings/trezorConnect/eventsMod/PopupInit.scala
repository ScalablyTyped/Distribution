package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.Settings
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupInit extends StObject {
  
  var payload: Settings
  
  var `type`: /* "popup-init" */ String
}
object PopupInit {
  
  inline def apply(payload: Settings, `type`: /* "popup-init" */ String): PopupInit = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupInit]
  }
  
  extension [Self <: PopupInit](x: Self) {
    
    inline def setPayload(value: Settings): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "popup-init" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
