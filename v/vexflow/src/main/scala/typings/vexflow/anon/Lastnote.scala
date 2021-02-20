package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Lastnote extends StObject {
  
  var first_indices: js.UndefOr[js.Array[Double]] = js.native
  
  var first_note: typings.vexflow.Vex.Flow.Note = js.native
  
  var last_indices: js.UndefOr[js.Array[Double]] = js.native
  
  var last_note: typings.vexflow.Vex.Flow.Note = js.native
}
object Lastnote {
  
  @scala.inline
  def apply(first_note: typings.vexflow.Vex.Flow.Note, last_note: typings.vexflow.Vex.Flow.Note): Lastnote = {
    val __obj = js.Dynamic.literal(first_note = first_note.asInstanceOf[js.Any], last_note = last_note.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lastnote]
  }
  
  @scala.inline
  implicit class LastnoteMutableBuilder[Self <: Lastnote] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_indices(value: js.Array[Double]): Self = StObject.set(x, "first_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_indicesUndefined: Self = StObject.set(x, "first_indices", js.undefined)
    
    @scala.inline
    def setFirst_indicesVarargs(value: Double*): Self = StObject.set(x, "first_indices", js.Array(value :_*))
    
    @scala.inline
    def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_indices(value: js.Array[Double]): Self = StObject.set(x, "last_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_indicesUndefined: Self = StObject.set(x, "last_indices", js.undefined)
    
    @scala.inline
    def setLast_indicesVarargs(value: Double*): Self = StObject.set(x, "last_indices", js.Array(value :_*))
    
    @scala.inline
    def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
  }
}
