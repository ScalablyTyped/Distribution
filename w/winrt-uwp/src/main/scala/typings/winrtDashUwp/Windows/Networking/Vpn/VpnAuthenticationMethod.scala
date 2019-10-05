package typings.winrtDashUwp.Windows.Networking.Vpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnAuthenticationMethod extends js.Object

/** Specifies the type of authentication methods allowed by the operating system native VPN protocols. */
@JSGlobal("Windows.Networking.Vpn.VpnAuthenticationMethod")
@js.native
object VpnAuthenticationMethod extends js.Object {
  /** Certificate */
  @js.native
  sealed trait certificate extends VpnAuthenticationMethod
  
  /** Extensible Authentication Protocol */
  @js.native
  sealed trait eap extends VpnAuthenticationMethod
  
  /** Microsoft Challenge-Handshake Authentication Protocol v2 */
  @js.native
  sealed trait mschapv2 extends VpnAuthenticationMethod
  
  /** Preshared key */
  @js.native
  sealed trait presharedKey extends VpnAuthenticationMethod
  
  /* 2 */ val certificate: typings.winrtDashUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.certificate with Double = js.native
  /* 1 */ val eap: typings.winrtDashUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.eap with Double = js.native
  /* 0 */ val mschapv2: typings.winrtDashUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.mschapv2 with Double = js.native
  /* 3 */ val presharedKey: typings.winrtDashUwp.Windows.Networking.Vpn.VpnAuthenticationMethod.presharedKey with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnAuthenticationMethod with Double] = js.native
}

