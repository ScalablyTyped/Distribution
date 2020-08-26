package typings.winrt.global.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.Collections.IVectorView
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Networking.EndpointPair
import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Networking.HostNameSortOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
class DatagramSocket ()
  extends typings.winrt.Windows.Networking.Sockets.DatagramSocket

/* static members */
@JSGlobal("Windows.Networking.Sockets.DatagramSocket")
@js.native
object DatagramSocket extends js.Object {
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncOperation[IVectorView[EndpointPair]] = js.native
  def getEndpointPairsAsync(remoteHostName: HostName, remoteServiceName: String, sortOptions: HostNameSortOptions): IAsyncOperation[IVectorView[EndpointPair]] = js.native
}

