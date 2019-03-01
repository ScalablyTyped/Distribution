package typings
package vsoDashNodeDashApiLib.interfacesWorkItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WorkItemDeleteReference extends js.Object {
  /**
    * The HTTP status code for work item operation in a batch request.
    */
  var code: scala.Double
  /**
    * The user who deleted the work item type.
    */
  var deletedBy: java.lang.String
  /**
    * The work item deletion date.
    */
  var deletedDate: java.lang.String
  /**
    * Work item ID.
    */
  var id: scala.Double
  /**
    * The exception message for work item operation in a batch request.
    */
  var message: java.lang.String
  /**
    * Name or title of the work item.
    */
  var name: java.lang.String
  /**
    * Parent project of the deleted work item.
    */
  var project: java.lang.String
  /**
    * Type of work item.
    */
  var `type`: java.lang.String
  /**
    * REST API URL of the resource
    */
  var url: java.lang.String
}

object WorkItemDeleteReference {
  @scala.inline
  def apply(
    code: scala.Double,
    deletedBy: java.lang.String,
    deletedDate: java.lang.String,
    id: scala.Double,
    message: java.lang.String,
    name: java.lang.String,
    project: java.lang.String,
    `type`: java.lang.String,
    url: java.lang.String
  ): WorkItemDeleteReference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("code")(code)
    __obj.updateDynamic("deletedBy")(deletedBy)
    __obj.updateDynamic("deletedDate")(deletedDate)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("project")(project)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[WorkItemDeleteReference]
  }
}

