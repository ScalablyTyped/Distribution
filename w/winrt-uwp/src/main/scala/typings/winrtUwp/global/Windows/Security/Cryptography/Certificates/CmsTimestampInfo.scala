package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import typings.std.Date
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents an RFC3161 unauthenticated timestamp attribute in a signed CMS message. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CmsTimestampInfo")
@js.native
abstract class CmsTimestampInfo ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.CmsTimestampInfo {
  /** Gets the list of certificates that is used for chain building for the signing certificate. */
  /* CompleteClass */
  override var certificates: IVectorView[typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate] = js.native
  /** Gets the certificate that is used to sign the timestamp. */
  /* CompleteClass */
  override var signingCertificate: typings.winrtUwp.Windows.Security.Cryptography.Certificates.Certificate = js.native
  /** Gets the date and time of the timestamp. */
  /* CompleteClass */
  override var timestamp: Date = js.native
}

