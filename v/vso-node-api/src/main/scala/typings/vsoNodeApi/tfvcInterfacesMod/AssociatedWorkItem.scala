package typings.vsoNodeApi.tfvcInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociatedWorkItem extends js.Object {
  var assignedTo: String = js.native
  /**
    * Id of associated the work item.
    */
  var id: Double = js.native
  var state: String = js.native
  var title: String = js.native
  /**
    * REST Url of the work item.
    */
  var url: String = js.native
  var webUrl: String = js.native
  var workItemType: String = js.native
}

object AssociatedWorkItem {
  @scala.inline
  def apply(
    assignedTo: String,
    id: Double,
    state: String,
    title: String,
    url: String,
    webUrl: String,
    workItemType: String
  ): AssociatedWorkItem = {
    val __obj = js.Dynamic.literal(assignedTo = assignedTo.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], webUrl = webUrl.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociatedWorkItem]
  }
  @scala.inline
  implicit class AssociatedWorkItemOps[Self <: AssociatedWorkItem] (val x: Self) extends AnyVal {
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
    def setAssignedTo(value: String): Self = this.set("assignedTo", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWebUrl(value: String): Self = this.set("webUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemType(value: String): Self = this.set("workItemType", value.asInstanceOf[js.Any])
  }
  
}

