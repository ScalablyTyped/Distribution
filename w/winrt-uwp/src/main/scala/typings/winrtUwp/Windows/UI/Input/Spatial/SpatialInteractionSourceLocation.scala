package typings.winrtUwp.Windows.UI.Input.Spatial

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpatialInteractionSourceLocation extends js.Object {
  var position: js.Any
   /* unmapped type */ var velocity: js.Any
}

object SpatialInteractionSourceLocation {
  @scala.inline
  def apply(position: js.Any, velocity: js.Any): SpatialInteractionSourceLocation = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpatialInteractionSourceLocation]
  }
}

