package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
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
    val __obj = js.Dynamic.literal(outboundBufferSizeInBytes = outboundBufferSizeInBytes, proxyCredential = proxyCredential, serverCredential = serverCredential, supportedProtocols = supportedProtocols)
  
    __obj.asInstanceOf[IWebSocketControl]
  }
}

