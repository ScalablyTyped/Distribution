package typings.winrt.WindowsNs.NetworkingNs.SocketsNs

import typings.winrt.WindowsNs.FoundationNs.CollectionsNs.IVector
import typings.winrt.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageWebSocketControl extends IWebSocketControl {
  var maxMessageSize: Double
  var messageType: SocketMessageType
}

object IMessageWebSocketControl {
  @scala.inline
  def apply(
    maxMessageSize: Double,
    messageType: SocketMessageType,
    outboundBufferSizeInBytes: Double,
    proxyCredential: PasswordCredential,
    serverCredential: PasswordCredential,
    supportedProtocols: IVector[String]
  ): IMessageWebSocketControl = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize, messageType = messageType, outboundBufferSizeInBytes = outboundBufferSizeInBytes, proxyCredential = proxyCredential, serverCredential = serverCredential, supportedProtocols = supportedProtocols)
  
    __obj.asInstanceOf[IMessageWebSocketControl]
  }
}

