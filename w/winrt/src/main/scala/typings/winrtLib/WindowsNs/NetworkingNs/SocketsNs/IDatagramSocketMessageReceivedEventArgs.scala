package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IDatagramSocketMessageReceivedEventArgs extends js.Object {
  var localAddress: winrtLib.WindowsNs.NetworkingNs.HostName
  var remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName
  var remotePort: java.lang.String
  def getDataReader(): winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader
  def getDataStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream
}

