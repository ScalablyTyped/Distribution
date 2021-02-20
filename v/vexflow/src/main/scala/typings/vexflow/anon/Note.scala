package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Note extends StObject {
  
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
  implicit class NoteMutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccidental(value: Double): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNote(value: Double): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
  }
}
