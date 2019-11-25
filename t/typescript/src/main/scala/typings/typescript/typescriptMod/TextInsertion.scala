package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInsertion extends js.Object {
  /** The position in newText the caret should point to after the insertion. */
  var caretOffset: Double
  var newText: String
}

object TextInsertion {
  @scala.inline
  def apply(caretOffset: Double, newText: String): TextInsertion = {
    val __obj = js.Dynamic.literal(caretOffset = caretOffset.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextInsertion]
  }
}

