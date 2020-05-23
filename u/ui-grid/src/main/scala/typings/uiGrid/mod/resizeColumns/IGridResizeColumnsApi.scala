package typings.uiGrid.mod.resizeColumns

import typings.uiGrid.anon.ColumnSizeChanged
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridResizeColumnsApi extends js.Object {
  // Events
  var on: ColumnSizeChanged
}

object IGridResizeColumnsApi {
  @scala.inline
  def apply(on: ColumnSizeChanged): IGridResizeColumnsApi = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridResizeColumnsApi]
  }
}

