package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpatialLocation extends js.Object {
  var absoluteAngularAcceleration: js.Any = js.native
   /* unmapped type */ var absoluteAngularVelocity: js.Any = js.native
   /* unmapped type */ var absoluteLinearAcceleration: js.Any = js.native
   /* unmapped type */ var absoluteLinearVelocity: js.Any = js.native
   /* unmapped type */ var orientation: js.Any = js.native
   /* unmapped type */ var position: js.Any = js.native
}

object SpatialLocation {
  @scala.inline
  def apply(
    absoluteAngularAcceleration: js.Any,
    absoluteAngularVelocity: js.Any,
    absoluteLinearAcceleration: js.Any,
    absoluteLinearVelocity: js.Any,
    orientation: js.Any,
    position: js.Any
  ): SpatialLocation = {
    val __obj = js.Dynamic.literal(absoluteAngularAcceleration = absoluteAngularAcceleration.asInstanceOf[js.Any], absoluteAngularVelocity = absoluteAngularVelocity.asInstanceOf[js.Any], absoluteLinearAcceleration = absoluteLinearAcceleration.asInstanceOf[js.Any], absoluteLinearVelocity = absoluteLinearVelocity.asInstanceOf[js.Any], orientation = orientation.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialLocation]
  }
  @scala.inline
  implicit class SpatialLocationOps[Self <: SpatialLocation] (val x: Self) extends AnyVal {
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
    def setAbsoluteAngularAcceleration(value: js.Any): Self = this.set("absoluteAngularAcceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteAngularVelocity(value: js.Any): Self = this.set("absoluteAngularVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteLinearAcceleration(value: js.Any): Self = this.set("absoluteLinearAcceleration", value.asInstanceOf[js.Any])
    @scala.inline
    def setAbsoluteLinearVelocity(value: js.Any): Self = this.set("absoluteLinearVelocity", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrientation(value: js.Any): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: js.Any): Self = this.set("position", value.asInstanceOf[js.Any])
  }
  
}

