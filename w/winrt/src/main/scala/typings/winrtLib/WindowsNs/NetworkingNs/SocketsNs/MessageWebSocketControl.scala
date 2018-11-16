package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.MessageWebSocketControl")
@js.native
class MessageWebSocketControl () extends IMessageWebSocketControl {
  /* CompleteClass */
  override var maxMessageSize: scala.Double = js.native
  /* CompleteClass */
  override var messageType: SocketMessageType = js.native
  /* CompleteClass */
  override var outboundBufferSizeInBytes: scala.Double = js.native
  /* CompleteClass */
  override var proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /* CompleteClass */
  override var supportedProtocols: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
}

