package typings.winrtUwp.Windows.Networking.Connectivity

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents the current network security settings. */
trait NetworkSecuritySettings extends js.Object {
  /** Retrieves the type of authentication used by the network. */
  var networkAuthenticationType: NetworkAuthenticationType
  /** Retrieves the type of encryption used by the network. */
  var networkEncryptionType: NetworkEncryptionType
}

object NetworkSecuritySettings {
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): NetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSecuritySettings]
  }
}

