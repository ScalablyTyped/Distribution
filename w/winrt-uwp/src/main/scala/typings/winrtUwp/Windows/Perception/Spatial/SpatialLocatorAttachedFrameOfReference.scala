package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialLocatorAttachedFrameOfReference extends StObject {
  
  var adjustHeading: js.Any
  
  /* unmapped type */
  var getStationaryCoordinateSystemAtTimestamp: js.Any
  
  /* unmapped type */
  var relativeOrientation: js.Any
  
  /* unmapped type */
  var relativePosition: js.Any
  
  /* unmapped type */
  var tryGetRelativeHeadingAtTimestamp: js.Any
}
object SpatialLocatorAttachedFrameOfReference {
  
  inline def apply(
    adjustHeading: js.Any,
    getStationaryCoordinateSystemAtTimestamp: js.Any,
    relativeOrientation: js.Any,
    relativePosition: js.Any,
    tryGetRelativeHeadingAtTimestamp: js.Any
  ): SpatialLocatorAttachedFrameOfReference = {
    val __obj = js.Dynamic.literal(adjustHeading = adjustHeading.asInstanceOf[js.Any], getStationaryCoordinateSystemAtTimestamp = getStationaryCoordinateSystemAtTimestamp.asInstanceOf[js.Any], relativeOrientation = relativeOrientation.asInstanceOf[js.Any], relativePosition = relativePosition.asInstanceOf[js.Any], tryGetRelativeHeadingAtTimestamp = tryGetRelativeHeadingAtTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocatorAttachedFrameOfReference]
  }
  
  extension [Self <: SpatialLocatorAttachedFrameOfReference](x: Self) {
    
    inline def setAdjustHeading(value: js.Any): Self = StObject.set(x, "adjustHeading", value.asInstanceOf[js.Any])
    
    inline def setGetStationaryCoordinateSystemAtTimestamp(value: js.Any): Self = StObject.set(x, "getStationaryCoordinateSystemAtTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRelativeOrientation(value: js.Any): Self = StObject.set(x, "relativeOrientation", value.asInstanceOf[js.Any])
    
    inline def setRelativePosition(value: js.Any): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
    
    inline def setTryGetRelativeHeadingAtTimestamp(value: js.Any): Self = StObject.set(x, "tryGetRelativeHeadingAtTimestamp", value.asInstanceOf[js.Any])
  }
}
