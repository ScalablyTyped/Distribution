package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccidentalNote extends StObject {
  
  var accidental: String
  
  var note: String
}
object AccidentalNote {
  
  inline def apply(accidental: String, note: String): AccidentalNote = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccidentalNote]
  }
  
  extension [Self <: AccidentalNote](x: Self) {
    
    inline def setAccidental(value: String): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
  }
}
