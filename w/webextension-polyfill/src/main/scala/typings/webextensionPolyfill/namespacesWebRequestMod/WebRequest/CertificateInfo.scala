package typings.webextensionPolyfill.namespacesWebRequestMod.WebRequest

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Contains the certificate properties of the request if it is a secure request.
  */
trait CertificateInfo extends StObject {
  
  var fingerprint: CertificateInfoFingerprintType
  
  var isBuiltInRoot: Boolean
  
  var issuer: String
  
  /**
    * Optional.
    */
  var rawDER: js.UndefOr[js.Array[Double]] = js.undefined
  
  var serialNumber: String
  
  var subject: String
  
  var subjectPublicKeyInfoDigest: CertificateInfoSubjectPublicKeyInfoDigestType
  
  /**
    * Contains start and end timestamps.
    */
  var validity: CertificateInfoValidityType
}
object CertificateInfo {
  
  inline def apply(
    fingerprint: CertificateInfoFingerprintType,
    isBuiltInRoot: Boolean,
    issuer: String,
    serialNumber: String,
    subject: String,
    subjectPublicKeyInfoDigest: CertificateInfoSubjectPublicKeyInfoDigestType,
    validity: CertificateInfoValidityType
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal(fingerprint = fingerprint.asInstanceOf[js.Any], isBuiltInRoot = isBuiltInRoot.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], serialNumber = serialNumber.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], subjectPublicKeyInfoDigest = subjectPublicKeyInfoDigest.asInstanceOf[js.Any], validity = validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CertificateInfo] (val x: Self) extends AnyVal {
    
    inline def setFingerprint(value: CertificateInfoFingerprintType): Self = StObject.set(x, "fingerprint", value.asInstanceOf[js.Any])
    
    inline def setIsBuiltInRoot(value: Boolean): Self = StObject.set(x, "isBuiltInRoot", value.asInstanceOf[js.Any])
    
    inline def setIssuer(value: String): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setRawDER(value: js.Array[Double]): Self = StObject.set(x, "rawDER", value.asInstanceOf[js.Any])
    
    inline def setRawDERUndefined: Self = StObject.set(x, "rawDER", js.undefined)
    
    inline def setRawDERVarargs(value: Double*): Self = StObject.set(x, "rawDER", js.Array(value*))
    
    inline def setSerialNumber(value: String): Self = StObject.set(x, "serialNumber", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectPublicKeyInfoDigest(value: CertificateInfoSubjectPublicKeyInfoDigestType): Self = StObject.set(x, "subjectPublicKeyInfoDigest", value.asInstanceOf[js.Any])
    
    inline def setValidity(value: CertificateInfoValidityType): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
  }
}
