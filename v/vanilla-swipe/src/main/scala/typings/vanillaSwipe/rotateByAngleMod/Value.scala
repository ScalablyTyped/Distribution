package typings.vanillaSwipe.rotateByAngleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Value extends js.Object {
  var x: Double
  var y: Double
}

object Value {
  @scala.inline
  def apply(x: Double, y: Double): Value = {
    val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
}

