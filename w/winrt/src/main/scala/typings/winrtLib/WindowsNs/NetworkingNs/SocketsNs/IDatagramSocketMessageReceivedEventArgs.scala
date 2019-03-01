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
    getDataReader: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader],
    getDataStream: js.Function0[winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream],
    localAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName,
    remotePort: java.lang.String
  ): IDatagramSocketMessageReceivedEventArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getDataReader")(getDataReader)
    __obj.updateDynamic("getDataStream")(getDataStream)
    __obj.updateDynamic("localAddress")(localAddress)
    __obj.updateDynamic("remoteAddress")(remoteAddress)
    __obj.updateDynamic("remotePort")(remotePort)
    __obj.asInstanceOf[IDatagramSocketMessageReceivedEventArgs]
  }
}

