package typings
package winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CertificateChainPolicy extends js.Object

/** Describes the policy to use when performing a certificate chain validation. */
@JSGlobal("Windows.Security.Cryptography.Certificates.CertificateChainPolicy")
@js.native
object CertificateChainPolicy extends js.Object {
  /** Use the base chain policy verification checks. */
  @js.native
  sealed trait base
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy
  
  /** Check the last element of the first simple chain for a Microsoft root public key. */
  @js.native
  sealed trait microsoftRoot
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy
  
  /** Use the Windows NT Authentication chain policy checks. */
  @js.native
  sealed trait ntAuthentication
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy
  
  /** Use the SSL client/server chain policy verification checks. */
  @js.native
  sealed trait ssl
    extends winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy
  
  val base: base with java.lang.String = js.native
  val microsoftRoot: microsoftRoot with java.lang.String = js.native
  val ntAuthentication: ntAuthentication with java.lang.String = js.native
  val ssl: ssl with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy with java.lang.String
  ] = js.native
}

