package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.edit.afterCellEditHandler
import typings.uiGrid.mod.edit.beginCellEditHandler
import typings.uiGrid.mod.edit.cancelCellEditHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AfterCellEdit[TEntity] extends js.Object {
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param {afterCellEditHandler} handler Callback
    */
  def afterCellEdit(scope: IScope, handler: afterCellEditHandler[TEntity]): Unit = js.native
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param {beginCellEditHandler} handler Callback
    */
  def beginCellEdit(scope: IScope, handler: beginCellEditHandler[TEntity]): Unit = js.native
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param {cancelCellEditHandler} handler Callback
    */
  def cancelCellEdit(scope: IScope, handler: cancelCellEditHandler[TEntity]): Unit = js.native
}

object AfterCellEdit {
  @scala.inline
  def apply[TEntity](
    afterCellEdit: (IScope, afterCellEditHandler[TEntity]) => Unit,
    beginCellEdit: (IScope, beginCellEditHandler[TEntity]) => Unit,
    cancelCellEdit: (IScope, cancelCellEditHandler[TEntity]) => Unit
  ): AfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal(afterCellEdit = js.Any.fromFunction2(afterCellEdit), beginCellEdit = js.Any.fromFunction2(beginCellEdit), cancelCellEdit = js.Any.fromFunction2(cancelCellEdit))
    __obj.asInstanceOf[AfterCellEdit[TEntity]]
  }
  @scala.inline
  implicit class AfterCellEditOps[Self <: AfterCellEdit[_], TEntity] (val x: Self with AfterCellEdit[TEntity]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAfterCellEdit(value: (IScope, afterCellEditHandler[TEntity]) => Unit): Self = this.set("afterCellEdit", js.Any.fromFunction2(value))
    @scala.inline
    def setBeginCellEdit(value: (IScope, beginCellEditHandler[TEntity]) => Unit): Self = this.set("beginCellEdit", js.Any.fromFunction2(value))
    @scala.inline
    def setCancelCellEdit(value: (IScope, cancelCellEditHandler[TEntity]) => Unit): Self = this.set("cancelCellEdit", js.Any.fromFunction2(value))
  }
  
}

