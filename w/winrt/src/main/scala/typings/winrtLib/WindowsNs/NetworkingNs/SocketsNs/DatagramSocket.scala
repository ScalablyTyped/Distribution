package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
class DatagramSocket () extends IDatagramSocket {
  /* CompleteClass */
  override def close(): scala.Unit = js.native
  def dispose(): scala.Unit = js.native
}

/* static members */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
object DatagramSocket extends js.Object {
  def getEndpointPairsAsync(remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName, remoteServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair]
  ] = js.native
  def getEndpointPairsAsync(
    remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String,
    sortOptions: winrtLib.WindowsNs.NetworkingNs.HostNameSortOptions
  ): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[
    winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVectorView[winrtLib.WindowsNs.NetworkingNs.EndpointPair]
  ] = js.native
}

