package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Defines several commonly used key storage provider names. You can use this class in the KeyStorageProviderName property on the CertificateRequestProperties class. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
@js.native
abstract class KeyStorageProviderNames () extends js.Object

/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
@js.native
object KeyStorageProviderNames extends js.Object {
  /** Returns "Microsoft Passport Key Storage Provider" as the provider name. */
  var passportKeyStorageProvider: java.lang.String = js.native
  /** Returns "Microsoft Platform Crypyto Key Storage Provider" as the provider name. */
  var platformKeyStorageProvider: java.lang.String = js.native
  /** Returns "Microsoft Smart Card Key Storage Provider" as the provider name. */
  var smartcardKeyStorageProvider: java.lang.String = js.native
  /** Returns "Microsoft Software Key Storage Provider" as the provider name. */
  var softwareKeyStorageProvider: java.lang.String = js.native
}

