package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Initialize extends StObject {
  
  var _skip_passphrase: js.UndefOr[Boolean] = js.undefined
  
  var derive_cardano: js.UndefOr[Boolean] = js.undefined
  
  var session_id: js.UndefOr[String] = js.undefined
}
object Initialize {
  
  inline def apply(): Initialize = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Initialize]
  }
  
  extension [Self <: Initialize](x: Self) {
    
    inline def setDerive_cardano(value: Boolean): Self = StObject.set(x, "derive_cardano", value.asInstanceOf[js.Any])
    
    inline def setDerive_cardanoUndefined: Self = StObject.set(x, "derive_cardano", js.undefined)
    
    inline def setSession_id(value: String): Self = StObject.set(x, "session_id", value.asInstanceOf[js.Any])
    
    inline def setSession_idUndefined: Self = StObject.set(x, "session_id", js.undefined)
    
    inline def set_skip_passphrase(value: Boolean): Self = StObject.set(x, "_skip_passphrase", value.asInstanceOf[js.Any])
    
    inline def set_skip_passphraseUndefined: Self = StObject.set(x, "_skip_passphrase", js.undefined)
  }
}
