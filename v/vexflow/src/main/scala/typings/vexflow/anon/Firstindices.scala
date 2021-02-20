package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Firstindices extends StObject {
  
  var first_indices: js.Array[Double] = js.native
  
  var first_note: typings.vexflow.Vex.Flow.Note = js.native
  
  var last_indices: js.Array[Double] = js.native
  
  var last_note: typings.vexflow.Vex.Flow.Note = js.native
}
object Firstindices {
  
  @scala.inline
  def apply(
    first_indices: js.Array[Double],
    first_note: typings.vexflow.Vex.Flow.Note,
    last_indices: js.Array[Double],
    last_note: typings.vexflow.Vex.Flow.Note
  ): Firstindices = {
    val __obj = js.Dynamic.literal(first_indices = first_indices.asInstanceOf[js.Any], first_note = first_note.asInstanceOf[js.Any], last_indices = last_indices.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Firstindices]
  }
  
  @scala.inline
  implicit class FirstindicesMutableBuilder[Self <: Firstindices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_indices(value: js.Array[Double]): Self = StObject.set(x, "first_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_indicesVarargs(value: Double*): Self = StObject.set(x, "first_indices", js.Array(value :_*))
    
    @scala.inline
    def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_indices(value: js.Array[Double]): Self = StObject.set(x, "last_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_indicesVarargs(value: Double*): Self = StObject.set(x, "last_indices", js.Array(value :_*))
    
    @scala.inline
    def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
  }
}
