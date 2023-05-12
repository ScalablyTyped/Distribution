package typings.thunderbirdWebextBrowser.messenger.webRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateInfoFingerprint extends StObject {
  
  var sha1: String
  
  var sha256: String
}
object CertificateInfoFingerprint {
  
  inline def apply(sha1: String, sha256: String): CertificateInfoFingerprint = {
    val __obj = js.Dynamic.literal(sha1 = sha1.asInstanceOf[js.Any], sha256 = sha256.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfoFingerprint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateInfoFingerprint] (val x: Self) extends AnyVal {
    
    inline def setSha1(value: String): Self = StObject.set(x, "sha1", value.asInstanceOf[js.Any])
    
    inline def setSha256(value: String): Self = StObject.set(x, "sha256", value.asInstanceOf[js.Any])
  }
}
