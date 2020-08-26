package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialStationaryFrameOfReference extends js.Object {
  var coordinateSystem: js.Any = js.native
}

object SpatialStationaryFrameOfReference {
  @scala.inline
  def apply(coordinateSystem: js.Any): SpatialStationaryFrameOfReference = {
    val __obj = js.Dynamic.literal(coordinateSystem = coordinateSystem.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialStationaryFrameOfReference]
  }
  @scala.inline
  implicit class SpatialStationaryFrameOfReferenceOps[Self <: SpatialStationaryFrameOfReference] (val x: Self) extends AnyVal {
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
    def setCoordinateSystem(value: js.Any): Self = this.set("coordinateSystem", value.asInstanceOf[js.Any])
  }
  
}

