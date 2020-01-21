package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLeftshift extends js.Object {
  var left_shift: Double
  var right_shift: Double
  var text_line: Double
}

object AnonLeftshift {
  @scala.inline
  def apply(left_shift: Double, right_shift: Double, text_line: Double): AnonLeftshift = {
    val __obj = js.Dynamic.literal(left_shift = left_shift.asInstanceOf[js.Any], right_shift = right_shift.asInstanceOf[js.Any], text_line = text_line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLeftshift]
  }
}

