package typings.typescript.mod

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
    val __obj = js.Dynamic.literal(newLength = newLength.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChangeRange]
  }
}

