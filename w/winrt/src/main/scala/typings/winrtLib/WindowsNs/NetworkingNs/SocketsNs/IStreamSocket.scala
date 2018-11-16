package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IStreamSocket
  extends winrtLib.WindowsNs.FoundationNs.IClosable {
  var control: StreamSocketControl = js.native
  var information: StreamSocketInformation = js.native
  var inputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IInputStream = js.native
  var outputStream: winrtLib.WindowsNs.StorageNs.StreamsNs.IOutputStream = js.native
  def connectAsync(endpointPair: winrtLib.WindowsNs.NetworkingNs.EndpointPair): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def connectAsync(endpointPair: winrtLib.WindowsNs.NetworkingNs.EndpointPair, protectionLevel: SocketProtectionLevel): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def connectAsync(remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName, remoteServiceName: java.lang.String): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def connectAsync(
    remoteHostName: winrtLib.WindowsNs.NetworkingNs.HostName,
    remoteServiceName: java.lang.String,
    protectionLevel: SocketProtectionLevel
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
  def upgradeToSslAsync(
    protectionLevel: SocketProtectionLevel,
    validationHostName: winrtLib.WindowsNs.NetworkingNs.HostName
  ): winrtLib.WindowsNs.FoundationNs.IAsyncAction = js.native
}

