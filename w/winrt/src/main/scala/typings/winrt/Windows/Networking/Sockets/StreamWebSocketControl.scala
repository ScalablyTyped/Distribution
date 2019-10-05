package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Windows.Networking.Sockets.StreamWebSocketControl")
@js.native
class StreamWebSocketControl () extends IStreamWebSocketControl {
  /* CompleteClass */
  override var noDelay: Boolean = js.native
  /* CompleteClass */
  override var outboundBufferSizeInBytes: Double = js.native
  /* CompleteClass */
  override var proxyCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var serverCredential: PasswordCredential = js.native
  /* CompleteClass */
  override var supportedProtocols: IVector[String] = js.native
}

