package typings.titanium

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Simple object holding floor of the building on which the user is located.
  */
@js.native
trait LocationCoordinatesFloor extends StObject {
  
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
  implicit class LocationCoordinatesFloorMutableBuilder[Self <: LocationCoordinatesFloor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
