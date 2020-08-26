package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialNavigationCompletedEventArgs extends js.Object {
  var interactionSourceKind: js.Any = js.native
   /* unmapped type */ var normalizedOffset: js.Any = js.native
}

object SpatialNavigationCompletedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any, normalizedOffset: js.Any): SpatialNavigationCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any], normalizedOffset = normalizedOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialNavigationCompletedEventArgs]
  }
  @scala.inline
  implicit class SpatialNavigationCompletedEventArgsOps[Self <: SpatialNavigationCompletedEventArgs] (val x: Self) extends AnyVal {
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
    def setNormalizedOffset(value: js.Any): Self = this.set("normalizedOffset", value.asInstanceOf[js.Any])
  }
  
}

