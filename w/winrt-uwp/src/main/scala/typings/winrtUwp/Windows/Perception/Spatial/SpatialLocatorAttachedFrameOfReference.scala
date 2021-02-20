package typings.winrtUwp.Windows.Perception.Spatial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpatialLocatorAttachedFrameOfReference extends StObject {
  
  var adjustHeading: js.Any = js.native
  
  /* unmapped type */
  var getStationaryCoordinateSystemAtTimestamp: js.Any = js.native
  
  /* unmapped type */
  var relativeOrientation: js.Any = js.native
  
  /* unmapped type */
  var relativePosition: js.Any = js.native
  
  /* unmapped type */
  var tryGetRelativeHeadingAtTimestamp: js.Any = js.native
}
object SpatialLocatorAttachedFrameOfReference {
  
  @scala.inline
  def apply(
    adjustHeading: js.Any,
    getStationaryCoordinateSystemAtTimestamp: js.Any,
    relativeOrientation: js.Any,
    relativePosition: js.Any,
    tryGetRelativeHeadingAtTimestamp: js.Any
  ): SpatialLocatorAttachedFrameOfReference = {
    val __obj = js.Dynamic.literal(adjustHeading = adjustHeading.asInstanceOf[js.Any], getStationaryCoordinateSystemAtTimestamp = getStationaryCoordinateSystemAtTimestamp.asInstanceOf[js.Any], relativeOrientation = relativeOrientation.asInstanceOf[js.Any], relativePosition = relativePosition.asInstanceOf[js.Any], tryGetRelativeHeadingAtTimestamp = tryGetRelativeHeadingAtTimestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocatorAttachedFrameOfReference]
  }
  
  @scala.inline
  implicit class SpatialLocatorAttachedFrameOfReferenceMutableBuilder[Self <: SpatialLocatorAttachedFrameOfReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdjustHeading(value: js.Any): Self = StObject.set(x, "adjustHeading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetStationaryCoordinateSystemAtTimestamp(value: js.Any): Self = StObject.set(x, "getStationaryCoordinateSystemAtTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativeOrientation(value: js.Any): Self = StObject.set(x, "relativeOrientation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelativePosition(value: js.Any): Self = StObject.set(x, "relativePosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTryGetRelativeHeadingAtTimestamp(value: js.Any): Self = StObject.set(x, "tryGetRelativeHeadingAtTimestamp", value.asInstanceOf[js.Any])
  }
}
