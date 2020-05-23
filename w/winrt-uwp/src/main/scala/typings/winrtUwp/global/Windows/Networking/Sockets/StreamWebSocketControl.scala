package typings.winrtUwp.global.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamWebSocketControl")
@js.native
abstract class StreamWebSocketControl ()
  extends typings.winrtUwp.Windows.Networking.Sockets.StreamWebSocketControl {
  /** A value that indicates whether the Nagle algorithm is used on a StreamWebSocket object. */
  /* CompleteClass */
  override var noDelay: Boolean = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamWebSocket object. */
  /* CompleteClass */
  override var outboundBufferSizeInBytes: Double = js.native
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a StreamWebSocket object. */
  /* CompleteClass */
  override var proxyCredential: PasswordCredential = js.native
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a StreamWebSocket object. */
  /* CompleteClass */
  override var serverCredential: PasswordCredential = js.native
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  /* CompleteClass */
  override var supportedProtocols: IVector[String] = js.native
}

