package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Change extends js.Object {
  var accidental: String = js.native
  var change: Boolean = js.native
  var note: String = js.native
}

object Change {
  @scala.inline
  def apply(accidental: String, change: Boolean, note: String): Change = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  @scala.inline
  implicit class ChangeOps[Self <: Change] (val x: Self) extends AnyVal {
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
    def setChange(value: Boolean): Self = this.set("change", value.asInstanceOf[js.Any])
    @scala.inline
    def setNote(value: String): Self = this.set("note", value.asInstanceOf[js.Any])
  }
  
}

