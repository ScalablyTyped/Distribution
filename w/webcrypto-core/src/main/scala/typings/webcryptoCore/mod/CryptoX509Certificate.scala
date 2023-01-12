package typings.webcryptoCore.mod

import typings.webcryptoCore.webcryptoCoreStrings.x509
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CryptoX509Certificate
  extends StObject
     with CryptoCertificate {
  
  var issuerName: String
  
  var notAfter: js.Date
  
  var notBefore: js.Date
  
  var serialNumber: HexString
  
  var subjectName: String
  
  @JSName("type")
  var type_CryptoX509Certificate: x509
}
object CryptoX509Certificate {
  
  inline def apply(
    issuerName: String,
    notAfter: js.Date,
    notBefore: js.Date,
    publicKey: typings.std.CryptoKey,
    serialNumber: HexString,
    subjectName: String
  ): CryptoX509Certificate = {
    val __obj = js.Dynamic.literal(issuerName = issuerName.asInstanceOf[js.Any], notAfter = notAfter.asInstanceOf[js.Any], notBefore = notBefore.asInstanceOf[js.Any], publicKey = publicKey.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subjectName = subjectName.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("x509")
    __obj.asInstanceOf[CryptoX509Certificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CryptoX509Certificate] (val x: Self) extends AnyVal {
    
    inline def setIssuerName(value: String): Self = StObject.set(x, "issuerName", value.asInstanceOf[js.Any])
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setSerialNumber(value: HexString): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSubjectName(value: String): Self = StObject.set(x, "subjectName", value.asInstanceOf[js.Any])
    
    inline def setType(value: x509): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
