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

object IDatagramSocketMessageReceivedEventArgs {
  @scala.inline
  def apply(
    getDataReader: () => winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader,
    getDataStream: () => winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream,
    localAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    remotePort: java.lang.String
  ): IDatagramSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal(getDataReader = js.Any.fromFunction0(getDataReader), getDataStream = js.Any.fromFunction0(getDataStream), localAddress = localAddress, remoteAddress = remoteAddress, remotePort = remotePort)
  
    __obj.asInstanceOf[IDatagramSocketMessageReceivedEventArgs]
  }
}

