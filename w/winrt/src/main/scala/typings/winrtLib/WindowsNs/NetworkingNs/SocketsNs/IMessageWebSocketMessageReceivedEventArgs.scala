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
    getDataReader: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader],
    getDataStream: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream],
    messageType: SocketMessageType
  ): IMessageWebSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDataReader")(getDataReader)
    __obj.updateDynamic("getDataStream")(getDataStream)
    __obj.updateDynamic("messageType")(messageType)
    __obj.asInstanceOf[IMessageWebSocketMessageReceivedEventArgs]
  }
}

