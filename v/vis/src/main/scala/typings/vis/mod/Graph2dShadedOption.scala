package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph2dShadedOption extends js.Object {
  var groupid: js.UndefOr[IdType] = js.native
  var orientation: js.UndefOr[TopBottomEnumType] = js.native
}

object Graph2dShadedOption {
  @scala.inline
  def apply(): Graph2dShadedOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dShadedOption]
  }
  @scala.inline
  implicit class Graph2dShadedOptionOps[Self <: Graph2dShadedOption] (val x: Self) extends AnyVal {
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
    def setGroupid(value: IdType): Self = this.set("groupid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupid: Self = this.set("groupid", js.undefined)
    @scala.inline
    def setOrientation(value: TopBottomEnumType): Self = this.set("orientation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrientation: Self = this.set("orientation", js.undefined)
  }
  
}

