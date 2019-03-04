package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

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
    code: scala.Double,
    deletedBy: java.lang.String,
    deletedDate: java.lang.String,
    id: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    project: java.lang.String,
    resource: WorkItem,
    `type`: java.lang.String,
    url: java.lang.String
  ): WorkItemDelete = {
    val __obj = js.Dynamic.literal(code = code, deletedBy = deletedBy, deletedDate = deletedDate, id = id, message = message, name = name, project = project, resource = resource, url = url)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[WorkItemDelete]
  }
}

