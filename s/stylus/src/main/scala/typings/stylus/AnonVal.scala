package typings.stylus

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonVal extends js.Object {
  var __type: String
  var column: Double
  var filename: String
  var lineno: Double
  var `type`: String
  var `val`: Double
}

object AnonVal {
  @scala.inline
  def apply(__type: String, column: Double, filename: String, lineno: Double, `type`: String, `val`: Double): AnonVal = {
    val __obj = js.Dynamic.literal(__type = __type.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], lineno = lineno.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.updateDynamic("val")(`val`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonVal]
  }
}

