package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Specifies the quality of service for a DatagramSocket or StreamSocket object. */
@JSGlobal("Windows.Networking.Sockets.SocketQualityOfService")
@js.native
object SocketQualityOfService extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService with Double] = js.native
  
  /* 1 */ val lowLatency: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService.lowLatency with Double = js.native
  
  /* 0 */ val normal: typings.winrtUwp.Windows.Networking.Sockets.SocketQualityOfService.normal with Double = js.native
}
