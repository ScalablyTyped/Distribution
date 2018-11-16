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
  
  val consentOnly: consentOnly with java.lang.String = js.native
  val consentWithFingerprint: consentWithFingerprint with java.lang.String = js.native
  val consentWithPassword: consentWithPassword with java.lang.String = js.native
  val noConsent: noConsent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel with java.lang.String
  ] = js.native
}

