package typings.winrtDashUwp.Windows.Networking.Proximity

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
  sealed trait canceled extends TriggeredConnectState
  
  /** The connection is complete, and the StreamSocket class can now be used to communicate with the peer. */
  @js.native
  sealed trait completed extends TriggeredConnectState
  
  /** This side of the socket connection will be the client and is attempting to connect to the peer. */
  @js.native
  sealed trait connecting extends TriggeredConnectState
  
  /** An error prevented a successful connection. */
  @js.native
  sealed trait failed extends TriggeredConnectState
  
  /** This side of the socket connection will be the host and is waiting for a connection from the peer. */
  @js.native
  sealed trait listening extends TriggeredConnectState
  
  /** A device that supports proximity socket connections is within proximity. The tap gesture is complete. */
  @js.native
  sealed trait peerFound extends TriggeredConnectState
  
  /* 4 */ val canceled: typings.winrtDashUwp.Windows.Networking.Proximity.TriggeredConnectState.canceled with Double = js.native
  /* 3 */ val completed: typings.winrtDashUwp.Windows.Networking.Proximity.TriggeredConnectState.completed with Double = js.native
  /* 2 */ val connecting: typings.winrtDashUwp.Windows.Networking.Proximity.TriggeredConnectState.connecting with Double = js.native
  /* 5 */ val failed: typings.winrtDashUwp.Windows.Networking.Proximity.TriggeredConnectState.failed with Double = js.native
  /* 1 */ val listening: typings.winrtDashUwp.Windows.Networking.Proximity.TriggeredConnectState.listening with Double = js.native
  /* 0 */ val peerFound: typings.winrtDashUwp.Windows.Networking.Proximity.TriggeredConnectState.peerFound with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TriggeredConnectState with Double] = js.native
}

