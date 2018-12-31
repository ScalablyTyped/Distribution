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

