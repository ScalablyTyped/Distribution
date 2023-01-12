package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.edit.afterCellEditHandler
import typings.uiGrid.mod.edit.beginCellEditHandler
import typings.uiGrid.mod.edit.cancelCellEditHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AfterCellEdit[TEntity] extends StObject {
  
  /**
    * raised when cell editing is complete
    * @param scope The grid scope
    * @param handler Callback
    */
  def afterCellEdit(scope: IScope, handler: afterCellEditHandler[TEntity]): Unit
  
  /**
    * raised when cell editing starts on a cell
    * @param scope The grid scope
    * @param handler Callback
    */
  def beginCellEdit(scope: IScope, handler: beginCellEditHandler[TEntity]): Unit
  
  /**
    * raised when cell editing is cancelled on a cell
    * @param scope The grid scope
    * @param handler Callback
    */
  def cancelCellEdit(scope: IScope, handler: cancelCellEditHandler[TEntity]): Unit
}
object AfterCellEdit {
  
  inline def apply[TEntity](
    afterCellEdit: (IScope, afterCellEditHandler[TEntity]) => Unit,
    beginCellEdit: (IScope, beginCellEditHandler[TEntity]) => Unit,
    cancelCellEdit: (IScope, cancelCellEditHandler[TEntity]) => Unit
  ): AfterCellEdit[TEntity] = {
    val __obj = js.Dynamic.literal(afterCellEdit = js.Any.fromFunction2(afterCellEdit), beginCellEdit = js.Any.fromFunction2(beginCellEdit), cancelCellEdit = js.Any.fromFunction2(cancelCellEdit))
    __obj.asInstanceOf[AfterCellEdit[TEntity]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AfterCellEdit[?], TEntity] (val x: Self & AfterCellEdit[TEntity]) extends AnyVal {
    
    inline def setAfterCellEdit(value: (IScope, afterCellEditHandler[TEntity]) => Unit): Self = StObject.set(x, "afterCellEdit", js.Any.fromFunction2(value))
    
    inline def setBeginCellEdit(value: (IScope, beginCellEditHandler[TEntity]) => Unit): Self = StObject.set(x, "beginCellEdit", js.Any.fromFunction2(value))
    
    inline def setCancelCellEdit(value: (IScope, cancelCellEditHandler[TEntity]) => Unit): Self = StObject.set(x, "cancelCellEdit", js.Any.fromFunction2(value))
  }
}
