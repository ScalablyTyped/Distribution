package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents signer information for a signed CMS message which contains a set of properties. */
trait CmsSignerInfo extends StObject {
  
  /** Gets or sets the signer certificate that is used to sign the message. */
  var certificate: Certificate
  
  /** Gets or sets the hash algorithm that is used to sign the CMS message. */
  var hashAlgorithmName: String
  
  /** Gets the RFC3161 unauthenticated timestamp information. */
  var timestampInfo: CmsTimestampInfo
}
object CmsSignerInfo {
  
  inline def apply(certificate: Certificate, hashAlgorithmName: String, timestampInfo: CmsTimestampInfo): CmsSignerInfo = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], timestampInfo = timestampInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmsSignerInfo]
  }
  
  extension [Self <: CmsSignerInfo](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "certificate", value.asInstanceOf[js.Any])
    
    inline def setHashAlgorithmName(value: String): Self = StObject.set(x, "hashAlgorithmName", value.asInstanceOf[js.Any])
    
    inline def setTimestampInfo(value: CmsTimestampInfo): Self = StObject.set(x, "timestampInfo", value.asInstanceOf[js.Any])
  }
}
