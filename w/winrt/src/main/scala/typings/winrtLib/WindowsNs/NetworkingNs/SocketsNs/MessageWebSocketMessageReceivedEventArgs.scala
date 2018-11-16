package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.MessageWebSocketMessageReceivedEventArgs")
@js.native
class MessageWebSocketMessageReceivedEventArgs () extends IMessageWebSocketMessageReceivedEventArgs {
  /* CompleteClass */
  override var messageType: SocketMessageType = js.native
  /* CompleteClass */
  override def getDataReader(): winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader = js.native
  /* CompleteClass */
  override def getDataStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
}

