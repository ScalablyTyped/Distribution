package typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyProtectionLevel extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
@js.native
object KeyProtectionLevel extends js.Object {
  @js.native
  sealed trait consentOnly extends KeyProtectionLevel
  
  @js.native
  sealed trait consentWithPassword extends KeyProtectionLevel
  
  @js.native
  sealed trait noConsent extends KeyProtectionLevel
  
  /* 1 */ val consentOnly: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel.consentOnly with Double = js.native
  /* 2 */ val consentWithPassword: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel.consentWithPassword with Double = js.native
  /* 0 */ val noConsent: typings.winrt.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel.noConsent with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[KeyProtectionLevel with Double] = js.native
}

