package typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait ipsecIkev2 extends VpnNativeProtocolType
  
  /** Layer 2 Tunneling Protocol (L2TP) */
  @js.native
  sealed trait l2tp extends VpnNativeProtocolType
  
  /** Point-to-Point Tunneling Protocol (PPTP) */
  @js.native
  sealed trait pptp extends VpnNativeProtocolType
  
  /* 2 */ val ipsecIkev2: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnNativeProtocolType.ipsecIkev2 with Double = js.native
  /* 1 */ val l2tp: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnNativeProtocolType.l2tp with Double = js.native
  /* 0 */ val pptp: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnNativeProtocolType.pptp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnNativeProtocolType with Double] = js.native
}

