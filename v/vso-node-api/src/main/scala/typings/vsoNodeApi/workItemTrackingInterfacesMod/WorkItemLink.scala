package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemLink extends js.Object {
  /**
    * The type of link.
    */
  var rel: String = js.native
  /**
    * The source work item.
    */
  var source: WorkItemReference = js.native
  /**
    * The target work item.
    */
  var target: WorkItemReference = js.native
}

object WorkItemLink {
  @scala.inline
  def apply(rel: String, source: WorkItemReference, target: WorkItemReference): WorkItemLink = {
    val __obj = js.Dynamic.literal(rel = rel.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemLink]
  }
  @scala.inline
  implicit class WorkItemLinkOps[Self <: WorkItemLink] (val x: Self) extends AnyVal {
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
    def setRel(value: String): Self = this.set("rel", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: WorkItemReference): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setTarget(value: WorkItemReference): Self = this.set("target", value.asInstanceOf[js.Any])
  }
  
}

