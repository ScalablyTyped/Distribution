package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyProtectionLevel extends js.Object

/** Specifies the key protection level. This enumeration type is used in the KeyProtectionLevel property of a CertificateRequestProperties object. */
@JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
@js.native
object KeyProtectionLevel extends js.Object {
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
  
  /* 1 */ val consentOnly: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel.consentOnly with Double = js.native
  /* 3 */ val consentWithFingerprint: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel.consentWithFingerprint with Double = js.native
  /* 2 */ val consentWithPassword: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel.consentWithPassword with Double = js.native
  /* 0 */ val noConsent: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel.noConsent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyProtectionLevel with Double] = js.native
}

