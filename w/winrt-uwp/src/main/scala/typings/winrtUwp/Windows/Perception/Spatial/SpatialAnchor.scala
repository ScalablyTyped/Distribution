package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialAnchor extends StObject {
  
  /* unmapped type */
  var addEventListener: js.Any = js.native
  
  /* unmapped type */
  var coordinateSystem: js.Any = js.native
  
  /* unmapped type */
  var onrawcoordinatesystemadjusted: js.Any = js.native
  
  /* unmapped type */
  var rawCoordinateSystem: js.Any = js.native
  
  /* unmapped type */
  var removeEventListener: js.Any = js.native
}
object SpatialAnchor {
  
  @scala.inline
  def apply(
    addEventListener: js.Any,
    coordinateSystem: js.Any,
    onrawcoordinatesystemadjusted: js.Any,
    rawCoordinateSystem: js.Any,
    removeEventListener: js.Any
  ): SpatialAnchor = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], onrawcoordinatesystemadjusted = onrawcoordinatesystemadjusted.asInstanceOf[js.Any], rawCoordinateSystem = rawCoordinateSystem.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchor]
  }
  
  @scala.inline
  implicit class SpatialAnchorMutableBuilder[Self <: SpatialAnchor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAddEventListener(value: js.Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCoordinateSystem(value: js.Any): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnrawcoordinatesystemadjusted(value: js.Any): Self = StObject.set(x, "onrawcoordinatesystemadjusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawCoordinateSystem(value: js.Any): Self = StObject.set(x, "rawCoordinateSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveEventListener(value: js.Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
  }
}
