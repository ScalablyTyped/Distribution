package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.IAsyncAction
import typings.winrt.WindowsNs.FoundationNs.IClosable
import typings.winrt.WindowsNs.NetworkingNs.EndpointPair
import typings.winrt.WindowsNs.NetworkingNs.HostName
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IInputStream
import typings.winrt.WindowsNs.StorageNs.StreamsNs.IOutputStream
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

