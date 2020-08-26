package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeReference extends WorkItemTrackingResourceReference {
  /**
    * Name of the work item type.
    */
  var name: String = js.native
}

object WorkItemTypeReference {
  @scala.inline
  def apply(name: String, url: String): WorkItemTypeReference = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeReference]
  }
  @scala.inline
  implicit class WorkItemTypeReferenceOps[Self <: WorkItemTypeReference] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

