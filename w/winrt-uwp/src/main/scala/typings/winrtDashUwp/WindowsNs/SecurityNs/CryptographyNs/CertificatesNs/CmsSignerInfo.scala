package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents signer information for a signed CMS message which contains a set of properties. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsSignerInfo")
@js.native
/** Creates a new instance of the CmsSignerInfo class. */
class CmsSignerInfo () extends js.Object {
  /** Gets or sets the signer certificate that is used to sign the message. */
  var certificate: Certificate = js.native
  /** Gets or sets the hash algorithm that is used to sign the CMS message. */
  var hashAlgorithmName: String = js.native
  /** Gets the RFC3161 unauthenticated timestamp information. */
  var timestampInfo: CmsTimestampInfo = js.native
}

