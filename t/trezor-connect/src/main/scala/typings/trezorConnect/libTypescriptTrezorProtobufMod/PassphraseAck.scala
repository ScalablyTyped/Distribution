package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PassphraseAck extends StObject {
  
  var _state: js.UndefOr[String] = js.undefined
  
  var on_device: js.UndefOr[Boolean] = js.undefined
  
  var passphrase: js.UndefOr[String] = js.undefined
}
object PassphraseAck {
  
  inline def apply(): PassphraseAck = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PassphraseAck]
  }
  
  extension [Self <: PassphraseAck](x: Self) {
    
    inline def setOn_device(value: Boolean): Self = StObject.set(x, "on_device", value.asInstanceOf[js.Any])
    
    inline def setOn_deviceUndefined: Self = StObject.set(x, "on_device", js.undefined)
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setPassphraseUndefined: Self = StObject.set(x, "passphrase", js.undefined)
    
    inline def set_state(value: String): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    
    inline def set_stateUndefined: Self = StObject.set(x, "_state", js.undefined)
  }
}
