package typings.winrtUwp.Windows.Networking.NetworkOperators

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to configure and create a NetworkOperatorTetheringAccessPointConfiguration object that contains a specific network account ID (SSID) and specifies the passphrase used to authenticate clients trying to establish a network connection to the tethering network. */
trait NetworkOperatorTetheringAccessPointConfiguration extends StObject {
  
  /** Gets or sets the passphrase used to authenticate the connection. */
  var passphrase: String
  
  /** Gets or sets the network account ID. */
  var ssid: String
}
object NetworkOperatorTetheringAccessPointConfiguration {
  
  inline def apply(passphrase: String, ssid: String): NetworkOperatorTetheringAccessPointConfiguration = {
    val __obj = js.Dynamic.literal(passphrase = passphrase.asInstanceOf[js.Any], ssid = ssid.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringAccessPointConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkOperatorTetheringAccessPointConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPassphrase(value: String): Self = StObject.set(x, "passphrase", value.asInstanceOf[js.Any])
    
    inline def setSsid(value: String): Self = StObject.set(x, "ssid", value.asInstanceOf[js.Any])
  }
}
