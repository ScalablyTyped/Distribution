package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Leftshift extends js.Object {
  var left_shift: Double
  var right_shift: Double
  var text_line: Double
}

object Leftshift {
  @scala.inline
  def apply(left_shift: Double, right_shift: Double, text_line: Double): Leftshift = {
    val __obj = js.Dynamic.literal(left_shift = left_shift.asInstanceOf[js.Any], right_shift = right_shift.asInstanceOf[js.Any], text_line = text_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Leftshift]
  }
}

