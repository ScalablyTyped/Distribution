package typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs

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
  sealed trait invalidBufferSize extends VpnPacketBufferStatus
  
  /** OK */
  @js.native
  sealed trait ok extends VpnPacketBufferStatus
  
  /* 1 */ val invalidBufferSize: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnPacketBufferStatus.invalidBufferSize with Double = js.native
  /* 0 */ val ok: typings.winrtDashUwp.WindowsNs.NetworkingNs.VpnNs.VpnPacketBufferStatus.ok with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnPacketBufferStatus with Double] = js.native
}

