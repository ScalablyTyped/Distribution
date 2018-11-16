package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.DatagramSocketMessageReceivedEventArgs")
@js.native
class DatagramSocketMessageReceivedEventArgs () extends IDatagramSocketMessageReceivedEventArgs {
  /* CompleteClass */
  override var localAddress: winrtLib.WindowsNs.NetworkingNs.HostName = js.native
  /* CompleteClass */
  override var remoteAddress: winrtLib.WindowsNs.NetworkingNs.HostName = js.native
  /* CompleteClass */
  override var remotePort: java.lang.String = js.native
  /* CompleteClass */
  override def getDataReader(): winrtLib.WindowsNs.StorageNs.StreamsNs.DataReader = js.native
  /* CompleteClass */
  override def getDataStream(): winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
}

