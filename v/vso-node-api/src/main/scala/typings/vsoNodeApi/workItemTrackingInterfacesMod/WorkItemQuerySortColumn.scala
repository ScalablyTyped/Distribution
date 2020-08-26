package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemQuerySortColumn extends js.Object {
  /**
    * The direction to sort by.
    */
  var descending: Boolean = js.native
  /**
    * A work item field.
    */
  var field: WorkItemFieldReference = js.native
}

object WorkItemQuerySortColumn {
  @scala.inline
  def apply(descending: Boolean, field: WorkItemFieldReference): WorkItemQuerySortColumn = {
    val __obj = js.Dynamic.literal(descending = descending.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemQuerySortColumn]
  }
  @scala.inline
  implicit class WorkItemQuerySortColumnOps[Self <: WorkItemQuerySortColumn] (val x: Self) extends AnyVal {
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
    def setDescending(value: Boolean): Self = this.set("descending", value.asInstanceOf[js.Any])
    @scala.inline
    def setField(value: WorkItemFieldReference): Self = this.set("field", value.asInstanceOf[js.Any])
  }
  
}

