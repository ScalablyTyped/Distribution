package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialInteractionSourceLocation extends js.Object {
  var position: js.Any = js.native
   /* unmapped type */ var velocity: js.Any = js.native
}

object SpatialInteractionSourceLocation {
  @scala.inline
  def apply(position: js.Any, velocity: js.Any): SpatialInteractionSourceLocation = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceLocation]
  }
  @scala.inline
  implicit class SpatialInteractionSourceLocationOps[Self <: SpatialInteractionSourceLocation] (val x: Self) extends AnyVal {
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
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setVelocity(value: js.Any): Self = this.set("velocity", value.asInstanceOf[js.Any])
  }
  
}

