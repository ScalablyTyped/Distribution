package typings.trezorConnect.libTypescriptEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivePin
  extends StObject
     with UiResponse {
  
  var payload: String
  
  var `type`: /* "ui-receive_pin" */ String
}
object ReceivePin {
  
  inline def apply(payload: String, `type`: /* "ui-receive_pin" */ String): ReceivePin = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivePin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceivePin] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-receive_pin" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
