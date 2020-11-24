package typings.titanium.Titanium.Network

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Fired when the discovered services list is updated
  */
@js.native
trait BonjourBrowserUpdatedservicesEvent extends BonjourBrowserBaseEvent {
  
  /**
    * An array of BonjourService objects corresponding to currently available services.  If you cache this value, including using it as table data, be aware that it could become out of date at any time due to the asynchronous nature of Bonjour service discovery.
    */
  var services: js.Array[BonjourService] = js.native
}
object BonjourBrowserUpdatedservicesEvent {
  
  @scala.inline
  def apply(services: js.Array[BonjourService], source: BonjourBrowser): BonjourBrowserUpdatedservicesEvent = {
    val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowserUpdatedservicesEvent]
  }
  
  @scala.inline
  implicit class BonjourBrowserUpdatedservicesEventOps[Self <: BonjourBrowserUpdatedservicesEvent] (val x: Self) extends AnyVal {
    
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
    def setServicesVarargs(value: BonjourService*): Self = this.set("services", js.Array(value :_*))
    
    @scala.inline
    def setServices(value: js.Array[BonjourService]): Self = this.set("services", value.asInstanceOf[js.Any])
  }
}
