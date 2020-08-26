package typings.videoJs.mod.videojs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MenuItemOptions extends ComponentOptions {
  var label: js.UndefOr[String] = js.native
  var multiSelectable: js.UndefOr[Boolean] = js.native
  var selectable: js.UndefOr[Boolean] = js.native
  var selected: js.UndefOr[Boolean] = js.native
}

object MenuItemOptions {
  @scala.inline
  def apply(): MenuItemOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuItemOptions]
  }
  @scala.inline
  implicit class MenuItemOptionsOps[Self <: MenuItemOptions] (val x: Self) extends AnyVal {
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMultiSelectable(value: Boolean): Self = this.set("multiSelectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiSelectable: Self = this.set("multiSelectable", js.undefined)
    @scala.inline
    def setSelectable(value: Boolean): Self = this.set("selectable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectable: Self = this.set("selectable", js.undefined)
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
  }
  
}

