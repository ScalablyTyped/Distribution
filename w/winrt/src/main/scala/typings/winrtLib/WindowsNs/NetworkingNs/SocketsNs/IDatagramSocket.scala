package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatagramSocket
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  var control: DatagramSocketControl = js.native
  var information: DatagramSocketInformation = js.native
  var onmessagereceived: js.Any = js.native
  var outputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  def bindEndpointAsync(localHostName: winrtLib.WindowsNs.NetworkingNs.HostName, localServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def bindServiceNameAsync(localServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def connectAsync(endpointPair: winrtLib.WindowsNs.NetworkingNs.EndpointPair): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def connectAsync(remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName, remoteServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def getOutputStreamAsync(endpointPair: winrtLib.WindowsNs.NetworkingNs.EndpointPair): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream] = js.native
  def getOutputStreamAsync(remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName, remoteServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncOperation[winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream] = js.native
  def joinMulticastGroup(host: winrtLib.WindowsNs.NetworkingNs.HostName): scala.Unit = js.native
}

