package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Storage.Streams.DataReader
import typings.winrtUwp.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides data for a message received event on a MessageWebSocket . */
@JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
@js.native
abstract class MessageWebSocketMessageReceivedEventArgs ()
  extends typings.winrtUwp.Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs {
  /** Gets the type of the message received by a MessageWebSocket object. */
  /* CompleteClass */
  override var messageType: typings.winrtUwp.Windows.Networking.Sockets.SocketMessageType = js.native
  /**
    * Gets a DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    * @return A DataReader object to read incoming data received from the remote network destination on a MessageWebSocket .
    */
  /* CompleteClass */
  override def getDataReader(): DataReader = js.native
  /**
    * Gets an IInputStream object (a message represented as a sequential stream of bytes) from the remote network destination on a MessageWebSocket object.
    * @return A message represented as a sequential stream of bytes.
    */
  /* CompleteClass */
  override def getDataStream(): IInputStream = js.native
}

