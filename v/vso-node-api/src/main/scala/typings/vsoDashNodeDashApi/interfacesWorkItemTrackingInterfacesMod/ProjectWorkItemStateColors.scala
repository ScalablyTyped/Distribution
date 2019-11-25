package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectWorkItemStateColors extends js.Object {
  /**
    * Project name
    */
  var projectName: String
  /**
    * State colors for all work item type in a project
    */
  var workItemTypeStateColors: js.Array[WorkItemTypeStateColors]
}

object ProjectWorkItemStateColors {
  @scala.inline
  def apply(projectName: String, workItemTypeStateColors: js.Array[WorkItemTypeStateColors]): ProjectWorkItemStateColors = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], workItemTypeStateColors = workItemTypeStateColors.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectWorkItemStateColors]
  }
}

