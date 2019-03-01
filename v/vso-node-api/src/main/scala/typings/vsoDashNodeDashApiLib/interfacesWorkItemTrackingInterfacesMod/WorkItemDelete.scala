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
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("deletedBy")(deletedBy)
    __obj.updateDynamic("deletedDate")(deletedDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("resource")(resource)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemDelete]
  }
}

