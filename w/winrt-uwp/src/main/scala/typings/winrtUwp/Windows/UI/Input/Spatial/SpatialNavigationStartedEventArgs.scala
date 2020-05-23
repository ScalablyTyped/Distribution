package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialNavigationStartedEventArgs extends js.Object {
  var interactionSourceKind: js.Any
   /* unmapped type */ var isNavigatingX: js.Any
   /* unmapped type */ var isNavigatingY: js.Any
   /* unmapped type */ var isNavigatingZ: js.Any
   /* unmapped type */ var tryGetPointerPose: js.Any
}

object SpatialNavigationStartedEventArgs {
  @scala.inline
  def apply(
    interactionSourceKind: js.Any,
    isNavigatingX: js.Any,
    isNavigatingY: js.Any,
    isNavigatingZ: js.Any,
    tryGetPointerPose: js.Any
  ): SpatialNavigationStartedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], isNavigatingX = isNavigatingX.asInstanceOf[js.Any], isNavigatingY = isNavigatingY.asInstanceOf[js.Any], isNavigatingZ = isNavigatingZ.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationStartedEventArgs]
  }
}

