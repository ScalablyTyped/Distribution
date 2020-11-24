package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstnote extends js.Object {
  
  var first_note: typings.vexflow.Vex.Flow.Note = js.native
  
  var last_note: typings.vexflow.Vex.Flow.Note = js.native
}
object Firstnote {
  
  @scala.inline
  def apply(first_note: typings.vexflow.Vex.Flow.Note, last_note: typings.vexflow.Vex.Flow.Note): Firstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstnote]
  }
  
  @scala.inline
  implicit class FirstnoteOps[Self <: Firstnote] (val x: Self) extends AnyVal {
    
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
    def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = this.set("first_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = this.set("last_note", value.asInstanceOf[js.Any])
  }
}
