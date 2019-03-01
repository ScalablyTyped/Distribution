package typings
package vexflowLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CodeLine extends js.Object {
  var code: java.lang.String
  var line: scala.Double
  var point: scala.Double
}

object Anon_CodeLine {
  @scala.inline
  def apply(code: java.lang.String, line: scala.Double, point: scala.Double): Anon_CodeLine = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("point")(point)
    __obj.asInstanceOf[Anon_CodeLine]
  }
}

