package typings.trezorConnect.libTypescriptEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveConfirmation
  extends StObject
     with UiResponse {
  
  var payload: Boolean
  
  var `type`: /* "ui-receive_confirmation" */ String
}
object ReceiveConfirmation {
  
  inline def apply(payload: Boolean, `type`: /* "ui-receive_confirmation" */ String): ReceiveConfirmation = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveConfirmation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiveConfirmation] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-receive_confirmation" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
