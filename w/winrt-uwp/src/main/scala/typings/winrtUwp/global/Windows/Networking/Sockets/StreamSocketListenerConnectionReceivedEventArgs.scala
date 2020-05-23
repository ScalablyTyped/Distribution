package typings.winrtUwp.global.Windows.Networking.Sockets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a ConnectionReceived event on a StreamSocketListener object. */
@JSGlobal("Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs")
@js.native
abstract class StreamSocketListenerConnectionReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Networking.Sockets.StreamSocketListenerConnectionReceivedEventArgs {
  /** The StreamSocket object created when a connection is received by the StreamSocketListener object. */
  /* CompleteClass */
  override var socket: typings.winrtUwp.Windows.Networking.Sockets.StreamSocket = js.native
}

