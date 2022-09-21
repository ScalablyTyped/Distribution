package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpatialLocatorAttachedFrameOfReference extends StObject {
  
  var adjustHeading: Any
  
  /* unmapped type */
  var getStationaryCoordinateSystemAtTimestamp: Any
  
  /* unmapped type */
  var relativeOrientation: Any
  
  /* unmapped type */
  var relativePosition: Any
  
  /* unmapped type */
  var tryGetRelativeHeadingAtTimestamp: Any
}
object SpatialLocatorAttachedFrameOfReference {
  
  inline def apply(
    adjustHeading: Any,
    getStationaryCoordinateSystemAtTimestamp: Any,
    relativeOrientation: Any,
    relativePosition: Any,
    tryGetRelativeHeadingAtTimestamp: Any
  ): SpatialLocatorAttachedFrameOfReference = {
    val __obj = js.Dynamic.literal(adjustHeading = adjustHeading.asInstanceOf[js.Any], getStationaryCoordinateSystemAtTimestamp = getStationaryCoordinateSystemAtTimestamp.asInstanceOf[js.Any], relativeOrientation = relativeOrientation.asInstanceOf[js.Any], relativePosition = relativePosition.asInstanceOf[js.Any], tryGetRelativeHeadingAtTimestamp = tryGetRelativeHeadingAtTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocatorAttachedFrameOfReference]
  }
  
  extension [Self <: SpatialLocatorAttachedFrameOfReference](x: Self) {
    
    inline def setAdjustHeading(value: Any): Self = StObject.set(x, "adjustHeading", value.asInstanceOf[js.Any])
    
    inline def setGetStationaryCoordinateSystemAtTimestamp(value: Any): Self = StObject.set(x, "getStationaryCoordinateSystemAtTimestamp", value.asInstanceOf[js.Any])
    
    inline def setRelativeOrientation(value: Any): Self = StObject.set(x, "relativeOrientation", value.asInstanceOf[js.Any])
    
    inline def setRelativePosition(value: Any): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
    
    inline def setTryGetRelativeHeadingAtTimestamp(value: Any): Self = StObject.set(x, "tryGetRelativeHeadingAtTimestamp", value.asInstanceOf[js.Any])
  }
}
