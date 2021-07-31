package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firstnote extends StObject {
  
  var first_note: typings.vexflow.Vex.Flow.Note
  
  var last_note: typings.vexflow.Vex.Flow.Note
}
object Firstnote {
  
  @scala.inline
  def apply(first_note: typings.vexflow.Vex.Flow.Note, last_note: typings.vexflow.Vex.Flow.Note): Firstnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstnote]
  }
  
  @scala.inline
  implicit class FirstnoteMutableBuilder[Self <: Firstnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
  }
}
