package typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs

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
  
  /* 2 */ val connectionAccepted: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason.connectionAccepted with Double = js.native
  /* 3 */ val keepAliveTimerExpired: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason.keepAliveTimerExpired with Double = js.native
  /* 0 */ val none: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason.none with Double = js.native
  /* 1 */ val socketActivity: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason.socketActivity with Double = js.native
  /* 4 */ val socketClosed: typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason.socketClosed with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[SocketActivityTriggerReason with Double] = js.native
}

