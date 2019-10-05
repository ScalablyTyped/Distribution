package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamWebSocketControl extends IWebSocketControl {
  var noDelay: Boolean
}

object IStreamWebSocketControl {
  @scala.inline
  def apply(
    noDelay: Boolean,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): IStreamWebSocketControl = {
    val __obj = js.Dynamic.literal(noDelay = noDelay, outboundBufferSizeInBytes = outboundBufferSizeInBytes, proxyCredential = proxyCredential, serverCredential = serverCredential, supportedProtocols = supportedProtocols)
  
    __obj.asInstanceOf[IStreamWebSocketControl]
  }
}

