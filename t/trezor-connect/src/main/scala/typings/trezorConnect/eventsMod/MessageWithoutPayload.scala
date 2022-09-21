package typings.trezorConnect.eventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageWithoutPayload
  extends StObject
     with _UiEvent {
  
  var payload: scala.Unit
  
  var `type`: /* "ui-request_window" */ String
}
object MessageWithoutPayload {
  
  inline def apply(payload: scala.Unit, `type`: /* "ui-request_window" */ String): MessageWithoutPayload = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWithoutPayload]
  }
  
  extension [Self <: MessageWithoutPayload](x: Self) {
    
    inline def setPayload(value: scala.Unit): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-request_window" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
