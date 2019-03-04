package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemTypeUpdateModel extends js.Object {
  /**
    * Color of the work item type
    */
  var color: java.lang.String
  /**
    * Description of the work item type
    */
  var description: java.lang.String
  /**
    * Icon of the work item type
    */
  var icon: java.lang.String
  /**
    * Is the workitem type to be disabled
    */
  var isDisabled: scala.Boolean
}

object WorkItemTypeUpdateModel {
  @scala.inline
  def apply(
    color: java.lang.String,
    description: java.lang.String,
    icon: java.lang.String,
    isDisabled: scala.Boolean
  ): WorkItemTypeUpdateModel = {
    val __obj = js.Dynamic.literal(color = color, description = description, icon = icon, isDisabled = isDisabled)
  
    __obj.asInstanceOf[WorkItemTypeUpdateModel]
  }
}

