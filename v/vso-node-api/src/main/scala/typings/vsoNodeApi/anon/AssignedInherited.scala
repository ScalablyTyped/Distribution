package typings.vsoNodeApi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AssignedInherited extends StObject {
  
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
  implicit class AssignedInheritedMutableBuilder[Self <: AssignedInherited] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssigned(value: scala.Double): Self = StObject.set(x, "assigned", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInherited(value: scala.Double): Self = StObject.set(x, "inherited", value.asInstanceOf[js.Any])
  }
}
