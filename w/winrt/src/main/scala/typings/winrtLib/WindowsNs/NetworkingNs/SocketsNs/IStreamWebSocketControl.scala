package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStreamWebSocketControl extends IWebSocketControl {
  var noDelay: scala.Boolean
}

object IStreamWebSocketControl {
  @scala.inline
  def apply(
    noDelay: scala.Boolean,
    outboundBufferSizeInBytes: scala.Double,
    proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    supportedProtocols: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ): IStreamWebSocketControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("noDelay")(noDelay)
    __obj.updateDynamic("outboundBufferSizeInBytes")(outboundBufferSizeInBytes)
    __obj.updateDynamic("proxyCredential")(proxyCredential)
    __obj.updateDynamic("serverCredential")(serverCredential)
    __obj.updateDynamic("supportedProtocols")(supportedProtocols)
    __obj.asInstanceOf[IStreamWebSocketControl]
  }
}

