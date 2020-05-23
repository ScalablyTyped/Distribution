package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialNavigationCompletedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
   /* unmapped type */ var normalizedOffset: js.Any
}

object SpatialNavigationCompletedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, normalizedOffset: js.Any): SpatialNavigationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], normalizedOffset = normalizedOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationCompletedEventArgs]
  }
}

