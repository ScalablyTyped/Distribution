package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to configure and create a NetworkOperatorTetheringAccessPointConfiguration object that contains a specific network account ID (SSID) and specifies the passphrase used to authenticate clients trying to establish a network connection to the tethering network. */
@js.native
trait NetworkOperatorTetheringAccessPointConfiguration extends StObject {
  
  /** Gets or sets the passphrase used to authenticate the connection. */
  var passphrase: String = js.native
  
  /** Gets or sets the network account ID. */
  var ssid: String = js.native
}
object NetworkOperatorTetheringAccessPointConfiguration {
  
  @scala.inline
  def apply(passphrase: String, ssid: String): NetworkOperatorTetheringAccessPointConfiguration = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringAccessPointConfiguration]
  }
  
  @scala.inline
  implicit class NetworkOperatorTetheringAccessPointConfigurationMutableBuilder[Self <: NetworkOperatorTetheringAccessPointConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
  }
}
