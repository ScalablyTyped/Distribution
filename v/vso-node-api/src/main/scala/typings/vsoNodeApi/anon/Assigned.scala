package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assigned extends js.Object {
  
  var active: scala.Double = js.native
  
  var assigned: scala.Double = js.native
  
  var moving: scala.Double = js.native
}
object Assigned {
  
  @scala.inline
  def apply(active: scala.Double, assigned: scala.Double, moving: scala.Double): Assigned = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any], assigned = assigned.asInstanceOf[js.Any], moving = moving.asInstanceOf[js.Any])
    __obj.asInstanceOf[Assigned]
  }
  
  @scala.inline
  implicit class AssignedOps[Self <: Assigned] (val x: Self) extends AnyVal {
    
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
    def setActive(value: scala.Double): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssigned(value: scala.Double): Self = this.set("assigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoving(value: scala.Double): Self = this.set("moving", value.asInstanceOf[js.Any])
  }
}
