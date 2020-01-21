package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Storage.Streams.DataReader
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a message received event on a MessageWebSocket . */
@JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
@js.native
abstract class MessageWebSocketMessageReceivedEventArgs () extends js.Object {
  /** Gets the type of the message received by a MessageWebSocket object. */
  var messageType: SocketMessageType = js.native
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    * @return A DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    */
  def getDataReader(): DataReader = js.native
  /**
    * Gets an IInputStream object (a message represented as a sequential stream of bytes) from the remote network destination on a MessageWebSocket object.
    * @return A message represented as a sequential stream of bytes.
    */
  def getDataStream(): IInputStream = js.native
}

