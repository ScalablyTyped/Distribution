package typings.tabris.anon

import typings.tabris.CryptoKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrivateKey extends StObject {
  
  var privateKey: CryptoKey
  
  var publicKey: CryptoKey
}
object PrivateKey {
  
  inline def apply(privateKey: CryptoKey, publicKey: CryptoKey): PrivateKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrivateKey]
  }
  
  extension [Self <: PrivateKey](x: Self) {
    
    inline def setPrivateKey(value: CryptoKey): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKey(value: CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
  }
}
