package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[VpnPacketBufferStatus with Double] = js.native
  /* 1 */ @js.native
  object invalidBufferSize extends TopLevel[invalidBufferSize with Double]
  
  /* 0 */ @js.native
  object ok extends TopLevel[ok with Double]
  
}

