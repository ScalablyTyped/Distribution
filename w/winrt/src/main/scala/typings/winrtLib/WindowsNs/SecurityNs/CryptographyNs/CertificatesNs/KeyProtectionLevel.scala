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
  
  val consentOnly: consentOnly with java.lang.String = js.native
  val consentWithPassword: consentWithPassword with java.lang.String = js.native
  val noConsent: noConsent with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.KeyProtectionLevel with java.lang.String
  ] = js.native
}

