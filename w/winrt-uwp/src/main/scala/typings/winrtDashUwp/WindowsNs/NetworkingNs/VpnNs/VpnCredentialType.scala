package typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait protectedCertificate extends VpnCredentialType
  
  /** Represents a credential type of smart card. */
  @js.native
  sealed trait smartCard extends VpnCredentialType
  
  /** Represents a credential type of a certificate. */
  @js.native
  sealed trait unProtectedCertificate extends VpnCredentialType
  
  /** Represents a credential type of username, and a PIN or OTP. */
  @js.native
  sealed trait usernameOtpPin extends VpnCredentialType
  
  /** Represents a credential of type Username and Password. */
  @js.native
  sealed trait usernamePassword extends VpnCredentialType
  
  /** Represents a credential type of username, password, and PIN. */
  @js.native
  sealed trait usernamePasswordAndPin extends VpnCredentialType
  
  /** Represents a password change. The current password, new password, and a confirmation of the new password will be collected. */
  @js.native
  sealed trait usernamePasswordChange extends VpnCredentialType
  
  /* 5 */ val protectedCertificate: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType.protectedCertificate with Double = js.native
  /* 4 */ val smartCard: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType.smartCard with Double = js.native
  /* 6 */ val unProtectedCertificate: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType.unProtectedCertificate with Double = js.native
  /* 1 */ val usernameOtpPin: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType.usernameOtpPin with Double = js.native
  /* 0 */ val usernamePassword: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType.usernamePassword with Double = js.native
  /* 2 */ val usernamePasswordAndPin: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType.usernamePasswordAndPin with Double = js.native
  /* 3 */ val usernamePasswordChange: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnCredentialType.usernamePasswordChange with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnCredentialType with Double] = js.native
}

