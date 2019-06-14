package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnNativeProtocolType extends js.Object

/** Specifies the native protocol types. */
@JSGlobal("Windows.Networking.Vpn.VpnNativeProtocolType")
@js.native
object VpnNativeProtocolType extends js.Object {
  /** Internet Protocol Security Internet Key Exchange v2 (IPsec IKEv2) */
  @js.native
  sealed trait ipsecIkev2
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnNativeProtocolType
  
  /** Layer 2 Tunneling Protocol (L2TP) */
  @js.native
  sealed trait l2tp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnNativeProtocolType
  
  /** Point-to-Point Tunneling Protocol (PPTP) */
  @js.native
  sealed trait pptp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnNativeProtocolType
  
  /* 2 */ val ipsecIkev2: ipsecIkev2 with scala.Double = js.native
  /* 1 */ val l2tp: l2tp with scala.Double = js.native
  /* 0 */ val pptp: pptp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnNativeProtocolType with scala.Double
  ] = js.native
}

