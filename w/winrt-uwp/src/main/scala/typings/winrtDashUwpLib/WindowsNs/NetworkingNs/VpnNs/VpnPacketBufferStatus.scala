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
  
  val invalidBufferSize: invalidBufferSize with java.lang.String = js.native
  val ok: ok with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.VpnNs.VpnPacketBufferStatus with java.lang.String
  ] = js.native
}

