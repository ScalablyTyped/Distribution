package typings.vis.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph2dBarChartOption extends js.Object {
  var align: js.UndefOr[Graph2dBarChartAlign] = js.native
  var minWidth: js.UndefOr[Double] = js.native
  var sideBySide: js.UndefOr[Boolean] = js.native
  var width: js.UndefOr[Double] = js.native
}

object Graph2dBarChartOption {
  @scala.inline
  def apply(): Graph2dBarChartOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Graph2dBarChartOption]
  }
  @scala.inline
  implicit class Graph2dBarChartOptionOps[Self <: Graph2dBarChartOption] (val x: Self) extends AnyVal {
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
    def setAlign(value: Graph2dBarChartAlign): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
    @scala.inline
    def setMinWidth(value: Double): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setSideBySide(value: Boolean): Self = this.set("sideBySide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSideBySide: Self = this.set("sideBySide", js.undefined)
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

