package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialAnchorRawCoordinateSystemAdjustedEventArgs extends StObject {
  
  var oldRawCoordinateSystemToNewRawCoordinateSystemTransform: Any
}
object SpatialAnchorRawCoordinateSystemAdjustedEventArgs {
  
  inline def apply(oldRawCoordinateSystemToNewRawCoordinateSystemTransform: Any): SpatialAnchorRawCoordinateSystemAdjustedEventArgs = {
    val __obj = js.Dynamic.literal(oldRawCoordinateSystemToNewRawCoordinateSystemTransform = oldRawCoordinateSystemToNewRawCoordinateSystemTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorRawCoordinateSystemAdjustedEventArgs]
  }
  
  extension [Self <: SpatialAnchorRawCoordinateSystemAdjustedEventArgs](x: Self) {
    
    inline def setOldRawCoordinateSystemToNewRawCoordinateSystemTransform(value: Any): Self = StObject.set(x, "oldRawCoordinateSystemToNewRawCoordinateSystemTransform", value.asInstanceOf[js.Any])
  }
}
