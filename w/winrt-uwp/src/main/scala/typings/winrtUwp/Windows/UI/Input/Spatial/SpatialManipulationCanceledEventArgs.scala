package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialManipulationCanceledEventArgs extends js.Object {
  var interactionSourceKind: js.Any
}

object SpatialManipulationCanceledEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialManipulationCanceledEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialManipulationCanceledEventArgs]
  }
}

