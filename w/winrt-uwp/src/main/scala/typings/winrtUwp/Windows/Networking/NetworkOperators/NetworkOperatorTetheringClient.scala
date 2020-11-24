package typings.winrtUwp.Windows.Networking.NetworkOperators

import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Networking.HostName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Contains details about a tethering client. */
@js.native
trait NetworkOperatorTetheringClient extends js.Object {
  
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
  implicit class NetworkOperatorTetheringClientOps[Self <: NetworkOperatorTetheringClient] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setHostNames(value: IVectorView[HostName]): Self = this.set("hostNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMacAddress(value: String): Self = this.set("macAddress", value.asInstanceOf[js.Any])
  }
}
