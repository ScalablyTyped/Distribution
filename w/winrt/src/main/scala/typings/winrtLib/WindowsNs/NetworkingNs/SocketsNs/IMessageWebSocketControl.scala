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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("maxMessageSize")(maxMessageSize)
    __obj.updateDynamic("messageType")(messageType)
    __obj.updateDynamic("outboundBufferSizeInBytes")(outboundBufferSizeInBytes)
    __obj.updateDynamic("proxyCredential")(proxyCredential)
    __obj.updateDynamic("serverCredential")(serverCredential)
    __obj.updateDynamic("supportedProtocols")(supportedProtocols)
    __obj.asInstanceOf[IMessageWebSocketControl]
  }
}

