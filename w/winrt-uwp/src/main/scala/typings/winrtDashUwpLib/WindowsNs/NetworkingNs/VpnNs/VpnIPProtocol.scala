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
  
  val icmp: icmp with java.lang.String = js.native
  val igmp: igmp with java.lang.String = js.native
  val ipv6Icmp: ipv6Icmp with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val pgm: pgm with java.lang.String = js.native
  val tcp: tcp with java.lang.String = js.native
  val udp: udp with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnIPProtocol with java.lang.String] = js.native
}

