package typings.trezorConnect.eventsMod

import typings.trezorConnect.anon.PassphraseOnDevice
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReceivePassphrase
  extends StObject
     with UiResponse {
  
  var payload: PassphraseOnDevice
  
  var `type`: /* "ui-receive_passphrase" */ String
}
object ReceivePassphrase {
  
  inline def apply(payload: PassphraseOnDevice, `type`: /* "ui-receive_passphrase" */ String): ReceivePassphrase = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceivePassphrase]
  }
  
  extension [Self <: ReceivePassphrase](x: Self) {
    
    inline def setPayload(value: PassphraseOnDevice): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    
    inline def setType(value: /* "ui-receive_passphrase" */ String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
