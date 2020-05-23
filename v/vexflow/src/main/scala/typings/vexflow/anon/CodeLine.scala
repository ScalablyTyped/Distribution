package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CodeLine extends js.Object {
  var code: String
  var line: Double
  var point: Double
}

object CodeLine {
  @scala.inline
  def apply(code: String, line: Double, point: Double): CodeLine = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], point = point.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeLine]
  }
}

