package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCodePoint extends js.Object {
  var code: String
  var point: Double
  var x_shift: Double
  var y_shift: Double
}

object AnonCodePoint {
  @scala.inline
  def apply(code: String, point: Double, x_shift: Double, y_shift: Double): AnonCodePoint = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCodePoint]
  }
}

