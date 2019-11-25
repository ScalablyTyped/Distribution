package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextChange extends js.Object {
  var newText: String
  var span: TextSpan
}

object TextChange {
  @scala.inline
  def apply(newText: String, span: TextSpan): TextChange = {
    val __obj = js.Dynamic.literal(newText = newText.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextChange]
  }
}

