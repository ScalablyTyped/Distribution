package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait TriggeredConnectState extends js.Object

/** Indicates the current state of a connection to a peer application. */
@JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
@js.native
object TriggeredConnectState extends js.Object {
  /** The connection was stopped before it was completed. */
  @js.native
  sealed trait canceled
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  /** The connection is complete, and the StreamSocket class can now be used to communicate with the peer. */
  @js.native
  sealed trait completed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  /** This side of the socket connection will be the client and is attempting to connect to the peer. */
  @js.native
  sealed trait connecting
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  /** An error prevented a successful connection. */
  @js.native
  sealed trait failed
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  /** This side of the socket connection will be the host and is waiting for a connection from the peer. */
  @js.native
  sealed trait listening
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  /** A device that supports proximity socket connections is within proximity. The tap gesture is complete. */
  @js.native
  sealed trait peerFound
    extends winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState
  
  /* 4 */ val canceled: canceled with scala.Double = js.native
  /* 3 */ val completed: completed with scala.Double = js.native
  /* 2 */ val connecting: connecting with scala.Double = js.native
  /* 5 */ val failed: failed with scala.Double = js.native
  /* 1 */ val listening: listening with scala.Double = js.native
  /* 0 */ val peerFound: peerFound with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    winrtDashUwpLib.WindowsNs.NetworkingNs.ProximityNs.TriggeredConnectState with scala.Double
  ] = js.native
}

