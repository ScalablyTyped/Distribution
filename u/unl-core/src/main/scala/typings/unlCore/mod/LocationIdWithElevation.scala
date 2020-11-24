package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocationIdWithElevation extends js.Object {
  
  var elevation: Double = js.native
  
  var elevationType: ElevationType = js.native
  
  var locationId: String = js.native
}
object LocationIdWithElevation {
  
  @scala.inline
  def apply(elevation: Double, elevationType: ElevationType, locationId: String): LocationIdWithElevation = {
    val __obj = js.Dynamic.literal(elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], locationId = locationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocationIdWithElevation]
  }
  
  @scala.inline
  implicit class LocationIdWithElevationOps[Self <: LocationIdWithElevation] (val x: Self) extends AnyVal {
    
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
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationType(value: ElevationType): Self = this.set("elevationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationId(value: String): Self = this.set("locationId", value.asInstanceOf[js.Any])
  }
}
