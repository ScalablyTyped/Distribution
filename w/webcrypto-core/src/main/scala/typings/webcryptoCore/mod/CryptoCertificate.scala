package typings.webcryptoCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoCertificate extends StObject {
  
  var publicKey: typings.std.CryptoKey
  
  var `type`: CryptoCertificateType
}
object CryptoCertificate {
  
  inline def apply(publicKey: typings.std.CryptoKey, `type`: CryptoCertificateType): CryptoCertificate = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CryptoCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoCertificate] (val x: Self) extends AnyVal {
    
    inline def setPublicKey(value: typings.std.CryptoKey): Self = StObject.set(x, "publicKey", value.asInstanceOf[js.Any])
    
    inline def setType(value: CryptoCertificateType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
