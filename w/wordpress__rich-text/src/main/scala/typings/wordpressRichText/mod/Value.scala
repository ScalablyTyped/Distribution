package typings.wordpressRichText.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Value extends js.Object {
  var activeFormats: js.UndefOr[js.Array[Format]] = js.native
  var end: js.UndefOr[Double] = js.native
  var formats: js.Array[js.UndefOr[js.Array[Format]]] = js.native
  var replacements: js.Array[js.UndefOr[js.Array[Format]]] = js.native
  var start: js.UndefOr[Double] = js.native
  var text: String = js.native
}

object Value {
  @scala.inline
  def apply(
    formats: js.Array[js.UndefOr[js.Array[Format]]],
    replacements: js.Array[js.UndefOr[js.Array[Format]]],
    text: String
  ): Value = {
    val __obj = js.Dynamic.literal(formats = formats.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Value]
  }
  @scala.inline
  implicit class ValueOps[Self <: Value] (val x: Self) extends AnyVal {
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
    def setFormatsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = this.set("formats", js.Array(value :_*))
    @scala.inline
    def setFormats(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = this.set("formats", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplacementsVarargs(value: js.UndefOr[js.Array[Format]]*): Self = this.set("replacements", js.Array(value :_*))
    @scala.inline
    def setReplacements(value: js.Array[js.UndefOr[js.Array[Format]]]): Self = this.set("replacements", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def setActiveFormatsVarargs(value: Format*): Self = this.set("activeFormats", js.Array(value :_*))
    @scala.inline
    def setActiveFormats(value: js.Array[Format]): Self = this.set("activeFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveFormats: Self = this.set("activeFormats", js.undefined)
    @scala.inline
    def setEnd(value: Double): Self = this.set("end", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnd: Self = this.set("end", js.undefined)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
  }
  
}

