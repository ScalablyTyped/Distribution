package typings.vexflow

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeLine extends js.Object {
  var code: String
  var line: Double
  var point: Double
}

object Anon_CodeLine {
  @scala.inline
  def apply(code: String, line: Double, point: Double): Anon_CodeLine = {
    val __obj = js.Dynamic.literal(code = code, line = line, point = point)
  
    __obj.asInstanceOf[Anon_CodeLine]
  }
}

