package typings.winrtUwp.Windows.Perception.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialLocation extends js.Object {
  var absoluteAngularAcceleration: js.Any
   /* unmapped type */ var absoluteAngularVelocity: js.Any
   /* unmapped type */ var absoluteLinearAcceleration: js.Any
   /* unmapped type */ var absoluteLinearVelocity: js.Any
   /* unmapped type */ var orientation: js.Any
   /* unmapped type */ var position: js.Any
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
}

