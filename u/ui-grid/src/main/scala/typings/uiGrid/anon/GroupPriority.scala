package typings.uiGrid.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GroupPriority extends StObject {
  
  /**
    * number, starts at 0, if less than 0 or undefined then we're aggregating in this column
    */
  var groupPriority: Double
}
object GroupPriority {
  
  @scala.inline
  def apply(groupPriority: Double): GroupPriority = {
    val __obj = js.Dynamic.literal(groupPriority = groupPriority.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupPriority]
  }
  
  @scala.inline
  implicit class GroupPriorityMutableBuilder[Self <: GroupPriority] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGroupPriority(value: Double): Self = StObject.set(x, "groupPriority", value.asInstanceOf[js.Any])
  }
}
