package typings.winrtDashUwp.Windows.Networking.Vpn

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
  sealed trait forceAllTrafficOverVpn extends VpnRoutingPolicyType
  
  /** Apps are split tunneled and allowed to talk through other interfaces. */
  @js.native
  sealed trait splitRouting extends VpnRoutingPolicyType
  
  /* 1 */ val forceAllTrafficOverVpn: typings.winrtDashUwp.Windows.Networking.Vpn.VpnRoutingPolicyType.forceAllTrafficOverVpn with Double = js.native
  /* 0 */ val splitRouting: typings.winrtDashUwp.Windows.Networking.Vpn.VpnRoutingPolicyType.splitRouting with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnRoutingPolicyType with Double] = js.native
}

