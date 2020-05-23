package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamWebSocket object. */
trait StreamWebSocketControl extends js.Object {
  /** A value that indicates whether the Nagle algorithm is used on a StreamWebSocket object. */
  var noDelay: Boolean
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamWebSocket object. */
  var outboundBufferSizeInBytes: Double
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a StreamWebSocket object. */
  var proxyCredential: PasswordCredential
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a StreamWebSocket object. */
  var serverCredential: PasswordCredential
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  var supportedProtocols: IVector[String]
}

object StreamWebSocketControl {
  @scala.inline
  def apply(
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): StreamWebSocketControl = {
    val __obj = js.Dynamic.literal(noDelay = noDelay.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamWebSocketControl]
  }
}

