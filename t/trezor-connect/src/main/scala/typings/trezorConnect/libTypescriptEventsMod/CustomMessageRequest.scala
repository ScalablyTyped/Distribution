package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomMessageRequest
  extends StObject
     with UiResponse
     with _UiEvent {
  
  var payload: Message
  
  var `type`: /* "ui-custom_request" */ String
}
object CustomMessageRequest {
  
  inline def apply(payload: Message, `type`: /* "ui-custom_request" */ String): CustomMessageRequest = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomMessageRequest]
  }
  
  extension [Self <: CustomMessageRequest](x: Self) {
    
    inline def setPayload(value: Message): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-custom_request" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
