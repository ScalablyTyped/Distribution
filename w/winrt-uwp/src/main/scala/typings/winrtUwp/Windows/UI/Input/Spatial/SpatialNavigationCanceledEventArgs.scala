package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialNavigationCanceledEventArgs extends js.Object {
  var interactionSourceKind: js.Any
}

object SpatialNavigationCanceledEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialNavigationCanceledEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationCanceledEventArgs]
  }
}

