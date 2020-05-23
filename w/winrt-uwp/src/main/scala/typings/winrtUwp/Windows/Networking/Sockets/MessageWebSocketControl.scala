package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a MessageWebSocket . */
trait MessageWebSocketControl extends js.Object {
  /** The maximum message size, in bytes, for a WebSocket message to be configured on the MessageWebSocket object. */
  var maxMessageSize: Double
  /** The WebSocket message type to be configured on a MessageWebSocket object for write operations. */
  var messageType: SocketMessageType
  /** The size, in bytes, of the send buffer to be used for sending data on a MessageWebSocket object. */
  var outboundBufferSizeInBytes: Double
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a MessageWebSocket object. */
  var proxyCredential: PasswordCredential
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a MessageWebSocket object. */
  var serverCredential: PasswordCredential
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  var supportedProtocols: IVector[String]
}

object MessageWebSocketControl {
  @scala.inline
  def apply(
    maxMessageSize: Double,
    messageType: SocketMessageType,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): MessageWebSocketControl = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize.asInstanceOf[js.Any], messageType = messageType.asInstanceOf[js.Any], outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageWebSocketControl]
  }
}

