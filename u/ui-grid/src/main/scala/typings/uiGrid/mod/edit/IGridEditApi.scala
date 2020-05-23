package typings.uiGrid.mod.edit

import typings.uiGrid.anon.AfterCellEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridEditApi[TEntity] extends js.Object {
  var on: AfterCellEdit[TEntity]
}

object IGridEditApi {
  @scala.inline
  def apply[TEntity](on: AfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGridEditApi[TEntity]]
  }
}

