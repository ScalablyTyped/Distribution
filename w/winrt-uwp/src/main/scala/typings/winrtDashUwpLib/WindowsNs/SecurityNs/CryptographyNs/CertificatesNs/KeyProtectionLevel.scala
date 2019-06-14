package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

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
  sealed trait consentOnly
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel
  
  /** The user is prompted to enter a fingerprint verification for the key when the key is created or used. */
  @js.native
  sealed trait consentWithFingerprint
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel
  
  /** The user is prompted to enter a password for the key when the key is created or used. */
  @js.native
  sealed trait consentWithPassword
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel
  
  /** No strong key protection. */
  @js.native
  sealed trait noConsent
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel
  
  /* 1 */ val consentOnly: consentOnly with scala.Double = js.native
  /* 3 */ val consentWithFingerprint: consentWithFingerprint with scala.Double = js.native
  /* 2 */ val consentWithPassword: consentWithPassword with scala.Double = js.native
  /* 0 */ val noConsent: noConsent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel with scala.Double
  ] = js.native
}

