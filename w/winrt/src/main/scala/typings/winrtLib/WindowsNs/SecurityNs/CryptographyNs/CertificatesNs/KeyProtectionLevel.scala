package typings
package winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait KeyProtectionLevel extends js.Object

@JSGlobal("Windows.Security.Cryptography.Certificates.KeyProtectionLevel")
@js.native
object KeyProtectionLevel extends js.Object {
  @js.native
  sealed trait consentOnly
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel
  
  @js.native
  sealed trait consentWithPassword
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel
  
  @js.native
  sealed trait noConsent
    extends winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel
  
  /* 1 */ val consentOnly: consentOnly with scala.Double = js.native
  /* 2 */ val consentWithPassword: consentWithPassword with scala.Double = js.native
  /* 0 */ val noConsent: noConsent with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel with scala.Double
  ] = js.native
}

