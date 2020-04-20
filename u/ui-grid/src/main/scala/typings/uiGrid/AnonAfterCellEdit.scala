package typings.uiGrid

import typings.angular.mod.IScope
import typings.uiGrid.mod.edit.afterCellEditHandler
import typings.uiGrid.mod.edit.beginCellEditHandler
import typings.uiGrid.mod.edit.cancelCellEditHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAfterCellEdit[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param {afterCellEditHandler} handler Callback
    */
  def afterCellEdit(scope: IScope, handler: afterCellEditHandler[TEntity]): Unit
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param {beginCellEditHandler} handler Callback
    */
  def beginCellEdit(scope: IScope, handler: beginCellEditHandler[TEntity]): Unit
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param {cancelCellEditHandler} handler Callback
    */
  def cancelCellEdit(scope: IScope, handler: cancelCellEditHandler[TEntity]): Unit
}

object AnonAfterCellEdit {
  @scala.inline
  def apply[TEntity](
    afterCellEdit: (IScope, afterCellEditHandler[TEntity]) => Unit,
    beginCellEdit: (IScope, beginCellEditHandler[TEntity]) => Unit,
    cancelCellEdit: (IScope, cancelCellEditHandler[TEntity]) => Unit
  ): AnonAfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal(afterCellEdit = js.Any.fromFunction2(afterCellEdit), beginCellEdit = js.Any.fromFunction2(beginCellEdit), cancelCellEdit = js.Any.fromFunction2(cancelCellEdit))
    __obj.asInstanceOf[AnonAfterCellEdit[TEntity]]
  }
}

