package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ```asn
  * OneAsymmetricKey ::= SEQUENCE {
  *   version Version,
  *   privateKeyAlgorithm PrivateKeyAlgorithmIdentifier,
  *   privateKey PrivateKey,
  *   attributes [0] IMPLICIT Attributes OPTIONAL,
  *   ...,
  *   [[2: publicKey [1] IMPLICIT PublicKey OPTIONAL ]],
  *   ...
  * }
  *
  * PrivateKey ::= OCTET STRING
  *
  * PublicKey ::= BIT STRING
  * ```
  */
trait OneAsymmetricKey
  extends StObject
     with PrivateKeyInfo {
  
  var publicKey: js.UndefOr[js.typedarray.ArrayBuffer] = js.undefined
}
object OneAsymmetricKey {
  
  inline def apply(privateKey: js.typedarray.ArrayBuffer, privateKeyAlgorithm: AlgorithmIdentifier1, version: Double): OneAsymmetricKey = {
    val __obj = js.Dynamic.literal(privateKey = privateKey.asInstanceOf[js.Any], privateKeyAlgorithm = privateKeyAlgorithm.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[OneAsymmetricKey]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OneAsymmetricKey] (val x: Self) extends AnyVal {
    
    inline def setPublicKey(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setPublicKeyUndefined: Self = StObject.set(x, "publicKey", js.undefined)
  }
}
