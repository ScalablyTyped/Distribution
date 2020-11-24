package typings.winrtUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait SocketActivityTriggerReason extends js.Object
/** The reason why a SocketActivityTrigger occurred. */
@JSGlobal("Windows.Networking.Sockets.SocketActivityTriggerReason")
@js.native
object SocketActivityTriggerReason extends js.Object {
  
  /** A connection was accepted by the socket brokering service for a StreamSocketListener . */
  @js.native
  sealed trait connectionAccepted extends SocketActivityTriggerReason
  
  /** The keep-alive timer expired on a StreamSocket . */
  @js.native
  sealed trait keepAliveTimerExpired extends SocketActivityTriggerReason
  
  /** No reason why a SocketActivityTrigger occurred is available. */
  @js.native
  sealed trait none extends SocketActivityTriggerReason
  
  /** A packet was received by the socket brokering service for a StreamSocket or DatagramSocket . */
  @js.native
  sealed trait socketActivity extends SocketActivityTriggerReason
  
  /** A StreamSocket was closed. */
  @js.native
  sealed trait socketClosed extends SocketActivityTriggerReason
}
