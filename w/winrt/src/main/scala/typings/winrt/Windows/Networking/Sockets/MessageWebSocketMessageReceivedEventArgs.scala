package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Storage.Streams.DataReader
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
@js.native
class MessageWebSocketMessageReceivedEventArgs () extends IMessageWebSocketMessageReceivedEventArgs {
  /* CompleteClass */
  override var messageType: SocketMessageType = js.native
  /* CompleteClass */
  override def getDataReader(): DataReader = js.native
  /* CompleteClass */
  override def getDataStream(): IInputStream = js.native
}

