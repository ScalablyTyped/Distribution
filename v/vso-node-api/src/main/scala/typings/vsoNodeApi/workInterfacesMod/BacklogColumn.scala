package typings.vsoNodeApi.workInterfacesMod

import typings.vsoNodeApi.workItemTrackingInterfacesMod.WorkItemFieldReference
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BacklogColumn extends js.Object {
  var columnFieldReference: WorkItemFieldReference = js.native
  var width: Double = js.native
}

object BacklogColumn {
  @scala.inline
  def apply(columnFieldReference: WorkItemFieldReference, width: Double): BacklogColumn = {
    val __obj = js.Dynamic.literal(columnFieldReference = columnFieldReference.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[BacklogColumn]
  }
  @scala.inline
  implicit class BacklogColumnOps[Self <: BacklogColumn] (val x: Self) extends AnyVal {
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
    def setColumnFieldReference(value: WorkItemFieldReference): Self = this.set("columnFieldReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

