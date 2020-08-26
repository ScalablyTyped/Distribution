package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AccidentalNote extends js.Object {
  var accidental: String = js.native
  var note: String = js.native
}

object AccidentalNote {
  @scala.inline
  def apply(accidental: String, note: String): AccidentalNote = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccidentalNote]
  }
  @scala.inline
  implicit class AccidentalNoteOps[Self <: AccidentalNote] (val x: Self) extends AnyVal {
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
    def setAccidental(value: String): Self = this.set("accidental", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
  }
  
}

