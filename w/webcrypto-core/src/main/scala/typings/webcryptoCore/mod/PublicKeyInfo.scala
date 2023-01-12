package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PublicKeyInfo extends StObject {
  
  var publicKey: js.typedarray.ArrayBuffer
  
  var publicKeyAlgorithm: AlgorithmIdentifier1
}
object PublicKeyInfo {
  
  inline def apply(publicKey: js.typedarray.ArrayBuffer, publicKeyAlgorithm: AlgorithmIdentifier1): PublicKeyInfo = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], publicKeyAlgorithm = publicKeyAlgorithm.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublicKeyInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PublicKeyInfo] (val x: Self) extends AnyVal {
    
    inline def setPublicKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyAlgorithm(value: AlgorithmIdentifier1): Self = StObject.set(x, "publicKeyAlgorithm", value.asInstanceOf[js.Any])
  }
}
