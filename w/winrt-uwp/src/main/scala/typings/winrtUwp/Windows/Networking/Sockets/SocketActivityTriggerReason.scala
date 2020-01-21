package typings.winrtUwp.Windows.Networking.Sockets

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketActivityTriggerReason with Double] = js.native
  /* 2 */ @js.native
  object connectionAccepted extends TopLevel[connectionAccepted with Double]
  
  /* 3 */ @js.native
  object keepAliveTimerExpired extends TopLevel[keepAliveTimerExpired with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 1 */ @js.native
  object socketActivity extends TopLevel[socketActivity with Double]
  
  /* 4 */ @js.native
  object socketClosed extends TopLevel[socketClosed with Double]
  
}

