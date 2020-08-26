package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialTappedEventArgs extends js.Object {
  var interactionSourceKind: js.Any = js.native
   /* unmapped type */ var tapCount: js.Any = js.native
   /* unmapped type */ var tryGetPointerPose: js.Any = js.native
}

object SpatialTappedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, tapCount: js.Any, tryGetPointerPose: js.Any): SpatialTappedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], tapCount = tapCount.asInstanceOf[js.Any], tryGetPointerPose = tryGetPointerPose.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialTappedEventArgs]
  }
  @scala.inline
  implicit class SpatialTappedEventArgsOps[Self <: SpatialTappedEventArgs] (val x: Self) extends AnyVal {
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
    def setTapCount(value: js.Any): Self = this.set("tapCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setTryGetPointerPose(value: js.Any): Self = this.set("tryGetPointerPose", value.asInstanceOf[js.Any])
  }
  
}

