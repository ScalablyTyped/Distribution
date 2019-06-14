package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnCredentialType extends js.Object

/** Specifies the types of credentials that can be requested by the VPN platform. */
@JSGlobal("Windows.Networking.Vpn.VpnCredentialType")
@js.native
object VpnCredentialType extends js.Object {
  /** Represents a credential type of a protected certificate. */
  @js.native
  sealed trait protectedCertificate
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType
  
  /** Represents a credential type of smart card. */
  @js.native
  sealed trait smartCard
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType
  
  /** Represents a credential type of a certificate. */
  @js.native
  sealed trait unProtectedCertificate
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType
  
  /** Represents a credential type of username, and a PIN or OTP. */
  @js.native
  sealed trait usernameOtpPin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType
  
  /** Represents a credential of type Username and Password. */
  @js.native
  sealed trait usernamePassword
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType
  
  /** Represents a credential type of username, password, and PIN. */
  @js.native
  sealed trait usernamePasswordAndPin
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType
  
  /** Represents a password change. The current password, new password, and a confirmation of the new password will be collected. */
  @js.native
  sealed trait usernamePasswordChange
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType
  
  /* 5 */ val protectedCertificate: protectedCertificate with scala.Double = js.native
  /* 4 */ val smartCard: smartCard with scala.Double = js.native
  /* 6 */ val unProtectedCertificate: unProtectedCertificate with scala.Double = js.native
  /* 1 */ val usernameOtpPin: usernameOtpPin with scala.Double = js.native
  /* 0 */ val usernamePassword: usernamePassword with scala.Double = js.native
  /* 2 */ val usernamePasswordAndPin: usernamePasswordAndPin with scala.Double = js.native
  /* 3 */ val usernamePasswordChange: usernamePasswordChange with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType with scala.Double] = js.native
}

