package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
trait CmsTimestampInfo extends StObject {
  
  /** Gets the list of certificates that is used for chain building for the signing certificate. */
  var certificates: IVectorView[Certificate]
  
  /** Gets the certificate that is used to sign the timestamp. */
  var signingCertificate: Certificate
  
  /** Gets the date and time of the timestamp. */
  var timestamp: Date
}
object CmsTimestampInfo {
  
  @scala.inline
  def apply(certificates: IVectorView[Certificate], signingCertificate: Certificate, timestamp: Date): CmsTimestampInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmsTimestampInfo]
  }
  
  @scala.inline
  implicit class CmsTimestampInfoMutableBuilder[Self <: CmsTimestampInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: IVectorView[Certificate]): Self = StObject.set(x, "certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningCertificate(value: Certificate): Self = StObject.set(x, "signingCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
