package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnNativeProtocolType extends StObject
/** Specifies the native protocol types. */
@JSGlobal("Windows.Networking.Vpn.VpnNativeProtocolType")
@js.native
object VpnNativeProtocolType extends StObject {
  
  /** Internet Protocol Security Internet Key Exchange v2 (IPsec IKEv2) */
  @js.native
  sealed trait ipsecIkev2
    extends StObject
       with VpnNativeProtocolType
  
  /** Layer 2 Tunneling Protocol (L2TP) */
  @js.native
  sealed trait l2tp
    extends StObject
       with VpnNativeProtocolType
  
  /** Point-to-Point Tunneling Protocol (PPTP) */
  @js.native
  sealed trait pptp
    extends StObject
       with VpnNativeProtocolType
}
