package typings.vsoDashNodeDashApi.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetPosition extends js.Object {
  var column: Double
  var row: Double
}

object WidgetPosition {
  @scala.inline
  def apply(column: Double, row: Double): WidgetPosition = {
    val __obj = js.Dynamic.literal(column = column, row = row)
  
    __obj.asInstanceOf[WidgetPosition]
  }
}

