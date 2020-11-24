package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The reason why a SocketActivityTrigger occurred. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerReason")
@js.native
object SocketActivityTriggerReason extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[
    typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason with Double
  ] = js.native
  
  /* 2 */ val connectionAccepted: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.connectionAccepted with Double = js.native
  
  /* 3 */ val keepAliveTimerExpired: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.keepAliveTimerExpired with Double = js.native
  
  /* 0 */ val none: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.none with Double = js.native
  
  /* 1 */ val socketActivity: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.socketActivity with Double = js.native
  
  /* 4 */ val socketClosed: typings.winrtUwp.Windows.Networking.Sockets.SocketActivityTriggerReason.socketClosed with Double = js.native
}
