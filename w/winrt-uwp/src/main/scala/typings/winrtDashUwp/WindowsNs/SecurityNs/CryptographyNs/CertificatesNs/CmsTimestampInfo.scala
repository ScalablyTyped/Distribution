package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import typings.std.Date
import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsTimestampInfo")
@js.native
abstract class CmsTimestampInfo () extends js.Object {
  /** Gets the list of certificates that is used for chain building for the signing certificate. */
  var certificates: IVectorView[Certificate] = js.native
  /** Gets the certificate that is used to sign the timestamp. */
  var signingCertificate: Certificate = js.native
  /** Gets the date and time of the timestamp. */
  var timestamp: Date = js.native
}

