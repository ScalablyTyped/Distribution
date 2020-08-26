package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialLocatorAttachedFrameOfReference extends js.Object {
  var adjustHeading: js.Any = js.native
   /* unmapped type */ var getStationaryCoordinateSystemAtTimestamp: js.Any = js.native
   /* unmapped type */ var relativeOrientation: js.Any = js.native
   /* unmapped type */ var relativePosition: js.Any = js.native
   /* unmapped type */ var tryGetRelativeHeadingAtTimestamp: js.Any = js.native
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
  implicit class SpatialLocatorAttachedFrameOfReferenceOps[Self <: SpatialLocatorAttachedFrameOfReference] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAdjustHeading(value: js.Any): Self = this.set("adjustHeading", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetStationaryCoordinateSystemAtTimestamp(value: js.Any): Self = this.set("getStationaryCoordinateSystemAtTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativeOrientation(value: js.Any): Self = this.set("relativeOrientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelativePosition(value: js.Any): Self = this.set("relativePosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setTryGetRelativeHeadingAtTimestamp(value: js.Any): Self = this.set("tryGetRelativeHeadingAtTimestamp", value.asInstanceOf[js.Any])
  }
  
}

