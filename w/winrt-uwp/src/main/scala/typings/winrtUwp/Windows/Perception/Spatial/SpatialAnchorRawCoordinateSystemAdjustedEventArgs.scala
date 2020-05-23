package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialAnchorRawCoordinateSystemAdjustedEventArgs extends js.Object {
  var oldRawCoordinateSystemToNewRawCoordinateSystemTransform: js.Any
}

object SpatialAnchorRawCoordinateSystemAdjustedEventArgs {
  @scala.inline
  def apply(oldRawCoordinateSystemToNewRawCoordinateSystemTransform: js.Any): SpatialAnchorRawCoordinateSystemAdjustedEventArgs = {
    val __obj = js.Dynamic.literal(oldRawCoordinateSystemToNewRawCoordinateSystemTransform = oldRawCoordinateSystemToNewRawCoordinateSystemTransform.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialAnchorRawCoordinateSystemAdjustedEventArgs]
  }
}

