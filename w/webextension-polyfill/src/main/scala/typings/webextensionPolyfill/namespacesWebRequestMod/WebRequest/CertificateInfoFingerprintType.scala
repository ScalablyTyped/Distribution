package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateInfoFingerprintType extends StObject {
  
  var sha1: String
  
  var sha256: String
}
object CertificateInfoFingerprintType {
  
  inline def apply(sha1: String, sha256: String): CertificateInfoFingerprintType = {
    val __obj = js.Dynamic.literal(sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfoFingerprintType]
  }
  
  extension [Self <: CertificateInfoFingerprintType](x: Self) {
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
  }
}
