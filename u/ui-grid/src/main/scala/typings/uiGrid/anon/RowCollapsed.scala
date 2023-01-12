package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.treeBase.rowCollapsedHandler
import typings.uiGrid.mod.treeBase.rowExpandedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowCollapsed[TEntity] extends StObject {
  
  /**
    * Raised when a row is collapsed.  Doesn't really have a purpose at the moment.  Included for symmetry
    * @param scope Grid scope
    * @param handler Callback
    */
  def rowCollapsed(scope: IScope, handler: rowCollapsedHandler[TEntity]): Unit
  
  /**
    * Raised whenever a row is expanded.
    *
    * If you are dynamically rendering your tree,
    * in your callback you can retrieve the children of this row and load them into the grid data.
    *
    * When the data is loaded, the grid will automatically refresh to show these new rows.
    * @param scope Grid Scope
    * @param handler Callback
    */
  def rowExpanded(scope: IScope, handler: rowExpandedHandler[TEntity]): Unit
}
object RowCollapsed {
  
  inline def apply[TEntity](
    rowCollapsed: (IScope, rowCollapsedHandler[TEntity]) => Unit,
    rowExpanded: (IScope, rowExpandedHandler[TEntity]) => Unit
  ): RowCollapsed[TEntity] = {
    val __obj = js.Dynamic.literal(rowCollapsed = js.Any.fromFunction2(rowCollapsed), rowExpanded = js.Any.fromFunction2(rowExpanded))
    __obj.asInstanceOf[RowCollapsed[TEntity]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowCollapsed[?], TEntity] (val x: Self & RowCollapsed[TEntity]) extends AnyVal {
    
    inline def setRowCollapsed(value: (IScope, rowCollapsedHandler[TEntity]) => Unit): Self = StObject.set(x, "rowCollapsed", js.Any.fromFunction2(value))
    
    inline def setRowExpanded(value: (IScope, rowExpandedHandler[TEntity]) => Unit): Self = StObject.set(x, "rowExpanded", js.Any.fromFunction2(value))
  }
}
