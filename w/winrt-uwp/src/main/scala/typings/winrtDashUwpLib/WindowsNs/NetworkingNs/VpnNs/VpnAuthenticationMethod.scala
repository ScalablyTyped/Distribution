package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait certificate
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAuthenticationMethod
  
  /** Extensible Authentication Protocol */
  @js.native
  sealed trait eap
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAuthenticationMethod
  
  /** Microsoft Challenge-Handshake Authentication Protocol v2 */
  @js.native
  sealed trait mschapv2
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAuthenticationMethod
  
  /** Preshared key */
  @js.native
  sealed trait presharedKey
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAuthenticationMethod
  
  /* 2 */ val certificate: certificate with scala.Double = js.native
  /* 1 */ val eap: eap with scala.Double = js.native
  /* 0 */ val mschapv2: mschapv2 with scala.Double = js.native
  /* 3 */ val presharedKey: presharedKey with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnAuthenticationMethod with scala.Double
  ] = js.native
}

