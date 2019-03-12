package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageWebSocketMessageReceivedEventArgs extends js.Object {
  var messageType: SocketMessageType
  def getDataReader(): winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader
  def getDataStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
}

object IMessageWebSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(
    getDataReader: () => winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader,
    getDataStream: () => winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    messageType: SocketMessageType
  ): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), messageType = messageType)
  
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
}

