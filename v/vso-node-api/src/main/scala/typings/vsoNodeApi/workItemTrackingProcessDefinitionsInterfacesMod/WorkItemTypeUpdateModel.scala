package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkItemTypeUpdateModel extends StObject {
  
  /**
    * Color of the work item type
    */
  var color: String = js.native
  
  /**
    * Description of the work item type
    */
  var description: String = js.native
  
  /**
    * Icon of the work item type
    */
  var icon: String = js.native
  
  /**
    * Is the workitem type to be disabled
    */
  var isDisabled: Boolean = js.native
}
object WorkItemTypeUpdateModel {
  
  @scala.inline
  def apply(color: String, description: String, icon: String, isDisabled: Boolean): WorkItemTypeUpdateModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeUpdateModel]
  }
  
  @scala.inline
  implicit class WorkItemTypeUpdateModelMutableBuilder[Self <: WorkItemTypeUpdateModel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsDisabled(value: Boolean): Self = StObject.set(x, "isDisabled", value.asInstanceOf[js.Any])
  }
}
