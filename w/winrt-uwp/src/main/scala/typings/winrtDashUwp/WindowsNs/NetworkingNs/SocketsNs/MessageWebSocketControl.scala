package typings.winrtDashUwp.WindowsNs.NetworkingNs.SocketsNs

import typings.winrtDashUwp.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrtDashUwp.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a MessageWebSocket . */
@JSGlobal("Windows.Networking.Sockets.MessageWebSocketControl")
@js.native
abstract class MessageWebSocketControl () extends js.Object {
  /** The maximum message size, in bytes, for a WebSocket message to be configured on the MessageWebSocket object. */
  var maxMessageSize: Double = js.native
  /** The WebSocket message type to be configured on a MessageWebSocket object for write operations. */
  var messageType: SocketMessageType = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a MessageWebSocket object. */
  var outboundBufferSizeInBytes: Double = js.native
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a MessageWebSocket object. */
  var proxyCredential: PasswordCredential = js.native
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a MessageWebSocket object. */
  var serverCredential: PasswordCredential = js.native
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  var supportedProtocols: IVector[String] = js.native
}

