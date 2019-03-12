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
    inspect: () => java.lang.String,
    line: scala.Double
  ): Anon_Annotated = {
    val __obj = js.Dynamic.literal(annotated = annotated, column = column, inspect = js.Any.fromFunction0(inspect), line = line)
  
    __obj.asInstanceOf[Anon_Annotated]
  }
}

