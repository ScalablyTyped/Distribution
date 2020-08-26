package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectWorkItemStateColors extends js.Object {
  /**
    * Project name
    */
  var projectName: String = js.native
  /**
    * State colors for all work item type in a project
    */
  var workItemTypeStateColors: js.Array[WorkItemTypeStateColors] = js.native
}

object ProjectWorkItemStateColors {
  @scala.inline
  def apply(projectName: String, workItemTypeStateColors: js.Array[WorkItemTypeStateColors]): ProjectWorkItemStateColors = {
    val __obj = js.Dynamic.literal(projectName = projectName.asInstanceOf[js.Any], workItemTypeStateColors = workItemTypeStateColors.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectWorkItemStateColors]
  }
  @scala.inline
  implicit class ProjectWorkItemStateColorsOps[Self <: ProjectWorkItemStateColors] (val x: Self) extends AnyVal {
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
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemTypeStateColorsVarargs(value: WorkItemTypeStateColors*): Self = this.set("workItemTypeStateColors", js.Array(value :_*))
    @scala.inline
    def setWorkItemTypeStateColors(value: js.Array[WorkItemTypeStateColors]): Self = this.set("workItemTypeStateColors", value.asInstanceOf[js.Any])
  }
  
}

