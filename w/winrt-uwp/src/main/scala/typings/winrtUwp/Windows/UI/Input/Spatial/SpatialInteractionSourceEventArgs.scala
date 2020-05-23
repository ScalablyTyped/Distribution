package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialInteractionSourceEventArgs extends js.Object {
  var state: js.Any
}

object SpatialInteractionSourceEventArgs {
  @scala.inline
  def apply(state: js.Any): SpatialInteractionSourceEventArgs = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceEventArgs]
  }
}

