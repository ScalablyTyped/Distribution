package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait VpnPacketBufferStatus extends js.Object

/** Describes the possible states of the VPN packet buffer. */
@JSGlobal("Windows.Networking.Vpn.VpnPacketBufferStatus")
@js.native
object VpnPacketBufferStatus extends js.Object {
  /** Invalid buffer size */
  @js.native
  sealed trait invalidBufferSize
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnPacketBufferStatus
  
  /** OK */
  @js.native
  sealed trait ok
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnPacketBufferStatus
  
  /* 1 */ val invalidBufferSize: invalidBufferSize with scala.Double = js.native
  /* 0 */ val ok: ok with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnPacketBufferStatus with scala.Double
  ] = js.native
}

