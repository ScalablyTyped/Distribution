package typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnIPProtocol extends js.Object

/** Specifies the IP protocols (numeric values). */
@JSGlobal("Windows.Networking.Vpn.VpnIPProtocol")
@js.native
object VpnIPProtocol extends js.Object {
  /** Internet Control Message Protocol (ICMP) */
  @js.native
  sealed trait icmp extends VpnIPProtocol
  
  /** Internet Group Management Protocol (IGMP) */
  @js.native
  sealed trait igmp extends VpnIPProtocol
  
  /** Internet Protocol version 6 (IPv6) Internet Control Message Protocol (ICMP) */
  @js.native
  sealed trait ipv6Icmp extends VpnIPProtocol
  
  /** None */
  @js.native
  sealed trait none extends VpnIPProtocol
  
  /** Pragmatic General Mulitcast (PGM) */
  @js.native
  sealed trait pgm extends VpnIPProtocol
  
  /** Transmission Control Protocol (TCP) */
  @js.native
  sealed trait tcp extends VpnIPProtocol
  
  /** User Datagram Protocol (UDP) */
  @js.native
  sealed trait udp extends VpnIPProtocol
  
  /* 3 */ val icmp: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol.icmp with Double = js.native
  /* 5 */ val igmp: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol.igmp with Double = js.native
  /* 4 */ val ipv6Icmp: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol.ipv6Icmp with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol.none with Double = js.native
  /* 6 */ val pgm: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol.pgm with Double = js.native
  /* 1 */ val tcp: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol.tcp with Double = js.native
  /* 2 */ val udp: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol.udp with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnIPProtocol with Double] = js.native
}

