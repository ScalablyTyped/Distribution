package typings.winrtDashUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnIPProtocol with Double] = js.native
  /* 3 */ @js.native
  object icmp extends TopLevel[icmp with Double]
  
  /* 5 */ @js.native
  object igmp extends TopLevel[igmp with Double]
  
  /* 4 */ @js.native
  object ipv6Icmp extends TopLevel[ipv6Icmp with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 6 */ @js.native
  object pgm extends TopLevel[pgm with Double]
  
  /* 1 */ @js.native
  object tcp extends TopLevel[tcp with Double]
  
  /* 2 */ @js.native
  object udp extends TopLevel[udp with Double]
  
}

