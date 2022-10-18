package typings.trezorConnect.libTypescriptTrezorProtobufMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SignedIdentity extends StObject {
  
  var address: String
  
  var public_key: String
  
  var signature: String
}
object SignedIdentity {
  
  inline def apply(address: String, public_key: String, signature: String): SignedIdentity = {
    val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], public_key = public_key.asInstanceOf[js.Any], signature = signature.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignedIdentity]
  }
  
  extension [Self <: SignedIdentity](x: Self) {
    
    inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
    
    inline def setPublic_key(value: String): Self = StObject.set(x, "public_key", value.asInstanceOf[js.Any])
    
    inline def setSignature(value: String): Self = StObject.set(x, "signature", value.asInstanceOf[js.Any])
  }
}
