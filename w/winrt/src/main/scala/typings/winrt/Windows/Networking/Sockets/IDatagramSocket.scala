package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IAsyncOperation
import typings.winrt.Windows.Foundation.IClosable
import typings.winrt.Windows.Networking.EndpointPair
import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.IOutputStream
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

