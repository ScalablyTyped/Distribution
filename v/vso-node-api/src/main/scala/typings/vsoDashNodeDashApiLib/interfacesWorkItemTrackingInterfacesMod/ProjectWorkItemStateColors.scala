package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectWorkItemStateColors extends js.Object {
  /**
    * Project name
    */
  var projectName: java.lang.String
  /**
    * State colors for all work item type in a project
    */
  var workItemTypeStateColors: js.Array[WorkItemTypeStateColors]
}

object ProjectWorkItemStateColors {
  @scala.inline
  def apply(projectName: java.lang.String, workItemTypeStateColors: js.Array[WorkItemTypeStateColors]): ProjectWorkItemStateColors = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("projectName")(projectName)
    __obj.updateDynamic("workItemTypeStateColors")(workItemTypeStateColors)
    __obj.asInstanceOf[ProjectWorkItemStateColors]
  }
}

