package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.canvasHeightChangedHandler
import typings.uiGrid.mod.columnVisibilityChangedHandler
import typings.uiGrid.mod.filterChangedHandler
import typings.uiGrid.mod.rowsRenderedHandler
import typings.uiGrid.mod.rowsVisibleChangedHandler
import typings.uiGrid.mod.scrollBeginHandler
import typings.uiGrid.mod.scrollEndHandler
import typings.uiGrid.mod.sortChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CanvasHeightChanged[TEntity] extends StObject {
  
  /**
    * is raised when the canvas height has changed
    * @param scope Grid scope
    * @param handler Callback
    */
  def canvasHeightChanged(scope: IScope, handler: canvasHeightChangedHandler): Unit
  
  /**
    * The visibility of a column has changed, the column itself is passed out as a parameter of the event
    * @param scope The scope of the controller. This is used to deregister this event when the
    *        scope is destroyed
    * @param callBack Will be called when the event is emited.
    *        The function passes back the GridCol that has changed
    */
  def columnVisibilityChanged(scope: IScope, callBack: columnVisibilityChangedHandler[TEntity]): Unit
  
  /**
    * is raised after the filter is changed.
    * The nature of the watch expression doesn't allow notification of what changed,
    * so the receiver of this event will need to re-extract the filter conditions from the columns.
    * @param scope Grid scope
    * @param handler Callback
    */
  def filterChanged(scope: IScope, handler: filterChangedHandler[TEntity]): Unit
  
  /**
    * is raised after the cache of visible rows is changed
    * @param scope Grid scope
    * @param handler callback
    */
  def rowsRendered(scope: IScope, handler: rowsRenderedHandler[TEntity]): Unit
  
  /**
    * is raised after the rows that are visible change.
    * The filtering is zero-based, so it isn't possible to say which rows changed
    * (unlike in the selection feature). We can plausibly know which row was changed when setRowInvisible is
    * called, but in that situation the user already knows which row they changed.
    * When a filter runs we don't know what changed, and that is the one that would have been useful.
    * @param scope Grid scope
    * @param handler callback
    */
  def rowsVisibleChanged(scope: IScope, handler: rowsVisibleChangedHandler[TEntity]): Unit
  
  /**
    * is raised when scroll begins. Is throttled, so won't be raised too frequently
    * @param scope Grid scope
    * @param handler callback
    */
  def scrollBegin(scope: IScope, handler: scrollBeginHandler): Unit
  
  /**
    * is raised when scroll has finished. Is throttled, so won't be raised too frequently
    * @param scope Grid scope
    * @param handler callback
    */
  def scrollEnd(scope: IScope, handler: scrollEndHandler): Unit
  
  /**
    * is raised after the sort criteria on one or more columns have changed
    * @param scope Grid scope
    * @param handler callback
    */
  def sortChanged(scope: IScope, handler: sortChangedHandler[TEntity]): Unit
}
object CanvasHeightChanged {
  
  inline def apply[TEntity](
    canvasHeightChanged: (IScope, canvasHeightChangedHandler) => Unit,
    columnVisibilityChanged: (IScope, columnVisibilityChangedHandler[TEntity]) => Unit,
    filterChanged: (IScope, filterChangedHandler[TEntity]) => Unit,
    rowsRendered: (IScope, rowsRenderedHandler[TEntity]) => Unit,
    rowsVisibleChanged: (IScope, rowsVisibleChangedHandler[TEntity]) => Unit,
    scrollBegin: (IScope, scrollBeginHandler) => Unit,
    scrollEnd: (IScope, scrollEndHandler) => Unit,
    sortChanged: (IScope, sortChangedHandler[TEntity]) => Unit
  ): CanvasHeightChanged[TEntity] = {
    val __obj = js.Dynamic.literal(canvasHeightChanged = js.Any.fromFunction2(canvasHeightChanged), columnVisibilityChanged = js.Any.fromFunction2(columnVisibilityChanged), filterChanged = js.Any.fromFunction2(filterChanged), rowsRendered = js.Any.fromFunction2(rowsRendered), rowsVisibleChanged = js.Any.fromFunction2(rowsVisibleChanged), scrollBegin = js.Any.fromFunction2(scrollBegin), scrollEnd = js.Any.fromFunction2(scrollEnd), sortChanged = js.Any.fromFunction2(sortChanged))
    __obj.asInstanceOf[CanvasHeightChanged[TEntity]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CanvasHeightChanged[?], TEntity] (val x: Self & CanvasHeightChanged[TEntity]) extends AnyVal {
    
    inline def setCanvasHeightChanged(value: (IScope, canvasHeightChangedHandler) => Unit): Self = StObject.set(x, "canvasHeightChanged", js.Any.fromFunction2(value))
    
    inline def setColumnVisibilityChanged(value: (IScope, columnVisibilityChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "columnVisibilityChanged", js.Any.fromFunction2(value))
    
    inline def setFilterChanged(value: (IScope, filterChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "filterChanged", js.Any.fromFunction2(value))
    
    inline def setRowsRendered(value: (IScope, rowsRenderedHandler[TEntity]) => Unit): Self = StObject.set(x, "rowsRendered", js.Any.fromFunction2(value))
    
    inline def setRowsVisibleChanged(value: (IScope, rowsVisibleChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "rowsVisibleChanged", js.Any.fromFunction2(value))
    
    inline def setScrollBegin(value: (IScope, scrollBeginHandler) => Unit): Self = StObject.set(x, "scrollBegin", js.Any.fromFunction2(value))
    
    inline def setScrollEnd(value: (IScope, scrollEndHandler) => Unit): Self = StObject.set(x, "scrollEnd", js.Any.fromFunction2(value))
    
    inline def setSortChanged(value: (IScope, sortChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "sortChanged", js.Any.fromFunction2(value))
  }
}
