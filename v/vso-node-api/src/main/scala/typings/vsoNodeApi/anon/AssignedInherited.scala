package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedInherited extends js.Object {
  
  var assigned: scala.Double = js.native
  
  var inherited: scala.Double = js.native
}
object AssignedInherited {
  
  @scala.inline
  def apply(assigned: scala.Double, inherited: scala.Double): AssignedInherited = {
    val __obj = js.Dynamic.literal(assigned = assigned.asInstanceOf[js.Any], inherited = inherited.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignedInherited]
  }
  
  @scala.inline
  implicit class AssignedInheritedOps[Self <: AssignedInherited] (val x: Self) extends AnyVal {
    
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
    def setAssigned(value: scala.Double): Self = this.set("assigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherited(value: scala.Double): Self = this.set("inherited", value.asInstanceOf[js.Any])
  }
}
