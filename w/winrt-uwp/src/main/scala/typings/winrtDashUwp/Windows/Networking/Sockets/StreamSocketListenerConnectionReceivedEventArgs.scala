package typings.winrtDashUwp.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionReceived event on a StreamSocketListener object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs")
@js.native
abstract class StreamSocketListenerConnectionReceivedEventArgs () extends js.Object {
  /** The StreamSocket object created when a connection is received by the StreamSocketListener object. */
  var socket: StreamSocket = js.native
}

