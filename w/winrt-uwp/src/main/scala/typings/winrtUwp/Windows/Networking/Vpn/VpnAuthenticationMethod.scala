package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnAuthenticationMethod extends StObject
/** Specifies the type of authentication methods allowed by the operating system native VPN protocols. */
@JSGlobal("Windows.Networking.Vpn.VpnAuthenticationMethod")
@js.native
object VpnAuthenticationMethod extends StObject {
  
  /** Certificate */
  @js.native
  sealed trait certificate
    extends StObject
       with VpnAuthenticationMethod
  
  /** Extensible Authentication Protocol */
  @js.native
  sealed trait eap
    extends StObject
       with VpnAuthenticationMethod
  
  /** Microsoft Challenge-Handshake Authentication Protocol v2 */
  @js.native
  sealed trait mschapv2
    extends StObject
       with VpnAuthenticationMethod
  
  /** Preshared key */
  @js.native
  sealed trait presharedKey
    extends StObject
       with VpnAuthenticationMethod
}
