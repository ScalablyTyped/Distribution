package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialCoordinateSystem extends StObject {
  
  var tryGetTransformTo: Any
}
object SpatialCoordinateSystem {
  
  inline def apply(tryGetTransformTo: Any): SpatialCoordinateSystem = {
    val __obj = js.Dynamic.literal(tryGetTransformTo = tryGetTransformTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialCoordinateSystem]
  }
  
  extension [Self <: SpatialCoordinateSystem](x: Self) {
    
    inline def setTryGetTransformTo(value: Any): Self = StObject.set(x, "tryGetTransformTo", value.asInstanceOf[js.Any])
  }
}
