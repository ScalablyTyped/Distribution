package typings
package typescriptLib.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextInsertion extends js.Object {
  /** The position in newText the caret should point to after the insertion. */
  var caretOffset: scala.Double
  var newText: java.lang.String
}

object TextInsertion {
  @scala.inline
  def apply(caretOffset: scala.Double, newText: java.lang.String): TextInsertion = {
    val __obj = js.Dynamic.literal(caretOffset = caretOffset, newText = newText)
  
    __obj.asInstanceOf[TextInsertion]
  }
}

