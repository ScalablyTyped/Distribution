package typings.vsoNodeApi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalWorkflow extends js.Object {
  var globalWorkflow: scala.Double = js.native
  var workItemType: scala.Double = js.native
}

object GlobalWorkflow {
  @scala.inline
  def apply(globalWorkflow: scala.Double, workItemType: scala.Double): GlobalWorkflow = {
    val __obj = js.Dynamic.literal(globalWorkflow = globalWorkflow.asInstanceOf[js.Any], workItemType = workItemType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GlobalWorkflow]
  }
  @scala.inline
  implicit class GlobalWorkflowOps[Self <: GlobalWorkflow] (val x: Self) extends AnyVal {
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
    def setGlobalWorkflow(value: scala.Double): Self = this.set("globalWorkflow", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemType(value: scala.Double): Self = this.set("workItemType", value.asInstanceOf[js.Any])
  }
  
}

