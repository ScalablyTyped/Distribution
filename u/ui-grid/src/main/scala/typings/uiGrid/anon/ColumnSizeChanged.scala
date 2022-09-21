package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.resizeColumns.columnSizeChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnSizeChanged extends StObject {
  
  /**
    * Raised when column is resized
    * @param scope Grid Scope
    * @param handler Callback
    */
  def columnSizeChanged(scope: IScope, handler: columnSizeChangedHandler): Unit
}
object ColumnSizeChanged {
  
  inline def apply(columnSizeChanged: (IScope, columnSizeChangedHandler) => Unit): ColumnSizeChanged = {
    val __obj = js.Dynamic.literal(columnSizeChanged = js.Any.fromFunction2(columnSizeChanged))
    __obj.asInstanceOf[ColumnSizeChanged]
  }
  
  extension [Self <: ColumnSizeChanged](x: Self) {
    
    inline def setColumnSizeChanged(value: (IScope, columnSizeChangedHandler) => Unit): Self = StObject.set(x, "columnSizeChanged", js.Any.fromFunction2(value))
  }
}
