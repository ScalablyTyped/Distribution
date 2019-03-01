package typings
package winrtLib.WindowsNs.NetworkingNs.SocketsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebSocketControl extends js.Object {
  var outboundBufferSizeInBytes: scala.Double
  var proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
  var serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential
  var supportedProtocols: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
}

object IWebSocketControl {
  @scala.inline
  def apply(
    outboundBufferSizeInBytes: scala.Double,
    proxyCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    serverCredential: winrtLib.WindowsNs.SecurityNs.CredentialsNs.PasswordCredential,
    supportedProtocols: winrtLib.WindowsNs.FoundationNs.CollectionsNs.IVector[java.lang.String]
  ): IWebSocketControl = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("outboundBufferSizeInBytes")(outboundBufferSizeInBytes)
    __obj.updateDynamic("proxyCredential")(proxyCredential)
    __obj.updateDynamic("serverCredential")(serverCredential)
    __obj.updateDynamic("supportedProtocols")(supportedProtocols)
    __obj.asInstanceOf[IWebSocketControl]
  }
}

