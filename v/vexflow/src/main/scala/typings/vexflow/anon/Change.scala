package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Change extends StObject {
  
  var accidental: String
  
  var change: Boolean
  
  var note: String
}
object Change {
  
  inline def apply(accidental: String, change: Boolean, note: String): Change = {
    val __obj = js.Dynamic.literal(accidental = accidental.asInstanceOf[js.Any], change = change.asInstanceOf[js.Any], note = note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Change]
  }
  
  extension [Self <: Change](x: Self) {
    
    inline def setAccidental(value: String): Self = StObject.set(x, "accidental", value.asInstanceOf[js.Any])
    
    inline def setChange(value: Boolean): Self = StObject.set(x, "change", value.asInstanceOf[js.Any])
    
    inline def setNote(value: String): Self = StObject.set(x, "note", value.asInstanceOf[js.Any])
  }
}
