package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeStateColors extends StObject {
  
  /**
    * Work item type state colors
    */
  var stateColors: js.Array[WorkItemStateColor] = js.native
  
  /**
    * Work item type name
    */
  var workItemTypeName: String = js.native
}
object WorkItemTypeStateColors {
  
  @scala.inline
  def apply(stateColors: js.Array[WorkItemStateColor], workItemTypeName: String): WorkItemTypeStateColors = {
    val __obj = js.Dynamic.literal(stateColors = stateColors.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateColors]
  }
  
  @scala.inline
  implicit class WorkItemTypeStateColorsMutableBuilder[Self <: WorkItemTypeStateColors] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStateColors(value: js.Array[WorkItemStateColor]): Self = StObject.set(x, "stateColors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateColorsVarargs(value: WorkItemStateColor*): Self = StObject.set(x, "stateColors", js.Array(value :_*))
    
    @scala.inline
    def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
