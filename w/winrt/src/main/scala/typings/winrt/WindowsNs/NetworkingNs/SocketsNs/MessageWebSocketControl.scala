package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.MessageWebSocketControl")
@js.native
class MessageWebSocketControl () extends IMessageWebSocketControl {
  /* CompleteClass */
  override var maxMessageSize: Double = js.native
  /* CompleteClass */
  override var messageType: SocketMessageType = js.native
  /* CompleteClass */
  override var outboundBufferSizeInBytes: Double = js.native
  /* CompleteClass */
  override var proxyCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var supportedProtocols: IVector[String] = js.native
}

