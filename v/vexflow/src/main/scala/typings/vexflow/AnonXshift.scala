package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonXshift extends js.Object {
  var code: String
  var x_shift: Double
  var y_shift: Double
}

object AnonXshift {
  @scala.inline
  def apply(code: String, x_shift: Double, y_shift: Double): AnonXshift = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], x_shift = x_shift.asInstanceOf[js.Any], y_shift = y_shift.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonXshift]
  }
}

