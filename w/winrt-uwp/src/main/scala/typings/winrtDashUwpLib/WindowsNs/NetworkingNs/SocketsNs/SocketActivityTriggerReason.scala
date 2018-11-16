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
  
  val connectionAccepted: connectionAccepted with java.lang.String = js.native
  val keepAliveTimerExpired: keepAliveTimerExpired with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val socketActivity: socketActivity with java.lang.String = js.native
  val socketClosed: socketClosed with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs.SocketActivityTriggerReason with java.lang.String
  ] = js.native
}

