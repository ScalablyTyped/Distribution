package typings.vsoNodeApi.workItemTrackingProcessDefinitionsInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeUpdateModel extends js.Object {
  /**
    * Color of the work item type
    */
  var color: String = js.native
  /**
    * Description of the work item type
    */
  var description: String = js.native
  /**
    * Icon of the work item type
    */
  var icon: String = js.native
  /**
    * Is the workitem type to be disabled
    */
  var isDisabled: Boolean = js.native
}

object WorkItemTypeUpdateModel {
  @scala.inline
  def apply(color: String, description: String, icon: String, isDisabled: Boolean): WorkItemTypeUpdateModel = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], icon = icon.asInstanceOf[js.Any], isDisabled = isDisabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeUpdateModel]
  }
  @scala.inline
  implicit class WorkItemTypeUpdateModelOps[Self <: WorkItemTypeUpdateModel] (val x: Self) extends AnyVal {
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsDisabled(value: Boolean): Self = this.set("isDisabled", value.asInstanceOf[js.Any])
  }
  
}

