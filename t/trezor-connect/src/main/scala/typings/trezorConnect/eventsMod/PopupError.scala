package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.ErrorString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupError extends StObject {
  
  var payload: ErrorString
  
  var `type`: /* "popup-error" */ String
}
object PopupError {
  
  inline def apply(payload: ErrorString, `type`: /* "popup-error" */ String): PopupError = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupError]
  }
  
  extension [Self <: PopupError](x: Self) {
    
    inline def setPayload(value: ErrorString): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "popup-error" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
