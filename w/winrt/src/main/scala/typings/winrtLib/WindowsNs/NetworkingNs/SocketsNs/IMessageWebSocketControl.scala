package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMessageWebSocketControl extends IWebSocketControl {
  var maxMessageSize: scala.Double
  var messageType: SocketMessageType
}

object IMessageWebSocketControl {
  @scala.inline
  def apply(
    maxMessageSize: scala.Double,
    messageType: SocketMessageType,
    outboundBufferSizeInBytes: scala.Double,
    proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    supportedProtocols: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ): IMessageWebSocketControl = {
    val __obj = js.Dynamic.literal(maxMessageSize = maxMessageSize, messageType = messageType, outboundBufferSizeInBytes = outboundBufferSizeInBytes, proxyCredential = proxyCredential, serverCredential = serverCredential, supportedProtocols = supportedProtocols)
  
    __obj.asInstanceOf[IMessageWebSocketControl]
  }
}

