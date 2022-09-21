package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Firstindices extends StObject {
  
  var first_indices: js.Array[Double]
  
  var first_note: typings.vexflow.Vex.Flow.Note
  
  var last_indices: js.Array[Double]
  
  var last_note: typings.vexflow.Vex.Flow.Note
}
object Firstindices {
  
  inline def apply(
    first_indices: js.Array[Double],
    first_note: typings.vexflow.Vex.Flow.Note,
    last_indices: js.Array[Double],
    last_note: typings.vexflow.Vex.Flow.Note
  ): Firstindices = {
    val __obj = js.Dynamic.literal(first_indices = first_indices.asInstanceOf[js.Any], first_note = first_note.asInstanceOf[js.Any], last_indices = last_indices.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstindices]
  }
  
  extension [Self <: Firstindices](x: Self) {
    
    inline def setFirst_indices(value: js.Array[Double]): Self = StObject.set(x, "first_indices", value.asInstanceOf[js.Any])
    
    inline def setFirst_indicesVarargs(value: Double*): Self = StObject.set(x, "first_indices", js.Array(value*))
    
    inline def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    inline def setLast_indices(value: js.Array[Double]): Self = StObject.set(x, "last_indices", value.asInstanceOf[js.Any])
    
    inline def setLast_indicesVarargs(value: Double*): Self = StObject.set(x, "last_indices", js.Array(value*))
    
    inline def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
  }
}
