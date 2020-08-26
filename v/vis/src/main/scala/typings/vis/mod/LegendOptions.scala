package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegendOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.native
  var iconSize: js.UndefOr[Double] = js.native
  var iconSpacing: js.UndefOr[Double] = js.native
  var icons: js.UndefOr[Boolean] = js.native
  var left: js.UndefOr[LegendPositionOptions] = js.native
  var right: js.UndefOr[LegendPositionOptions] = js.native
}

object LegendOptions {
  @scala.inline
  def apply(): LegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendOptions]
  }
  @scala.inline
  implicit class LegendOptionsOps[Self <: LegendOptions] (val x: Self) extends AnyVal {
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
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    @scala.inline
    def setIconSize(value: Double): Self = this.set("iconSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSize: Self = this.set("iconSize", js.undefined)
    @scala.inline
    def setIconSpacing(value: Double): Self = this.set("iconSpacing", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIconSpacing: Self = this.set("iconSpacing", js.undefined)
    @scala.inline
    def setIcons(value: Boolean): Self = this.set("icons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcons: Self = this.set("icons", js.undefined)
    @scala.inline
    def setLeft(value: LegendPositionOptions): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLeft: Self = this.set("left", js.undefined)
    @scala.inline
    def setRight(value: LegendPositionOptions): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRight: Self = this.set("right", js.undefined)
  }
  
}

