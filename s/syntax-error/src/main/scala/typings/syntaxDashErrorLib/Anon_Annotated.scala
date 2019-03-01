package typings
package syntaxDashErrorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Annotated extends js.Object {
  var annotated: java.lang.String
  var column: scala.Double
  var line: scala.Double
  def inspect(): java.lang.String
}

object Anon_Annotated {
  @scala.inline
  def apply(
    annotated: java.lang.String,
    column: scala.Double,
    inspect: js.Function0[java.lang.String],
    line: scala.Double
  ): Anon_Annotated = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("annotated")(annotated)
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("inspect")(inspect)
    __obj.updateDynamic("line")(line)
    __obj.asInstanceOf[Anon_Annotated]
  }
}

