package typings.winrtUwp.Windows.Networking.Sockets

import typings.winrtUwp.Windows.Foundation.Collections.IVector
import typings.winrtUwp.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides socket control data on a StreamWebSocket object. */
@js.native
trait StreamWebSocketControl extends js.Object {
  /** A value that indicates whether the Nagle algorithm is used on a StreamWebSocket object. */
  var noDelay: Boolean = js.native
  /** The size, in bytes, of the send buffer to be used for sending data on a StreamWebSocket object. */
  var outboundBufferSizeInBytes: Double = js.native
  /** The credential to use to authenticate to the proxy server through HTTP header authentication using a StreamWebSocket object. */
  var proxyCredential: PasswordCredential = js.native
  /** The credential to use to authenticate to the WebSocket server through HTTP header authentication using a StreamWebSocket object. */
  var serverCredential: PasswordCredential = js.native
  /** Gets a collection that can be used to add a list of supported sub-protocols that will be advertised to the server during the connect handshake. */
  var supportedProtocols: IVector[String] = js.native
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
  @scala.inline
  implicit class StreamWebSocketControlOps[Self <: StreamWebSocketControl] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOutboundBufferSizeInBytes(value: Double): Self = this.set("outboundBufferSizeInBytes", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxyCredential(value: PasswordCredential): Self = this.set("proxyCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def setServerCredential(value: PasswordCredential): Self = this.set("serverCredential", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupportedProtocols(value: IVector[String]): Self = this.set("supportedProtocols", value.asInstanceOf[js.Any])
  }
  
}

