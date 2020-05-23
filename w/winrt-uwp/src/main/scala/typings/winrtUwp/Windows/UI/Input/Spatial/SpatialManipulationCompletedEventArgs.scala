package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialManipulationCompletedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
   /* unmapped type */ var tryGetCumulativeDelta: js.Any
}

object SpatialManipulationCompletedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetCumulativeDelta: js.Any): SpatialManipulationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationCompletedEventArgs]
  }
}

