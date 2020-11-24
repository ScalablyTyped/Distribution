package typings.titanium.Titanium.Network

import typings.titanium.ProxyEventMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BonjourBrowserEventMap extends ProxyEventMap {
  
  var updatedservices: BonjourBrowserUpdatedservicesEvent = js.native
}
object BonjourBrowserEventMap {
  
  @scala.inline
  def apply(updatedservices: BonjourBrowserUpdatedservicesEvent): BonjourBrowserEventMap = {
    val __obj = js.Dynamic.literal(updatedservices = updatedservices.asInstanceOf[js.Any])
    __obj.asInstanceOf[BonjourBrowserEventMap]
  }
  
  @scala.inline
  implicit class BonjourBrowserEventMapOps[Self <: BonjourBrowserEventMap] (val x: Self) extends AnyVal {
    
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
    def setUpdatedservices(value: BonjourBrowserUpdatedservicesEvent): Self = this.set("updatedservices", value.asInstanceOf[js.Any])
  }
}
