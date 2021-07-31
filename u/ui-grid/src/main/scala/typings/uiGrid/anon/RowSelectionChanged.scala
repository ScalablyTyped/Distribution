package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.selection.rowSelectionChangedBatchHandler
import typings.uiGrid.mod.selection.rowSelectionChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowSelectionChanged[TEntity] extends StObject {
  
  /**
    * is raised after the row.isSelected state is changed
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedHandler} handler callback
    */
  def rowSelectionChanged(scope: IScope, handler: rowSelectionChangedHandler[TEntity]): Unit
  
  /**
    * is raised after the row.isSelected state is changed in bulk,
    * if the enableSelectionBatchEvent option is set to true (which it is by default).
    * This allows more efficient processing of bulk events.
    * @param {ng.IScope} scope grid scope
    * @param {rowSelectionChangedBatchHandler} handler callback
    */
  def rowSelectionChangedBatch(scope: IScope, handler: rowSelectionChangedBatchHandler[TEntity]): Unit
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
  implicit class RowSelectionChangedMutableBuilder[Self <: RowSelectionChanged[?], TEntity] (val x: Self & RowSelectionChanged[TEntity]) extends AnyVal {
    
    @scala.inline
    def setRowSelectionChanged(value: (IScope, rowSelectionChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "rowSelectionChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRowSelectionChangedBatch(value: (IScope, rowSelectionChangedBatchHandler[TEntity]) => Unit): Self = StObject.set(x, "rowSelectionChangedBatch", js.Any.fromFunction2(value))
  }
}
