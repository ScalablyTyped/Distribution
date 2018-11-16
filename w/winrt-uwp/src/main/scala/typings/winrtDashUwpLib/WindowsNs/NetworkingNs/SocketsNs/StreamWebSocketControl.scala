package typings
package winrtDashUwpLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamWebSocket object. */
@JSGlobal("Windows.Networking.Sockets.StreamWebSocketControl")
@js.native
abstract class StreamWebSocketControl () extends js.Object {
  /** A value that indicates whether the Nagle algorithm is used on a StreamWebSocket object. */
  var noDelay: scala.Boolean = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamWebSocket object. */
  var outboundBufferSizeInBytes: scala.Double = js.native
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a StreamWebSocket object. */
  var proxyCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a StreamWebSocket object. */
  var serverCredential: winrtDashUwpLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential = js.native
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  var supportedProtocols: winrtDashUwpLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String] = js.native
}

