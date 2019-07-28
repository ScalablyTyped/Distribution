package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.DataReader
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
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
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType)
  
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
}

