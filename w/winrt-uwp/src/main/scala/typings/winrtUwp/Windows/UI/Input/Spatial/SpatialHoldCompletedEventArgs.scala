package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialHoldCompletedEventArgs extends js.Object {
  var interactionSourceKind: js.Any = js.native
}

object SpatialHoldCompletedEventArgs {
  @scala.inline
  def apply(interactionSourceKind: js.Any): SpatialHoldCompletedEventArgs = {
    val __obj = js.Dynamic.literal(interactionSourceKind = interactionSourceKind.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialHoldCompletedEventArgs]
  }
  @scala.inline
  implicit class SpatialHoldCompletedEventArgsOps[Self <: SpatialHoldCompletedEventArgs] (val x: Self) extends AnyVal {
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
  }
  
}

