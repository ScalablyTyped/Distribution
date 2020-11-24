package typings.winrtUwp.global.Windows.Security.Cryptography.Certificates

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Defines several commonly used key storage provider names. You can use this class in the KeyStorageProviderName property on the CertificateRequestProperties class. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
@js.native
abstract class KeyStorageProviderNames ()
  extends typings.winrtUwp.Windows.Security.Cryptography.Certificates.KeyStorageProviderNames
/* static members */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyStorageProviderNames")
@js.native
object KeyStorageProviderNames extends js.Object {
  
  /** Returns "Microsoft Passport Key Storage Provider" as the provider name. */
  var passportKeyStorageProvider: String = js.native
  
  /** Returns "Microsoft Platform Crypyto Key Storage Provider" as the provider name. */
  var platformKeyStorageProvider: String = js.native
  
  /** Returns "Microsoft Smart Card Key Storage Provider" as the provider name. */
  var smartcardKeyStorageProvider: String = js.native
  
  /** Returns "Microsoft Software Key Storage Provider" as the provider name. */
  var softwareKeyStorageProvider: String = js.native
}
