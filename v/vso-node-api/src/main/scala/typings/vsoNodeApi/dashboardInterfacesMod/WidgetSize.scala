package typings.vsoNodeApi.dashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetSize extends js.Object {
  /**
    * The Width of the widget, expressed in dashboard grid columns.
    */
  var columnSpan: Double
  /**
    * The height of the widget, expressed in dashboard grid rows.
    */
  var rowSpan: Double
}

object WidgetSize {
  @scala.inline
  def apply(columnSpan: Double, rowSpan: Double): WidgetSize = {
    val __obj = js.Dynamic.literal(columnSpan = columnSpan.asInstanceOf[js.Any], rowSpan = rowSpan.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetSize]
  }
}

