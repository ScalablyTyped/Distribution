package typings.winrtUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyProtectionLevel with Double] = js.native
  /* 1 */ @js.native
  object consentOnly extends TopLevel[consentOnly with Double]
  
  /* 3 */ @js.native
  object consentWithFingerprint extends TopLevel[consentWithFingerprint with Double]
  
  /* 2 */ @js.native
  object consentWithPassword extends TopLevel[consentWithPassword with Double]
  
  /* 0 */ @js.native
  object noConsent extends TopLevel[noConsent with Double]
  
}

