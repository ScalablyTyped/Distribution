package typings.winrtUwp.Windows.Networking.Vpn

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
}
