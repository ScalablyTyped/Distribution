package typings
package vsoDashNodeDashApiLib.interfacesDashboardInterfacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetPosition extends js.Object {
  var column: scala.Double
  var row: scala.Double
}

object WidgetPosition {
  @scala.inline
  def apply(column: scala.Double, row: scala.Double): WidgetPosition = {
    val __obj = js.Dynamic.literal(column = column, row = row)
  
    __obj.asInstanceOf[WidgetPosition]
  }
}

