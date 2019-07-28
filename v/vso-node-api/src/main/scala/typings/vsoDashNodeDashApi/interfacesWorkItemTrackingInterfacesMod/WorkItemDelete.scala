package typings.vsoDashNodeDashApi.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemDelete extends WorkItemDeleteReference {
  /**
    * The work item object that was deleted.
    */
  var resource: WorkItem
}

object WorkItemDelete {
  @scala.inline
  def apply(
    code: Double,
    deletedBy: String,
    deletedDate: String,
    id: Double,
    message: String,
    name: String,
    project: String,
    resource: WorkItem,
    `type`: String,
    url: String
  ): WorkItemDelete = {
    val __obj = js.Dynamic.literal(code = code, deletedBy = deletedBy, deletedDate = deletedDate, id = id, message = message, name = name, project = project, resource = resource, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkItemDelete]
  }
}

