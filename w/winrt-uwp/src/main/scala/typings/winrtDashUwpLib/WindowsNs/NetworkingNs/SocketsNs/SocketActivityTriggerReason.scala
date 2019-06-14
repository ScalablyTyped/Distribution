package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

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
  sealed trait connectionAccepted
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason
  
  /** The keep-alive timer expired on a StreamSocket . */
  @js.native
  sealed trait keepAliveTimerExpired
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason
  
  /** No reason why a SocketActivityTrigger occurred is available. */
  @js.native
  sealed trait none
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason
  
  /** A packet was received by the socket brokering service for a StreamSocket or DatagramSocket . */
  @js.native
  sealed trait socketActivity
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason
  
  /** A StreamSocket was closed. */
  @js.native
  sealed trait socketClosed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason
  
  /* 2 */ val connectionAccepted: connectionAccepted with scala.Double = js.native
  /* 3 */ val keepAliveTimerExpired: keepAliveTimerExpired with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 1 */ val socketActivity: socketActivity with scala.Double = js.native
  /* 4 */ val socketClosed: socketClosed with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason with scala.Double
  ] = js.native
}

