package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.IAsyncAction
import typings.winrt.Windows.Foundation.IClosable
import typings.winrt.Windows.Networking.EndpointPair
import typings.winrt.Windows.Networking.HostName
import typings.winrt.Windows.Storage.Streams.IInputStream
import typings.winrt.Windows.Storage.Streams.IOutputStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamSocket extends IClosable {
  var control: StreamSocketControl = js.native
  var information: StreamSocketInformation = js.native
  var inputStream: IInputStream = js.native
  var outputStream: IOutputStream = js.native
  def connectAsync(endpointPair: EndpointPair): IAsyncAction = js.native
  def connectAsync(endpointPair: EndpointPair, protectionLevel: SocketProtectionLevel): IAsyncAction = js.native
  def connectAsync(remoteHostName: HostName, remoteServiceName: String): IAsyncAction = js.native
  def connectAsync(remoteHostName: HostName, remoteServiceName: String, protectionLevel: SocketProtectionLevel): IAsyncAction = js.native
  def upgradeToSslAsync(protectionLevel: SocketProtectionLevel, validationHostName: HostName): IAsyncAction = js.native
}

