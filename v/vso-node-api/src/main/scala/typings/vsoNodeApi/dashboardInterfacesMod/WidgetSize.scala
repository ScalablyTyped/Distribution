package typings.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WidgetSize extends js.Object {
  /**
    * The Width of the widget, expressed in dashboard grid columns.
    */
  var columnSpan: Double = js.native
  /**
    * The height of the widget, expressed in dashboard grid rows.
    */
  var rowSpan: Double = js.native
}

object WidgetSize {
  @scala.inline
  def apply(columnSpan: Double, rowSpan: Double): WidgetSize = {
    val __obj = js.Dynamic.literal(columnSpan = columnSpan.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetSize]
  }
  @scala.inline
  implicit class WidgetSizeOps[Self <: WidgetSize] (val x: Self) extends AnyVal {
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
    def setColumnSpan(value: Double): Self = this.set("columnSpan", value.asInstanceOf[js.Any])
    @scala.inline
    def setRowSpan(value: Double): Self = this.set("rowSpan", value.asInstanceOf[js.Any])
  }
  
}

