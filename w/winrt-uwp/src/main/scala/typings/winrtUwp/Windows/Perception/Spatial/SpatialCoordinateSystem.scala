package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialCoordinateSystem extends StObject {
  
  var tryGetTransformTo: js.Any
}
object SpatialCoordinateSystem {
  
  @scala.inline
  def apply(tryGetTransformTo: js.Any): SpatialCoordinateSystem = {
    val __obj = js.Dynamic.literal(tryGetTransformTo = tryGetTransformTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialCoordinateSystem]
  }
  
  @scala.inline
  implicit class SpatialCoordinateSystemMutableBuilder[Self <: SpatialCoordinateSystem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTryGetTransformTo(value: js.Any): Self = StObject.set(x, "tryGetTransformTo", value.asInstanceOf[js.Any])
  }
}
