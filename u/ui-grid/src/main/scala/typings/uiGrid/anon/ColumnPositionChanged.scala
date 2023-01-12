package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.moveColumns.columnPositionChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ColumnPositionChanged extends StObject {
  
  /**
    * Raised when a column is moved
    * @param scope Grid Scope
    * @param handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.undefined
}
object ColumnPositionChanged {
  
  inline def apply(): ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPositionChanged]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ColumnPositionChanged] (val x: Self) extends AnyVal {
    
    inline def setColumnPositionChanged(value: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Unit): Self = StObject.set(x, "columnPositionChanged", js.Any.fromFunction2(value))
    
    inline def setColumnPositionChangedUndefined: Self = StObject.set(x, "columnPositionChanged", js.undefined)
  }
}
