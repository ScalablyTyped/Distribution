package typings.syntaxDashError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Annotated extends js.Object {
  var annotated: String
  var column: Double
  var line: Double
  def inspect(): String
}

object Anon_Annotated {
  @scala.inline
  def apply(annotated: String, column: Double, inspect: () => String, line: Double): Anon_Annotated = {
    val __obj = js.Dynamic.literal(annotated = annotated.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Annotated]
  }
}

