package typings.winrtDashUwp.Windows.Security.Cryptography.Certificates

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[CertificateChainPolicy with Double] = js.native
  /* 0 */ @js.native
  object base extends TopLevel[base with Double]
  
  /* 3 */ @js.native
  object microsoftRoot extends TopLevel[microsoftRoot with Double]
  
  /* 2 */ @js.native
  object ntAuthentication extends TopLevel[ntAuthentication with Double]
  
  /* 1 */ @js.native
  object ssl extends TopLevel[ssl with Double]
  
}

