package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetSize extends js.Object {
  /**
    * The Width of the widget, expressed in dashboard grid columns.
    */
  var columnSpan: scala.Double
  /**
    * The height of the widget, expressed in dashboard grid rows.
    */
  var rowSpan: scala.Double
}

object WidgetSize {
  @scala.inline
  def apply(columnSpan: scala.Double, rowSpan: scala.Double): WidgetSize = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("columnSpan")(columnSpan)
    __obj.updateDynamic("rowSpan")(rowSpan)
    __obj.asInstanceOf[WidgetSize]
  }
}

