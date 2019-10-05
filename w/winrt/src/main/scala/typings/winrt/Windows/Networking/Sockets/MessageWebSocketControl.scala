package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Security.Credentials.PasswordCredential
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

