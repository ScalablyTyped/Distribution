package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemDeleteReference extends js.Object {
  /**
    * The HTTP status code for work item operation in a batch request.
    */
  var code: Double = js.native
  /**
    * The user who deleted the work item type.
    */
  var deletedBy: String = js.native
  /**
    * The work item deletion date.
    */
  var deletedDate: String = js.native
  /**
    * Work item ID.
    */
  var id: Double = js.native
  /**
    * The exception message for work item operation in a batch request.
    */
  var message: String = js.native
  /**
    * Name or title of the work item.
    */
  var name: String = js.native
  /**
    * Parent project of the deleted work item.
    */
  var project: String = js.native
  /**
    * Type of work item.
    */
  var `type`: String = js.native
  /**
    * REST API URL of the resource
    */
  var url: String = js.native
}

object WorkItemDeleteReference {
  @scala.inline
  def apply(
    code: Double,
    deletedBy: String,
    deletedDate: String,
    id: Double,
    message: String,
    name: String,
    project: String,
    `type`: String,
    url: String
  ): WorkItemDeleteReference = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], deletedBy = deletedBy.asInstanceOf[js.Any], deletedDate = deletedDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemDeleteReference]
  }
  @scala.inline
  implicit class WorkItemDeleteReferenceOps[Self <: WorkItemDeleteReference] (val x: Self) extends AnyVal {
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
    def setCode(value: Double): Self = this.set("code", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedBy(value: String): Self = this.set("deletedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletedDate(value: String): Self = this.set("deletedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProject(value: String): Self = this.set("project", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

