package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialHoldCompletedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
}

object SpatialHoldCompletedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialHoldCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldCompletedEventArgs]
  }
}

