package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.pagination.paginationChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaginationChanged extends StObject {
  
  /**
    * This event fires when the pageSize or currentPage changes
    * @param scope The grid scope
    * @param handler Callback
    */
  def paginationChanged(scope: IScope, handler: paginationChangedHandler): Unit
}
object PaginationChanged {
  
  inline def apply(paginationChanged: (IScope, paginationChangedHandler) => Unit): PaginationChanged = {
    val __obj = js.Dynamic.literal(paginationChanged = js.Any.fromFunction2(paginationChanged))
    __obj.asInstanceOf[PaginationChanged]
  }
  
  extension [Self <: PaginationChanged](x: Self) {
    
    inline def setPaginationChanged(value: (IScope, paginationChangedHandler) => Unit): Self = StObject.set(x, "paginationChanged", js.Any.fromFunction2(value))
  }
}
