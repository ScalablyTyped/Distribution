package typings.typescript.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextInsertion extends js.Object {
  /** The position in newText the caret should point to after the insertion. */
  var caretOffset: Double = js.native
  var newText: java.lang.String = js.native
}

object TextInsertion {
  @scala.inline
  def apply(caretOffset: Double, newText: java.lang.String): TextInsertion = {
    val __obj = js.Dynamic.literal(caretOffset = caretOffset.asInstanceOf[js.Any], newText = newText.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextInsertion]
  }
  @scala.inline
  implicit class TextInsertionOps[Self <: TextInsertion] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaretOffset(value: Double): Self = this.set("caretOffset", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewText(value: java.lang.String): Self = this.set("newText", value.asInstanceOf[js.Any])
  }
  
}

