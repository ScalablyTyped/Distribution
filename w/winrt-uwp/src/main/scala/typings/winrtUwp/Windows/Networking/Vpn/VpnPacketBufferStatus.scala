package typings.winrtUwp.Windows.Networking.Vpn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait VpnPacketBufferStatus extends StObject
/** Describes the possible states of the VPN packet buffer. */
@JSGlobal("Windows.Networking.Vpn.VpnPacketBufferStatus")
@js.native
object VpnPacketBufferStatus extends StObject {
  
  /** Invalid buffer size */
  @js.native
  sealed trait invalidBufferSize
    extends StObject
       with VpnPacketBufferStatus
  
  /** OK */
  @js.native
  sealed trait ok
    extends StObject
       with VpnPacketBufferStatus
}
