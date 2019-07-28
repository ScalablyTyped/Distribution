package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChangeRange extends js.Object {
  var newLength: Double
  var span: TextSpan
}

object TextChangeRange {
  @scala.inline
  def apply(newLength: Double, span: TextSpan): TextChangeRange = {
    val __obj = js.Dynamic.literal(newLength = newLength, span = span)
  
    __obj.asInstanceOf[TextChangeRange]
  }
}

