package typings.winrt.Windows.Devices.Geolocation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IGeoposition extends js.Object {
  
  var civicAddress: CivicAddress = js.native
  
  var coordinate: Geocoordinate = js.native
}
object IGeoposition {
  
  @scala.inline
  def apply(civicAddress: CivicAddress, coordinate: Geocoordinate): IGeoposition = {
    val __obj = js.Dynamic.literal(civicAddress = civicAddress.asInstanceOf[js.Any], coordinate = coordinate.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeoposition]
  }
  
  @scala.inline
  implicit class IGeopositionOps[Self <: IGeoposition] (val x: Self) extends AnyVal {
    
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
    def setCivicAddress(value: CivicAddress): Self = this.set("civicAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinate(value: Geocoordinate): Self = this.set("coordinate", value.asInstanceOf[js.Any])
  }
}
