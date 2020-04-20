package typings.vanillaSwipe.calculatePositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait prevPosition extends js.Object {
  var start: Double
  var x: Double
  var y: Double
}

object prevPosition {
  @scala.inline
  def apply(start: Double, x: Double, y: Double): prevPosition = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[prevPosition]
  }
}

