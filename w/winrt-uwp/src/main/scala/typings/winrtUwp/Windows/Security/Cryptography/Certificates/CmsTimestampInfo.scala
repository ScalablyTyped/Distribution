package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
trait CmsTimestampInfo extends js.Object {
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
}

