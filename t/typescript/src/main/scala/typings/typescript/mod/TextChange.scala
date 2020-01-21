package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var newText: java.lang.String
  var span: TextSpan
}

object TextChange {
  @scala.inline
  def apply(newText: java.lang.String, span: TextSpan): TextChange = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextChange]
  }
}

