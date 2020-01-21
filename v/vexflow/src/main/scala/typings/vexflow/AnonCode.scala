package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCode extends js.Object {
  var code: Double
  var shift_y: Double
  var text: String
  var width: Double
}

object AnonCode {
  @scala.inline
  def apply(code: Double, shift_y: Double, text: String, width: Double): AnonCode = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], shift_y = shift_y.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCode]
  }
}

