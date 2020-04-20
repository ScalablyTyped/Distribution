package typings.vanillaSwipe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAbsX extends js.Object {
  var absX: Double
  var absY: Double
  var deltaX: Double
  var deltaY: Double
  var duration: Double
  var velocity: Double
}

object AnonAbsX {
  @scala.inline
  def apply(absX: Double, absY: Double, deltaX: Double, deltaY: Double, duration: Double, velocity: Double): AnonAbsX = {
    val __obj = js.Dynamic.literal(absX = absX.asInstanceOf[js.Any], absY = absY.asInstanceOf[js.Any], deltaX = deltaX.asInstanceOf[js.Any], deltaY = deltaY.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], velocity = velocity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAbsX]
  }
}

