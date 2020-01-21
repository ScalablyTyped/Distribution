package typings.winrtUwp.Windows.Networking.Proximity

import typings.winrtUwp.Windows.Networking.Sockets.StreamSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Contains properties that the TriggeredConnectionStateChanged event passes to an application. */
@JSGlobal("Windows.Networking.Proximity.TriggeredConnectionStateChangedEventArgs")
@js.native
abstract class TriggeredConnectionStateChangedEventArgs () extends js.Object {
  /** Gets the unique identifier for the connection in progress. */
  var id: Double = js.native
  /** Gets the StreamSocket instance for the connection. */
  var socket: StreamSocket = js.native
  /** Gets the state of the connection in progress. */
  var state: TriggeredConnectState = js.native
}

