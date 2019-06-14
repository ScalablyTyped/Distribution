package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnRoutingPolicyType extends js.Object

/** Specifies the routing policy type. */
@JSGlobal("Windows.Networking.Vpn.VpnRoutingPolicyType")
@js.native
object VpnRoutingPolicyType extends js.Object {
  /** Apps are force tunneled through the VPN interface. */
  @js.native
  sealed trait forceAllTrafficOverVpn
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnRoutingPolicyType
  
  /** Apps are split tunneled and allowed to talk through other interfaces. */
  @js.native
  sealed trait splitRouting
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnRoutingPolicyType
  
  /* 1 */ val forceAllTrafficOverVpn: forceAllTrafficOverVpn with scala.Double = js.native
  /* 0 */ val splitRouting: splitRouting with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnRoutingPolicyType with scala.Double
  ] = js.native
}

