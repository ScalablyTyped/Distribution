package typings.vanillaSwipe.calculatePositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var absX: Double
  var absY: Double
  var deltaX: Double
  var deltaY: Double
  var duration: Double
  var velocity: Double
}

object Value {
  @scala.inline
  def apply(absX: Double, absY: Double, deltaX: Double, deltaY: Double, duration: Double, velocity: Double): Value = {
    val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

