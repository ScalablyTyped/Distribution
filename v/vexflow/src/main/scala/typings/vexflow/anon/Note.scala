package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Note extends StObject {
  
  var accidental: Double
  
  var note: Double
}
object Note {
  
  inline def apply(accidental: Double, note: Double): Note = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Note]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Note] (val x: Self) extends AnyVal {
    
    inline def setAccidental(value: Double): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    inline def setNote(value: Double): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
  }
}
