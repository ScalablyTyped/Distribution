package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IAsyncOperation
import typings.winrt.WindowsNs.FoundationNs.IClosable
import typings.winrt.WindowsNs.NetworkingNs.EndpointPair
import typings.winrt.WindowsNs.NetworkingNs.HostName
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IDatagramSocket extends IClosable {
  var control: DatagramSocketControl = js.native
  var information: DatagramSocketInformation = js.native
  var onmessagereceived: js.Any = js.native
  var outputStream: IOutputStream = js.native
  def bindEndpointAsync(localHostName: HostName, localServiceName: String): IAsyncAction = js.native
  def bindServiceNameAsync(localServiceName: String): IAsyncAction = js.native
  def connectAsync(endpointPair: EndpointPair): IAsyncAction = js.native
  def connectAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncAction = js.native
  def getOutputStreamAsync(endpointPair: EndpointPair): IAsyncOperation[IOutputStream] = js.native
  def getOutputStreamAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncOperation[IOutputStream] = js.native
  def joinMulticastGroup(host: HostName): Unit = js.native
}

