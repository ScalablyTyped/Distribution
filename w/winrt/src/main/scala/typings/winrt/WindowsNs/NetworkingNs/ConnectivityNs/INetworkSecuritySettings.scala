package typings.winrt.WindowsNs.NetworkingNs.ConnectivityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INetworkSecuritySettings extends js.Object {
  var networkAuthenticationType: NetworkAuthenticationType
  var networkEncryptionType: NetworkEncryptionType
}

object INetworkSecuritySettings {
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): INetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType, networkEncryptionType = networkEncryptionType)
  
    __obj.asInstanceOf[INetworkSecuritySettings]
  }
}

