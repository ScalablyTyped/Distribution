package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Storage.Streams.DataReader
import typings.winrt.Windows.Storage.Streams.IInputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageWebSocketMessageReceivedEventArgs extends js.Object {
  var messageType: SocketMessageType
  def getDataReader(): DataReader
  def getDataStream(): IInputStream
}

object IMessageWebSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(getDataReader: () => DataReader, getDataStream: () => IInputStream, messageType: SocketMessageType): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
}

