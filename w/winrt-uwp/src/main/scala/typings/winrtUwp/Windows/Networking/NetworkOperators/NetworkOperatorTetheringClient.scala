package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about a tethering client. */
@js.native
trait NetworkOperatorTetheringClient extends StObject {
  
  /** Gets a list of hostnames used by this tethering client. */
  var hostNames: IVectorView[HostName] = js.native
  
  /** Gets the MAC address of this tethering client. */
  var macAddress: String = js.native
}
object NetworkOperatorTetheringClient {
  
  @scala.inline
  def apply(hostNames: IVectorView[HostName], macAddress: String): NetworkOperatorTetheringClient = {
    val __obj = js.Dynamic.literal(hostNames = hostNames.asInstanceOf[js.Any], macAddress = macAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkOperatorTetheringClient]
  }
  
  @scala.inline
  implicit class NetworkOperatorTetheringClientMutableBuilder[Self <: NetworkOperatorTetheringClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHostNames(value: IVectorView[HostName]): Self = StObject.set(x, "hostNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = StObject.set(x, "macAddress", value.asInstanceOf[js.Any])
  }
}
