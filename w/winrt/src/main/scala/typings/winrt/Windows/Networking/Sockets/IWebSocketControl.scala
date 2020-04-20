package typings.winrt.Windows.Networking.Sockets

import typings.winrt.Windows.Foundation.Collections.IVector
import typings.winrt.Windows.Security.Credentials.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketControl extends js.Object {
  var outboundBufferSizeInBytes: Double
  var proxyCredential: PasswordCredential
  var serverCredential: PasswordCredential
  var supportedProtocols: IVector[String]
}

object IWebSocketControl {
  @scala.inline
  def apply(
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): IWebSocketControl = {
    val __obj = js.Dynamic.literal(outboundBufferSizeInBytes = outboundBufferSizeInBytes.asInstanceOf[js.Any], proxyCredential = proxyCredential.asInstanceOf[js.Any], serverCredential = serverCredential.asInstanceOf[js.Any], supportedProtocols = supportedProtocols.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebSocketControl]
  }
}

