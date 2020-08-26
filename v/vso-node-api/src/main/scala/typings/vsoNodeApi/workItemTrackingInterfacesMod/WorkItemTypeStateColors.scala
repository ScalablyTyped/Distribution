package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemTypeStateColors extends js.Object {
  /**
    * Work item type state colors
    */
  var stateColors: js.Array[WorkItemStateColor] = js.native
  /**
    * Work item type name
    */
  var workItemTypeName: String = js.native
}

object WorkItemTypeStateColors {
  @scala.inline
  def apply(stateColors: js.Array[WorkItemStateColor], workItemTypeName: String): WorkItemTypeStateColors = {
    val __obj = js.Dynamic.literal(stateColors = stateColors.asInstanceOf[js.Any], workItemTypeName = workItemTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemTypeStateColors]
  }
  @scala.inline
  implicit class WorkItemTypeStateColorsOps[Self <: WorkItemTypeStateColors] (val x: Self) extends AnyVal {
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
    def setStateColorsVarargs(value: WorkItemStateColor*): Self = this.set("stateColors", js.Array(value :_*))
    @scala.inline
    def setStateColors(value: js.Array[WorkItemStateColor]): Self = this.set("stateColors", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkItemTypeName(value: String): Self = this.set("workItemTypeName", value.asInstanceOf[js.Any])
  }
  
}

