package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeUpdateModel extends js.Object {
  /**
    * Color of the work item type
    */
  var color: String
  /**
    * Description of the work item type
    */
  var description: String
  /**
    * Icon of the work item type
    */
  var icon: String
  /**
    * Is the workitem type to be disabled
    */
  var isDisabled: Boolean
}

object WorkItemTypeUpdateModel {
  @scala.inline
  def apply(color: String, description: String, icon: String, isDisabled: Boolean): WorkItemTypeUpdateModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[WorkItemTypeUpdateModel]
  }
}

