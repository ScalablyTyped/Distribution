package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.Method
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PopupHandshake
  extends StObject
     with _UiEvent {
  
  var payload: js.UndefOr[Method] = js.undefined
  
  var `type`: /* "popup-handshake" */ String
}
object PopupHandshake {
  
  inline def apply(`type`: /* "popup-handshake" */ String): PopupHandshake = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PopupHandshake]
  }
  
  extension [Self <: PopupHandshake](x: Self) {
    
    inline def setPayload(value: Method): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setPayloadUndefined: Self = StObject.set(x, "payload", js.undefined)
    
    inline def setType(value: /* "popup-handshake" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
