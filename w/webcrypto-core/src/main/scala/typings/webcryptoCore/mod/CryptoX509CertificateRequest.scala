package typings.webcryptoCore.mod

import typings.webcryptoCore.webcryptoCoreStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoX509CertificateRequest
  extends StObject
     with CryptoCertificate {
  
  var subjectName: String
  
  @JSName("type")
  var type_CryptoX509CertificateRequest: request
}
object CryptoX509CertificateRequest {
  
  inline def apply(publicKey: typings.std.CryptoKey, subjectName: String): CryptoX509CertificateRequest = {
    val __obj = js.Dynamic.literal(publicKey = publicKey.asInstanceOf[js.Any], subjectName = subjectName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("request")
    __obj.asInstanceOf[CryptoX509CertificateRequest]
  }
  
  extension [Self <: CryptoX509CertificateRequest](x: Self) {
    
    inline def setSubjectName(value: String): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setType(value: request): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
