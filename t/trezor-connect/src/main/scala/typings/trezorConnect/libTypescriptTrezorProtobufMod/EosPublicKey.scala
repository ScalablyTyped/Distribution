package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EosPublicKey extends StObject {
  
  var raw_public_key: String
  
  var wif_public_key: String
}
object EosPublicKey {
  
  inline def apply(raw_public_key: String, wif_public_key: String): EosPublicKey = {
    val __obj = js.Dynamic.literal(raw_public_key = raw_public_key.asInstanceOf[js.Any], wif_public_key = wif_public_key.asInstanceOf[js.Any])
    __obj.asInstanceOf[EosPublicKey]
  }
  
  extension [Self <: EosPublicKey](x: Self) {
    
    inline def setRaw_public_key(value: String): Self = StObject.set(x, "raw_public_key", value.asInstanceOf[js.Any])
    
    inline def setWif_public_key(value: String): Self = StObject.set(x, "wif_public_key", value.asInstanceOf[js.Any])
  }
}
