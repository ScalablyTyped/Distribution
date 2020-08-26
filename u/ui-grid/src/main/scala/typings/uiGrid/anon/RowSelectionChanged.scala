package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.selection.rowSelectionChangedBatchHandler
import typings.uiGrid.mod.selection.rowSelectionChangedHandler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowSelectionChanged[TEntity] extends js.Object {
  /**
    * is raised after the row.isSelected state is changed
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedHandler} handler callback
    */
  def rowSelectionChanged(scope: IScope, handler: rowSelectionChangedHandler[TEntity]): Unit = js.native
  /**
    * is raised after the row.isSelected state is changed in bulk,
    * if the enableSelectionBatchEvent option is set to true (which it is by default).
    * This allows more efficient processing of bulk events.
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedBatchHandler} handler callback
    */
  def rowSelectionChangedBatch(scope: IScope, handler: rowSelectionChangedBatchHandler[TEntity]): Unit = js.native
}

object RowSelectionChanged {
  @scala.inline
  def apply[TEntity](
    rowSelectionChanged: (IScope, rowSelectionChangedHandler[TEntity]) => Unit,
    rowSelectionChangedBatch: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Unit
  ): RowSelectionChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowSelectionChanged = js.Any.fromFunction2(rowSelectionChanged), rowSelectionChangedBatch = js.Any.fromFunction2(rowSelectionChangedBatch))
    __obj.asInstanceOf[RowSelectionChanged[TEntity]]
  }
  @scala.inline
  implicit class RowSelectionChangedOps[Self <: RowSelectionChanged[_], TEntity] (val x: Self with RowSelectionChanged[TEntity]) extends AnyVal {
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
    def setRowSelectionChanged(value: (IScope, rowSelectionChangedHandler[TEntity]) => Unit): Self = this.set("rowSelectionChanged", js.Any.fromFunction2(value))
    @scala.inline
    def setRowSelectionChangedBatch(value: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Unit): Self = this.set("rowSelectionChangedBatch", js.Any.fromFunction2(value))
  }
  
}

