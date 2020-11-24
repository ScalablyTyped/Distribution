package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
@js.native
trait CmsTimestampInfo extends js.Object {
  
  /** Gets the list of certificates that is used for chain building for the signing certificate. */
  var certificates: IVectorView[Certificate] = js.native
  
  /** Gets the certificate that is used to sign the timestamp. */
  var signingCertificate: Certificate = js.native
  
  /** Gets the date and time of the timestamp. */
  var timestamp: Date = js.native
}
object CmsTimestampInfo {
  
  @scala.inline
  def apply(certificates: IVectorView[Certificate], signingCertificate: Certificate, timestamp: Date): CmsTimestampInfo = {
    val __obj = js.Dynamic.literal(certificates = certificates.asInstanceOf[js.Any], signingCertificate = signingCertificate.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmsTimestampInfo]
  }
  
  @scala.inline
  implicit class CmsTimestampInfoOps[Self <: CmsTimestampInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCertificates(value: IVectorView[Certificate]): Self = this.set("certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSigningCertificate(value: Certificate): Self = this.set("signingCertificate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = this.set("timestamp", value.asInstanceOf[js.Any])
  }
}
