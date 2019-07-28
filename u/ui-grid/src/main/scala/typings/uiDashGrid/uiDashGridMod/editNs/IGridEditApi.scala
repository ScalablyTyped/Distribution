package typings.uiDashGrid.uiDashGridMod.editNs

import typings.uiDashGrid.Anon_AfterCellEdit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridEditApi[TEntity] extends js.Object {
  var on: Anon_AfterCellEdit[TEntity]
}

object IGridEditApi {
  @scala.inline
  def apply[TEntity](on: Anon_AfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on)
  
    __obj.asInstanceOf[IGridEditApi[TEntity]]
  }
}

