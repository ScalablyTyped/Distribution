package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeTemplate extends js.Object {
  /**
    * XML template in string format.
    */
  var template: String = js.native
}

object WorkItemTypeTemplate {
  @scala.inline
  def apply(template: String): WorkItemTypeTemplate = {
    val __obj = js.Dynamic.literal(template = template.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeTemplate]
  }
  @scala.inline
  implicit class WorkItemTypeTemplateOps[Self <: WorkItemTypeTemplate] (val x: Self) extends AnyVal {
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
    def setTemplate(value: String): Self = this.set("template", value.asInstanceOf[js.Any])
  }
  
}

