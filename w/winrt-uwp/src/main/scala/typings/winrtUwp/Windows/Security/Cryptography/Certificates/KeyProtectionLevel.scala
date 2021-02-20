package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait KeyProtectionLevel extends StObject
/** Specifies the key protection level. This enumeration type is used in the KeyProtectionLevel property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
@js.native
object KeyProtectionLevel extends StObject {
  
  /** The user is notified through a dialog box when the private key is created or used. */
  @js.native
  sealed trait consentOnly extends KeyProtectionLevel
  
  /** The user is prompted to enter a fingerprint verification for the key when the key is created or used. */
  @js.native
  sealed trait consentWithFingerprint extends KeyProtectionLevel
  
  /** The user is prompted to enter a password for the key when the key is created or used. */
  @js.native
  sealed trait consentWithPassword extends KeyProtectionLevel
  
  /** No strong key protection. */
  @js.native
  sealed trait noConsent extends KeyProtectionLevel
}
