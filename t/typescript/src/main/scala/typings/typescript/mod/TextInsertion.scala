package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInsertion extends js.Object {
  /** The position in newText the caret should point to after the insertion. */
  var caretOffset: Double
  var newText: java.lang.String
}

object TextInsertion {
  @scala.inline
  def apply(caretOffset: Double, newText: java.lang.String): TextInsertion = {
    val __obj = js.Dynamic.literal(caretOffset = caretOffset.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TextInsertion]
  }
}

