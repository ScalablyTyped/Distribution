package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTrackingResource extends WorkItemTrackingResourceReference {
  /**
    * Link references to related REST resources.
    */
  var _links: js.Any = js.native
}

object WorkItemTrackingResource {
  @scala.inline
  def apply(_links: js.Any, url: String): WorkItemTrackingResource = {
    val __obj = js.Dynamic.literal(_links = _links.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTrackingResource]
  }
  @scala.inline
  implicit class WorkItemTrackingResourceOps[Self <: WorkItemTrackingResource] (val x: Self) extends AnyVal {
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
    def set_links(value: js.Any): Self = this.set("_links", value.asInstanceOf[js.Any])
  }
  
}

