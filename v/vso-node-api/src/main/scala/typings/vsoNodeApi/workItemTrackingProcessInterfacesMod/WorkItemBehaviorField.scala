package typings.vsoNodeApi.workItemTrackingProcessInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemBehaviorField extends js.Object {
  var behaviorFieldId: String = js.native
  var id: String = js.native
  var url: String = js.native
}

object WorkItemBehaviorField {
  @scala.inline
  def apply(behaviorFieldId: String, id: String, url: String): WorkItemBehaviorField = {
    val __obj = js.Dynamic.literal(behaviorFieldId = behaviorFieldId.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemBehaviorField]
  }
  @scala.inline
  implicit class WorkItemBehaviorFieldOps[Self <: WorkItemBehaviorField] (val x: Self) extends AnyVal {
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
    def setBehaviorFieldId(value: String): Self = this.set("behaviorFieldId", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

