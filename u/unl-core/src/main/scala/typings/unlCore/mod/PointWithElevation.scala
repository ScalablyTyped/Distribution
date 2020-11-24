package typings.unlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointWithElevation extends Point {
  
  var bounds: BoundsWithElevation = js.native
  
  var elevation: Double = js.native
  
  var elevationType: ElevationType = js.native
}
object PointWithElevation {
  
  @scala.inline
  def apply(
    bounds: BoundsWithElevation,
    elevation: Double,
    elevationType: ElevationType,
    lat: Double,
    lon: Double
  ): PointWithElevation = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], elevation = elevation.asInstanceOf[js.Any], elevationType = elevationType.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lon = lon.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointWithElevation]
  }
  
  @scala.inline
  implicit class PointWithElevationOps[Self <: PointWithElevation] (val x: Self) extends AnyVal {
    
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
    def setBounds(value: BoundsWithElevation): Self = this.set("bounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevation(value: Double): Self = this.set("elevation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElevationType(value: ElevationType): Self = this.set("elevationType", value.asInstanceOf[js.Any])
  }
}
