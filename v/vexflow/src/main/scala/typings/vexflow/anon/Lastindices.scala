package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Lastindices extends StObject {
  
  var first_indices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var first_note: js.UndefOr[typings.vexflow.Vex.Flow.Note] = js.undefined
  
  var last_indices: js.UndefOr[js.Array[Double]] = js.undefined
  
  var last_note: js.UndefOr[typings.vexflow.Vex.Flow.Note] = js.undefined
}
object Lastindices {
  
  @scala.inline
  def apply(): Lastindices = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lastindices]
  }
  
  @scala.inline
  implicit class LastindicesMutableBuilder[Self <: Lastindices] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFirst_indices(value: js.Array[Double]): Self = StObject.set(x, "first_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_indicesUndefined: Self = StObject.set(x, "first_indices", js.undefined)
    
    @scala.inline
    def setFirst_indicesVarargs(value: Double*): Self = StObject.set(x, "first_indices", js.Array(value :_*))
    
    @scala.inline
    def setFirst_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "first_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirst_noteUndefined: Self = StObject.set(x, "first_note", js.undefined)
    
    @scala.inline
    def setLast_indices(value: js.Array[Double]): Self = StObject.set(x, "last_indices", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_indicesUndefined: Self = StObject.set(x, "last_indices", js.undefined)
    
    @scala.inline
    def setLast_indicesVarargs(value: Double*): Self = StObject.set(x, "last_indices", js.Array(value :_*))
    
    @scala.inline
    def setLast_note(value: typings.vexflow.Vex.Flow.Note): Self = StObject.set(x, "last_note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLast_noteUndefined: Self = StObject.set(x, "last_note", js.undefined)
  }
}
