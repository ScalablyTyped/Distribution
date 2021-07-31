package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnIPProtocol extends StObject
/** Specifies the IP protocols (numeric values). */
@JSGlobal("Windows.Networking.Vpn.VpnIPProtocol")
@js.native
object VpnIPProtocol extends StObject {
  
  /** Internet Control Message Protocol (ICMP) */
  @js.native
  sealed trait icmp
    extends StObject
       with VpnIPProtocol
  
  /** Internet Group Management Protocol (IGMP) */
  @js.native
  sealed trait igmp
    extends StObject
       with VpnIPProtocol
  
  /** Internet Protocol version 6 (IPv6) Internet Control Message Protocol (ICMP) */
  @js.native
  sealed trait ipv6Icmp
    extends StObject
       with VpnIPProtocol
  
  /** None */
  @js.native
  sealed trait none
    extends StObject
       with VpnIPProtocol
  
  /** Pragmatic General Mulitcast (PGM) */
  @js.native
  sealed trait pgm
    extends StObject
       with VpnIPProtocol
  
  /** Transmission Control Protocol (TCP) */
  @js.native
  sealed trait tcp
    extends StObject
       with VpnIPProtocol
  
  /** User Datagram Protocol (UDP) */
  @js.native
  sealed trait udp
    extends StObject
       with VpnIPProtocol
}
