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
    val __obj = js.Dynamic.literal(newText = newText, span = span)
  
    __obj.asInstanceOf[TextChange]
  }
}

