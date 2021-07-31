package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialAnchorRawCoordinateSystemAdjustedEventArgs extends StObject {
  
  var oldRawCoordinateSystemToNewRawCoordinateSystemTransform: js.Any
}
object SpatialAnchorRawCoordinateSystemAdjustedEventArgs {
  
  @scala.inline
  def apply(oldRawCoordinateSystemToNewRawCoordinateSystemTransform: js.Any): SpatialAnchorRawCoordinateSystemAdjustedEventArgs = {
    val __obj = js.Dynamic.literal(oldRawCoordinateSystemToNewRawCoordinateSystemTransform = oldRawCoordinateSystemToNewRawCoordinateSystemTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorRawCoordinateSystemAdjustedEventArgs]
  }
  
  @scala.inline
  implicit class SpatialAnchorRawCoordinateSystemAdjustedEventArgsMutableBuilder[Self <: SpatialAnchorRawCoordinateSystemAdjustedEventArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOldRawCoordinateSystemToNewRawCoordinateSystemTransform(value: js.Any): Self = StObject.set(x, "oldRawCoordinateSystemToNewRawCoordinateSystemTransform", value.asInstanceOf[js.Any])
  }
}
