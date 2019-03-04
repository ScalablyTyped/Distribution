package typings
package uiDashGridLib.uiDashGridMod.uiGridNs.editNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IGridEditApi[TEntity] extends js.Object {
  var on: uiDashGridLib.Anon_AfterCellEdit[TEntity]
}

object IGridEditApi {
  @scala.inline
  def apply[TEntity](on: uiDashGridLib.Anon_AfterCellEdit[TEntity]): IGridEditApi[TEntity] = {
    val __obj = js.Dynamic.literal(on = on)
  
    __obj.asInstanceOf[IGridEditApi[TEntity]]
  }
}

