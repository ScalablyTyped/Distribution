package typings.webscopeioReactTextareaAutocomplete.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextToReplaceType extends js.Object {
  var caretPosition: CaretPositionType = js.native
  var key: js.UndefOr[String] = js.native
  var text: String = js.native
}

object TextToReplaceType {
  @scala.inline
  def apply(caretPosition: CaretPositionType, text: String): TextToReplaceType = {
    val __obj = js.Dynamic.literal(caretPosition = caretPosition.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextToReplaceType]
  }
  @scala.inline
  implicit class TextToReplaceTypeOps[Self <: TextToReplaceType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCaretPosition(value: CaretPositionType): Self = this.set("caretPosition", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
  }
  
}

