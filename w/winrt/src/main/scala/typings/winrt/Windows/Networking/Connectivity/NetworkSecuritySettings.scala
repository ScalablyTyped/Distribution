package typings.winrt.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NetworkSecuritySettings extends INetworkSecuritySettings

object NetworkSecuritySettings {
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): NetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSecuritySettings]
  }
}

