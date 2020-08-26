package typings.uikit.mod.UIkit

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UIkitSortableOptions extends js.Object {
  var animation: js.UndefOr[Double] = js.native
  var `cls-base`: js.UndefOr[String] = js.native
  var `cls-custom`: String = js.native
  var `cls-drag`: js.UndefOr[String] = js.native
  var `cls-drag-state`: js.UndefOr[String] = js.native
  var `cls-empty`: js.UndefOr[String] = js.native
  var `cls-item`: js.UndefOr[String] = js.native
  var `cls-no-drag`: js.UndefOr[String] = js.native
  var `cls-placeholder`: js.UndefOr[String] = js.native
  var group: js.UndefOr[String] = js.native
  var handle: js.UndefOr[String] = js.native
  var threshold: js.UndefOr[Double] = js.native
}

object UIkitSortableOptions {
  @scala.inline
  def apply(`cls-custom`: String): UIkitSortableOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cls-custom")(`cls-custom`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UIkitSortableOptions]
  }
  @scala.inline
  implicit class UIkitSortableOptionsOps[Self <: UIkitSortableOptions] (val x: Self) extends AnyVal {
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
    def `setCls-custom`(value: String): Self = this.set("cls-custom", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimation(value: Double): Self = this.set("animation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimation: Self = this.set("animation", js.undefined)
    @scala.inline
    def `setCls-base`(value: String): Self = this.set("cls-base", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCls-base`: Self = this.set("cls-base", js.undefined)
    @scala.inline
    def `setCls-drag`(value: String): Self = this.set("cls-drag", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCls-drag`: Self = this.set("cls-drag", js.undefined)
    @scala.inline
    def `setCls-drag-state`(value: String): Self = this.set("cls-drag-state", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCls-drag-state`: Self = this.set("cls-drag-state", js.undefined)
    @scala.inline
    def `setCls-empty`(value: String): Self = this.set("cls-empty", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCls-empty`: Self = this.set("cls-empty", js.undefined)
    @scala.inline
    def `setCls-item`(value: String): Self = this.set("cls-item", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCls-item`: Self = this.set("cls-item", js.undefined)
    @scala.inline
    def `setCls-no-drag`(value: String): Self = this.set("cls-no-drag", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCls-no-drag`: Self = this.set("cls-no-drag", js.undefined)
    @scala.inline
    def `setCls-placeholder`(value: String): Self = this.set("cls-placeholder", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteCls-placeholder`: Self = this.set("cls-placeholder", js.undefined)
    @scala.inline
    def setGroup(value: String): Self = this.set("group", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroup: Self = this.set("group", js.undefined)
    @scala.inline
    def setHandle(value: String): Self = this.set("handle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHandle: Self = this.set("handle", js.undefined)
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
  
}

