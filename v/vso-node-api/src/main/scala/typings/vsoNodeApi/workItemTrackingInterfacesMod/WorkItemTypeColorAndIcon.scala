package typings.vsoNodeApi.workItemTrackingInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeColorAndIcon extends StObject {
  
  /**
    * The color of the work item type in hex format.
    */
  var color: String = js.native
  
  /**
    * Tthe work item type icon.
    */
  var icon: String = js.native
  
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String = js.native
}
object WorkItemTypeColorAndIcon {
  
  @scala.inline
  def apply(color: String, icon: String, workItemTypeName: String): WorkItemTypeColorAndIcon = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeColorAndIcon]
  }
  
  @scala.inline
  implicit class WorkItemTypeColorAndIconMutableBuilder[Self <: WorkItemTypeColorAndIcon] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkItemTypeName(value: String): Self = StObject.set(x, "workItemTypeName", value.asInstanceOf[js.Any])
  }
}
