package typings.uiGrid.mod.edit

import typings.uiGrid.AnonAfterCellEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridEditApi[TEntity] extends js.Object {
  var on: AnonAfterCellEdit[TEntity]
}

object IGridEditApi {
  @scala.inline
  def apply[TEntity](on: AnonAfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridEditApi[TEntity]]
  }
}

