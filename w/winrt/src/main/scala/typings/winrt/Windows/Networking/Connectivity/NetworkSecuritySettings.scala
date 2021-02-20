package typings.winrt.Windows.Networking.Connectivity

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkSecuritySettings extends INetworkSecuritySettings
object NetworkSecuritySettings {
  
  @scala.inline
  def apply(networkAuthenticationType: NetworkAuthenticationType, networkEncryptionType: NetworkEncryptionType): NetworkSecuritySettings = {
    val __obj = js.Dynamic.literal(networkAuthenticationType = networkAuthenticationType.asInstanceOf[js.Any], networkEncryptionType = networkEncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkSecuritySettings]
  }
}
