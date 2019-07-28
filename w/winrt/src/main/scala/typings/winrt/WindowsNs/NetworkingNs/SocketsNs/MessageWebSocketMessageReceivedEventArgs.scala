package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.StorageNs.StreamsNs.DataReader
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
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

