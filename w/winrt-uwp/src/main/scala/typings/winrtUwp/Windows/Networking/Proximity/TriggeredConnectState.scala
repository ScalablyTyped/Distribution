package typings.winrtUwp.Windows.Networking.Proximity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TriggeredConnectState extends StObject
/** Indicates the current state of a connection to a peer application. */
@JSGlobal("Windows.Networking.Proximity.TriggeredConnectState")
@js.native
object TriggeredConnectState extends StObject {
  
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
}
