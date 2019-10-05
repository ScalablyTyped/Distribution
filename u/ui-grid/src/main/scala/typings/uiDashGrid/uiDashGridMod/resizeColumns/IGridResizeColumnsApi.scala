package typings.uiDashGrid.uiDashGridMod.resizeColumns

import typings.uiDashGrid.Anon_ColumnSizeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridResizeColumnsApi extends js.Object {
  // Events
  var on: Anon_ColumnSizeChanged
}

object IGridResizeColumnsApi {
  @scala.inline
  def apply(on: Anon_ColumnSizeChanged): IGridResizeColumnsApi = {
    val __obj = js.Dynamic.literal(on = on)
  
    __obj.asInstanceOf[IGridResizeColumnsApi]
  }
}

