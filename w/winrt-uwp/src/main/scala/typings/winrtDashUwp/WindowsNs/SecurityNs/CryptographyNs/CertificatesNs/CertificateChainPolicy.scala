package typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs

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
  sealed trait base extends CertificateChainPolicy
  
  /** Check the last element of the first simple chain for a Microsoft root public key. */
  @js.native
  sealed trait microsoftRoot extends CertificateChainPolicy
  
  /** Use the Windows NT Authentication chain policy checks. */
  @js.native
  sealed trait ntAuthentication extends CertificateChainPolicy
  
  /** Use the SSL client/server chain policy verification checks. */
  @js.native
  sealed trait ssl extends CertificateChainPolicy
  
  /* 0 */ val base: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy.base with Double = js.native
  /* 3 */ val microsoftRoot: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy.microsoftRoot with Double = js.native
  /* 2 */ val ntAuthentication: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy.ntAuthentication with Double = js.native
  /* 1 */ val ssl: typings.winrtDashUwp.WindowsNs.SecurityNs.CryptographyNs.CertificatesNs.CertificateChainPolicy.ssl with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CertificateChainPolicy with Double] = js.native
}

