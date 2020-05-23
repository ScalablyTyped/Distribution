package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialTappedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
   /* unmapped type */ var tapCount: js.Any
   /* unmapped type */ var tryGetPointerPose: js.Any
}

object SpatialTappedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, tapCount: js.Any, tryGetPointerPose: js.Any): SpatialTappedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialTappedEventArgs]
  }
}

