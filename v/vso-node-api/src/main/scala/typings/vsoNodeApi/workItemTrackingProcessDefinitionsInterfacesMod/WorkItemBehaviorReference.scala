package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemBehaviorReference extends js.Object {
  /**
    * The ID of the reference behavior
    */
  var id: String = js.native
  /**
    * The url of the reference behavior
    */
  var url: String = js.native
}

object WorkItemBehaviorReference {
  @scala.inline
  def apply(id: String, url: String): WorkItemBehaviorReference = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemBehaviorReference]
  }
  @scala.inline
  implicit class WorkItemBehaviorReferenceOps[Self <: WorkItemBehaviorReference] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
  }
  
}

