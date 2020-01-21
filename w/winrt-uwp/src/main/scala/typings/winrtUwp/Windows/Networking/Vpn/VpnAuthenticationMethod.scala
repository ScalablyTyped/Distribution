package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnAuthenticationMethod extends js.Object

/** Specifies the type of authentication methods allowed by the operating system native VPN protocols. */
@JSGlobal("Windows.Networking.Vpn.VpnAuthenticationMethod")
@js.native
object VpnAuthenticationMethod extends js.Object {
  /** Certificate */
  @js.native
  sealed trait certificate extends VpnAuthenticationMethod
  
  /** Extensible Authentication Protocol */
  @js.native
  sealed trait eap extends VpnAuthenticationMethod
  
  /** Microsoft Challenge-Handshake Authentication Protocol v2 */
  @js.native
  sealed trait mschapv2 extends VpnAuthenticationMethod
  
  /** Preshared key */
  @js.native
  sealed trait presharedKey extends VpnAuthenticationMethod
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnAuthenticationMethod with Double] = js.native
  /* 2 */ @js.native
  object certificate extends TopLevel[certificate with Double]
  
  /* 1 */ @js.native
  object eap extends TopLevel[eap with Double]
  
  /* 0 */ @js.native
  object mschapv2 extends TopLevel[mschapv2 with Double]
  
  /* 3 */ @js.native
  object presharedKey extends TopLevel[presharedKey with Double]
  
}

