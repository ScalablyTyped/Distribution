package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Bracketed extends js.Object {
  
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
  implicit class BracketedOps[Self <: Bracketed] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRatioed(value: Boolean): Self = this.set("ratioed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBracketed(value: Boolean): Self = this.set("bracketed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBracketed: Self = this.set("bracketed", js.undefined)
    
    @scala.inline
    def setLocation(value: Double): Self = this.set("location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    
    @scala.inline
    def setNotes_occupied(value: Double): Self = this.set("notes_occupied", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotes_occupied: Self = this.set("notes_occupied", js.undefined)
    
    @scala.inline
    def setNum_notes(value: Double): Self = this.set("num_notes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNum_notes: Self = this.set("num_notes", js.undefined)
    
    @scala.inline
    def setY_offset(value: Double): Self = this.set("y_offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteY_offset: Self = this.set("y_offset", js.undefined)
  }
}
