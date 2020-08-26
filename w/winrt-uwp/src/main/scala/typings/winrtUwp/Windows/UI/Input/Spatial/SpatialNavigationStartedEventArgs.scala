package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialNavigationStartedEventArgs extends js.Object {
  var interactionSourceKind: js.Any = js.native
   /* unmapped type */ var isNavigatingX: js.Any = js.native
   /* unmapped type */ var isNavigatingY: js.Any = js.native
   /* unmapped type */ var isNavigatingZ: js.Any = js.native
   /* unmapped type */ var tryGetPointerPose: js.Any = js.native
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
  @scala.inline
  implicit class SpatialNavigationStartedEventArgsOps[Self <: SpatialNavigationStartedEventArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setInteractionSourceKind(value: js.Any): Self = this.set("interactionSourceKind", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNavigatingX(value: js.Any): Self = this.set("isNavigatingX", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNavigatingY(value: js.Any): Self = this.set("isNavigatingY", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsNavigatingZ(value: js.Any): Self = this.set("isNavigatingZ", value.asInstanceOf[js.Any])
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = this.set("tryGetPointerPose", value.asInstanceOf[js.Any])
  }
  
}

