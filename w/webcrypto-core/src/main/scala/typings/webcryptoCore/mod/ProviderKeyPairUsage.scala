package typings.webcryptoCore.mod

import typings.std.KeyUsage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProviderKeyPairUsage extends StObject {
  
  var privateKey: KeyUsages
  
  var publicKey: KeyUsages
}
object ProviderKeyPairUsage {
  
  inline def apply(privateKey: KeyUsages, publicKey: KeyUsages): ProviderKeyPairUsage = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProviderKeyPairUsage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProviderKeyPairUsage] (val x: Self) extends AnyVal {
    
    inline def setPrivateKey(value: KeyUsages): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyVarargs(value: KeyUsage*): Self = StObject.set(x, "privateKey", js.Array(value*))
    
    inline def setPublicKey(value: KeyUsages): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyVarargs(value: KeyUsage*): Self = StObject.set(x, "publicKey", js.Array(value*))
  }
}
