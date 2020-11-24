package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note extends js.Object {
  
  var accidental: Double = js.native
  
  var note: Double = js.native
}
object Note {
  
  @scala.inline
  def apply(accidental: Double, note: Double): Note = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit class NoteOps[Self <: Note] (val x: Self) extends AnyVal {
    
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
    def setAccidental(value: Double): Self = this.set("accidental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: Double): Self = this.set("note", value.asInstanceOf[js.Any])
  }
}
