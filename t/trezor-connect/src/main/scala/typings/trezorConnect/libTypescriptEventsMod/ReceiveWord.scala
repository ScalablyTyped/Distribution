package typings.trezorConnect.libTypescriptEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceiveWord
  extends StObject
     with UiResponse {
  
  var payload: String
  
  var `type`: /* "ui-receive_word" */ String
}
object ReceiveWord {
  
  inline def apply(payload: String, `type`: /* "ui-receive_word" */ String): ReceiveWord = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveWord]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReceiveWord] (val x: Self) extends AnyVal {
    
    inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-receive_word" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
