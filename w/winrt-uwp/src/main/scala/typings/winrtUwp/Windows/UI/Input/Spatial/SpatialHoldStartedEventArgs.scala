package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialHoldStartedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
   /* unmapped type */ var tryGetPointerPose: js.Any
}

object SpatialHoldStartedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, tryGetPointerPose: js.Any): SpatialHoldStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldStartedEventArgs]
  }
}

