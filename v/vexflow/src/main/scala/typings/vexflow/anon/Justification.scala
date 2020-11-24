package typings.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Justification extends js.Object {
  
  var justification: js.UndefOr[typings.vexflow.Vex.Flow.TextNote.Justification] = js.native
  
  var shift_x: js.UndefOr[Double] = js.native
  
  var shift_y: js.UndefOr[Double] = js.native
}
object Justification {
  
  @scala.inline
  def apply(): Justification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Justification]
  }
  
  @scala.inline
  implicit class JustificationOps[Self <: Justification] (val x: Self) extends AnyVal {
    
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
    def setJustification(value: typings.vexflow.Vex.Flow.TextNote.Justification): Self = this.set("justification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJustification: Self = this.set("justification", js.undefined)
    
    @scala.inline
    def setShift_x(value: Double): Self = this.set("shift_x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift_x: Self = this.set("shift_x", js.undefined)
    
    @scala.inline
    def setShift_y(value: Double): Self = this.set("shift_y", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShift_y: Self = this.set("shift_y", js.undefined)
  }
}
