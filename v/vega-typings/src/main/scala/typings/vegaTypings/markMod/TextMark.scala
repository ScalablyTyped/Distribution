package typings.vegaTypings.markMod

import typings.vegaTypings.encodeMod.Encodable
import typings.vegaTypings.encodeMod.TextEncodeEntry
import typings.vegaTypings.vegaTypingsStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextMark
  extends BaseMark
     with Encodable[TextEncodeEntry]
     with Mark {
  var `type`: text = js.native
}

object TextMark {
  @scala.inline
  def apply(`type`: text): TextMark = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMark]
  }
  @scala.inline
  implicit class TextMarkOps[Self <: TextMark] (val x: Self) extends AnyVal {
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
    def setType(value: text): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

