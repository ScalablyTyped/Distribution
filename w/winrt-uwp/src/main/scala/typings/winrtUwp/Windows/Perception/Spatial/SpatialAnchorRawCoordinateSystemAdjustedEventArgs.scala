package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialAnchorRawCoordinateSystemAdjustedEventArgs extends js.Object {
  var oldRawCoordinateSystemToNewRawCoordinateSystemTransform: js.Any = js.native
}

object SpatialAnchorRawCoordinateSystemAdjustedEventArgs {
  @scala.inline
  def apply(oldRawCoordinateSystemToNewRawCoordinateSystemTransform: js.Any): SpatialAnchorRawCoordinateSystemAdjustedEventArgs = {
    val __obj = js.Dynamic.literal(oldRawCoordinateSystemToNewRawCoordinateSystemTransform = oldRawCoordinateSystemToNewRawCoordinateSystemTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorRawCoordinateSystemAdjustedEventArgs]
  }
  @scala.inline
  implicit class SpatialAnchorRawCoordinateSystemAdjustedEventArgsOps[Self <: SpatialAnchorRawCoordinateSystemAdjustedEventArgs] (val x: Self) extends AnyVal {
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
    def setOldRawCoordinateSystemToNewRawCoordinateSystemTransform(value: js.Any): Self = this.set("oldRawCoordinateSystemToNewRawCoordinateSystemTransform", value.asInstanceOf[js.Any])
  }
  
}

