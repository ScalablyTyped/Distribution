package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Storage.Streams.DataReader
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageWebSocketMessageReceivedEventArgs extends IMessageWebSocketMessageReceivedEventArgs

object MessageWebSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): MessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketMessageReceivedEventArgs]
  }
}

