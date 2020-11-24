package typings.titanium

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding floor of the building on which the user is located.
  */
@js.native
trait LocationCoordinatesFloor extends js.Object {
  
  /**
    * The logical floor of the building.
    */
  var level: js.UndefOr[Double] = js.native
}
object LocationCoordinatesFloor {
  
  @scala.inline
  def apply(): LocationCoordinatesFloor = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocationCoordinatesFloor]
  }
  
  @scala.inline
  implicit class LocationCoordinatesFloorOps[Self <: LocationCoordinatesFloor] (val x: Self) extends AnyVal {
    
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
    def setLevel(value: Double): Self = this.set("level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLevel: Self = this.set("level", js.undefined)
  }
}
