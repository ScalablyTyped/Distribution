package typings.winrtDashUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnCredentialType with Double] = js.native
  /* 5 */ @js.native
  object protectedCertificate extends TopLevel[protectedCertificate with Double]
  
  /* 4 */ @js.native
  object smartCard extends TopLevel[smartCard with Double]
  
  /* 6 */ @js.native
  object unProtectedCertificate extends TopLevel[unProtectedCertificate with Double]
  
  /* 1 */ @js.native
  object usernameOtpPin extends TopLevel[usernameOtpPin with Double]
  
  /* 0 */ @js.native
  object usernamePassword extends TopLevel[usernamePassword with Double]
  
  /* 2 */ @js.native
  object usernamePasswordAndPin extends TopLevel[usernamePasswordAndPin with Double]
  
  /* 3 */ @js.native
  object usernamePasswordChange extends TopLevel[usernamePasswordChange with Double]
  
}

