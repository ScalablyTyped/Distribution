package typings
package uiDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AfterCellEdit[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param {afterCellEditHandler} handler Callback
    */
  def afterCellEdit(
    scope: angularLib.angularMod.IScope,
    handler: uiDashGridLib.uiDashGridMod.editNs.afterCellEditHandler[TEntity]
  ): scala.Unit
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param {beginCellEditHandler} handler Callback
    */
  def beginCellEdit(
    scope: angularLib.angularMod.IScope,
    handler: uiDashGridLib.uiDashGridMod.editNs.beginCellEditHandler[TEntity]
  ): scala.Unit
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param {cancelCellEditHandler} handler Callback
    */
  def cancelCellEdit(
    scope: angularLib.angularMod.IScope,
    handler: uiDashGridLib.uiDashGridMod.editNs.cancelCellEditHandler[TEntity]
  ): scala.Unit
}

object Anon_AfterCellEdit {
  @scala.inline
  def apply[TEntity](
    afterCellEdit: (angularLib.angularMod.IScope, uiDashGridLib.uiDashGridMod.editNs.afterCellEditHandler[TEntity]) => scala.Unit,
    beginCellEdit: (angularLib.angularMod.IScope, uiDashGridLib.uiDashGridMod.editNs.beginCellEditHandler[TEntity]) => scala.Unit,
    cancelCellEdit: (angularLib.angularMod.IScope, uiDashGridLib.uiDashGridMod.editNs.cancelCellEditHandler[TEntity]) => scala.Unit
  ): Anon_AfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal(afterCellEdit = js.Any.fromFunction2(afterCellEdit), beginCellEdit = js.Any.fromFunction2(beginCellEdit), cancelCellEdit = js.Any.fromFunction2(cancelCellEdit))
  
    __obj.asInstanceOf[Anon_AfterCellEdit[TEntity]]
  }
}

