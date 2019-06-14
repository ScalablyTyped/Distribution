package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait icmp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol
  
  /** Internet Group Management Protocol (IGMP) */
  @js.native
  sealed trait igmp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol
  
  /** Internet Protocol version 6 (IPv6) Internet Control Message Protocol (ICMP) */
  @js.native
  sealed trait ipv6Icmp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol
  
  /** None */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol
  
  /** Pragmatic General Mulitcast (PGM) */
  @js.native
  sealed trait pgm
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol
  
  /** Transmission Control Protocol (TCP) */
  @js.native
  sealed trait tcp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol
  
  /** User Datagram Protocol (UDP) */
  @js.native
  sealed trait udp
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol
  
  /* 3 */ val icmp: icmp with scala.Double = js.native
  /* 5 */ val igmp: igmp with scala.Double = js.native
  /* 4 */ val ipv6Icmp: ipv6Icmp with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 6 */ val pgm: pgm with scala.Double = js.native
  /* 1 */ val tcp: tcp with scala.Double = js.native
  /* 2 */ val udp: udp with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol with scala.Double] = js.native
}

