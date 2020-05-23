package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialHoldCanceledEventArgs extends js.Object {
  var interactionSourceKind: js.Any
}

object SpatialHoldCanceledEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialHoldCanceledEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldCanceledEventArgs]
  }
}

