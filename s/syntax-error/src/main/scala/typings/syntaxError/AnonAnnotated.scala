package typings.syntaxError

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAnnotated extends js.Object {
  var annotated: String
  var column: Double
  var line: Double
  def inspect(): String
}

object AnonAnnotated {
  @scala.inline
  def apply(annotated: String, column: Double, inspect: () => String, line: Double): AnonAnnotated = {
    val __obj = js.Dynamic.literal(annotated = annotated.asInstanceOf[js.Any], column = column.asInstanceOf[js.Any], inspect = js.Any.fromFunction0(inspect), line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonAnnotated]
  }
}

