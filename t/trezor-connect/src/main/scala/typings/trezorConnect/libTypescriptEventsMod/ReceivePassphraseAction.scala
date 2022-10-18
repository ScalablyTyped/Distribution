package typings.trezorConnect.libTypescriptEventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivePassphraseAction
  extends StObject
     with UiResponse {
  
  var payload: Boolean
  
  var `type`: /* "ui-invalid_passphrase_action" */ String
}
object ReceivePassphraseAction {
  
  inline def apply(payload: Boolean, `type`: /* "ui-invalid_passphrase_action" */ String): ReceivePassphraseAction = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivePassphraseAction]
  }
  
  extension [Self <: ReceivePassphraseAction](x: Self) {
    
    inline def setPayload(value: Boolean): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-invalid_passphrase_action" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
