package typings.webextensionPolyfill.webRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateInfoSubjectPublicKeyInfoDigestType extends StObject {
  
  var sha256: String
}
object CertificateInfoSubjectPublicKeyInfoDigestType {
  
  inline def apply(sha256: String): CertificateInfoSubjectPublicKeyInfoDigestType = {
    val __obj = js.Dynamic.literal(sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfoSubjectPublicKeyInfoDigestType]
  }
  
  extension [Self <: CertificateInfoSubjectPublicKeyInfoDigestType](x: Self) {
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
  }
}
