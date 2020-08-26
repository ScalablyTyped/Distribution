package typings.vsoNodeApi.workItemTrackingInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WorkItemStateColor extends js.Object {
  /**
    * Category of state
    */
  var category: String = js.native
  /**
    * Color value
    */
  var color: String = js.native
  /**
    * Work item type state name
    */
  var name: String = js.native
}

object WorkItemStateColor {
  @scala.inline
  def apply(category: String, color: String, name: String): WorkItemStateColor = {
    val __obj = js.Dynamic.literal(category = category.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkItemStateColor]
  }
  @scala.inline
  implicit class WorkItemStateColorOps[Self <: WorkItemStateColor] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

