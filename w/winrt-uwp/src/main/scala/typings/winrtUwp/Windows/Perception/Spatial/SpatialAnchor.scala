package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialAnchor extends StObject {
  
  /* unmapped type */
  var addEventListener: Any
  
  /* unmapped type */
  var coordinateSystem: Any
  
  /* unmapped type */
  var onrawcoordinatesystemadjusted: Any
  
  /* unmapped type */
  var rawCoordinateSystem: Any
  
  /* unmapped type */
  var removeEventListener: Any
}
object SpatialAnchor {
  
  inline def apply(
    addEventListener: Any,
    coordinateSystem: Any,
    onrawcoordinatesystemadjusted: Any,
    rawCoordinateSystem: Any,
    removeEventListener: Any
  ): SpatialAnchor = {
    val __obj = js.Dynamic.literal(addEventListener = addEventListener.asInstanceOf[js.Any], coordinateSystem = coordinateSystem.asInstanceOf[js.Any], onrawcoordinatesystemadjusted = onrawcoordinatesystemadjusted.asInstanceOf[js.Any], rawCoordinateSystem = rawCoordinateSystem.asInstanceOf[js.Any], removeEventListener = removeEventListener.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchor]
  }
  
  extension [Self <: SpatialAnchor](x: Self) {
    
    inline def setAddEventListener(value: Any): Self = StObject.set(x, "addEventListener", value.asInstanceOf[js.Any])
    
    inline def setCoordinateSystem(value: Any): Self = StObject.set(x, "coordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setOnrawcoordinatesystemadjusted(value: Any): Self = StObject.set(x, "onrawcoordinatesystemadjusted", value.asInstanceOf[js.Any])
    
    inline def setRawCoordinateSystem(value: Any): Self = StObject.set(x, "rawCoordinateSystem", value.asInstanceOf[js.Any])
    
    inline def setRemoveEventListener(value: Any): Self = StObject.set(x, "removeEventListener", value.asInstanceOf[js.Any])
  }
}
