package typings.winrtDashUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnRoutingPolicyType with Double] = js.native
  /* 1 */ @js.native
  object forceAllTrafficOverVpn extends TopLevel[forceAllTrafficOverVpn with Double]
  
  /* 0 */ @js.native
  object splitRouting extends TopLevel[splitRouting with Double]
  
}

