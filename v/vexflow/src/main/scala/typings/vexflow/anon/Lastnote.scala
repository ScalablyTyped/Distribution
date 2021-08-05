package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastnote extends StObject {
  
  var first_indices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var first_note: typings.vexflow.Vex.Flow.Note
  
  var last_indices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var last_note: typings.vexflow.Vex.Flow.Note
}
object Lastnote {
  
  inline def apply(first_note: typings.vexflow.Vex.Flow.Note, last_note: typings.vexflow.Vex.Flow.Note): Lastnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastnote]
  }
  
  extension [Self <: Lastnote](x: Self) {
    
    inline def setFirst_indices(value: js.Array[Double]): Self = StObject.set(x, "first_indices", value.asInstanceOf[js.Any])
    
    inline def setFirst_indicesUndefined: Self = StObject.set(x, "first_indices", js.undefined)
    
    inline def setFirst_indicesVarargs(value: Double*): Self = StObject.set(x, "first_indices", js.Array(value :_*))
    
    inline def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    inline def setLast_indices(value: js.Array[Double]): Self = StObject.set(x, "last_indices", value.asInstanceOf[js.Any])
    
    inline def setLast_indicesUndefined: Self = StObject.set(x, "last_indices", js.undefined)
    
    inline def setLast_indicesVarargs(value: Double*): Self = StObject.set(x, "last_indices", js.Array(value :_*))
    
    inline def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
  }
}
