package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.expandable.rowExpandedStateChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowExpandedStateChanged[TEntity] extends StObject {
  
  /**
    * raised when cell editing is complete
    * @param scope
    * @param handler
    */
  def rowExpandedStateChanged(scope: IScope, handler: rowExpandedStateChangedHandler[TEntity]): Unit
}
object RowExpandedStateChanged {
  
  inline def apply[TEntity](rowExpandedStateChanged: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): RowExpandedStateChanged[TEntity] = {
    val __obj = js.Dynamic.literal(rowExpandedStateChanged = js.Any.fromFunction2(rowExpandedStateChanged))
    __obj.asInstanceOf[RowExpandedStateChanged[TEntity]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RowExpandedStateChanged[?], TEntity] (val x: Self & RowExpandedStateChanged[TEntity]) extends AnyVal {
    
    inline def setRowExpandedStateChanged(value: (IScope, rowExpandedStateChangedHandler[TEntity]) => Unit): Self = StObject.set(x, "rowExpandedStateChanged", js.Any.fromFunction2(value))
  }
}
