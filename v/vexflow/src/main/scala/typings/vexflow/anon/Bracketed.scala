package typings.vexflow.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bracketed extends StObject {
  
  var bracketed: js.UndefOr[Boolean] = js.native
  
  var location: js.UndefOr[Double] = js.native
  
  var notes_occupied: js.UndefOr[Double] = js.native
  
  var num_notes: js.UndefOr[Double] = js.native
  
  var ratioed: Boolean = js.native
  
  var y_offset: js.UndefOr[Double] = js.native
}
object Bracketed {
  
  @scala.inline
  def apply(ratioed: Boolean): Bracketed = {
    val __obj = js.Dynamic.literal(ratioed = ratioed.asInstanceOf[js.Any])
    __obj.asInstanceOf[Bracketed]
  }
  
  @scala.inline
  implicit class BracketedMutableBuilder[Self <: Bracketed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBracketed(value: Boolean): Self = StObject.set(x, "bracketed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketedUndefined: Self = StObject.set(x, "bracketed", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    @scala.inline
    def setNotes_occupied(value: Double): Self = StObject.set(x, "notes_occupied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotes_occupiedUndefined: Self = StObject.set(x, "notes_occupied", js.undefined)
    
    @scala.inline
    def setNum_notes(value: Double): Self = StObject.set(x, "num_notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNum_notesUndefined: Self = StObject.set(x, "num_notes", js.undefined)
    
    @scala.inline
    def setRatioed(value: Boolean): Self = StObject.set(x, "ratioed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_offset(value: Double): Self = StObject.set(x, "y_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY_offsetUndefined: Self = StObject.set(x, "y_offset", js.undefined)
  }
}
