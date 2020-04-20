package typings.vanillaSwipe.calculatePositionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait nextPosition extends js.Object {
  var x: Double
  var y: Double
}

object nextPosition {
  @scala.inline
  def apply(x: Double, y: Double): nextPosition = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[nextPosition]
  }
}

