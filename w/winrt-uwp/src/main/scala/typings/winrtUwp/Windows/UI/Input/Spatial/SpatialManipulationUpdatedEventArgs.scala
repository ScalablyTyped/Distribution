package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialManipulationUpdatedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
   /* unmapped type */ var tryGetCumulativeDelta: js.Any
}

object SpatialManipulationUpdatedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetCumulativeDelta: js.Any): SpatialManipulationUpdatedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetCumulativeDelta = tryGetCumulativeDelta.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationUpdatedEventArgs]
  }
}

