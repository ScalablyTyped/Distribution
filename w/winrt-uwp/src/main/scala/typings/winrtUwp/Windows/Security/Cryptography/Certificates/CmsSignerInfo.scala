package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents signer information for a signed CMS message which contains a set of properties. */
trait CmsSignerInfo extends js.Object {
  /** Gets or sets the signer certificate that is used to sign the message. */
  var certificate: Certificate
  /** Gets or sets the hash algorithm that is used to sign the CMS message. */
  var hashAlgorithmName: String
  /** Gets the RFC3161 unauthenticated timestamp information. */
  var timestampInfo: CmsTimestampInfo
}

object CmsSignerInfo {
  @scala.inline
  def apply(certificate: Certificate, hashAlgorithmName: String, timestampInfo: CmsTimestampInfo): CmsSignerInfo = {
    val __obj = js.Dynamic.literal(certificate = certificate.asInstanceOf[js.Any], hashAlgorithmName = hashAlgorithmName.asInstanceOf[js.Any], timestampInfo = timestampInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[CmsSignerInfo]
  }
}

