package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialLocatorAttachedFrameOfReference extends js.Object {
  var adjustHeading: js.Any
   /* unmapped type */ var getStationaryCoordinateSystemAtTimestamp: js.Any
   /* unmapped type */ var relativeOrientation: js.Any
   /* unmapped type */ var relativePosition: js.Any
   /* unmapped type */ var tryGetRelativeHeadingAtTimestamp: js.Any
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
}

