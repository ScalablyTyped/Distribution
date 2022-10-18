package typings.trezorConnect.libTypescriptEventsMod

import typings.trezorConnect.anon.CustomCancelButton
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestConfirmation
  extends StObject
     with _UiEvent {
  
  var payload: CustomCancelButton
  
  var `type`: /* "ui-request_confirmation" */ String
}
object RequestConfirmation {
  
  inline def apply(payload: CustomCancelButton, `type`: /* "ui-request_confirmation" */ String): RequestConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestConfirmation]
  }
  
  extension [Self <: RequestConfirmation](x: Self) {
    
    inline def setPayload(value: CustomCancelButton): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-request_confirmation" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
