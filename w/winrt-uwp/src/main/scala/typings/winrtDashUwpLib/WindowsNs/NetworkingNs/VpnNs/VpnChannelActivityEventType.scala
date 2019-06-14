package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnChannelActivityEventType extends js.Object

/** Specifies the type of activity events. */
@JSGlobal("Windows.Networking.Vpn.VpnChannelActivityEventType")
@js.native
object VpnChannelActivityEventType extends js.Object {
  /** Mode in which traffic is currently being sent over the VPN channel. */
  @js.native
  sealed trait active
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnChannelActivityEventType
  
  /** Mode in which no traffic is being sent over the VPN channel. */
  @js.native
  sealed trait idle
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnChannelActivityEventType
  
  /* 1 */ val active: active with scala.Double = js.native
  /* 0 */ val idle: idle with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnChannelActivityEventType with scala.Double
  ] = js.native
}

