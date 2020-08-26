package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeColor extends js.Object {
  /**
    * Gets or sets the color of the primary.
    */
  var primaryColor: String = js.native
  /**
    * Gets or sets the color of the secondary.
    */
  var secondaryColor: String = js.native
  /**
    * The name of the work item type.
    */
  var workItemTypeName: String = js.native
}

object WorkItemTypeColor {
  @scala.inline
  def apply(primaryColor: String, secondaryColor: String, workItemTypeName: String): WorkItemTypeColor = {
    val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeColor]
  }
  @scala.inline
  implicit class WorkItemTypeColorOps[Self <: WorkItemTypeColor] (val x: Self) extends AnyVal {
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
    def setPrimaryColor(value: String): Self = this.set("primaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecondaryColor(value: String): Self = this.set("secondaryColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemTypeName(value: String): Self = this.set("workItemTypeName", value.asInstanceOf[js.Any])
  }
  
}

