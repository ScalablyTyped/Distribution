package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.moveColumns.columnPositionChangedHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColumnPositionChanged extends StObject {
  
  /**
    * Raised when a column is moved
    * @param {ng.IScope} scope Grid Scope
    * @param {columnPositionChangedHandler} handler Callback Function
    */
  var columnPositionChanged: js.UndefOr[
    js.Function2[/* scope */ IScope, /* handler */ columnPositionChangedHandler, Unit]
  ] = js.native
}
object ColumnPositionChanged {
  
  @scala.inline
  def apply(): ColumnPositionChanged = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColumnPositionChanged]
  }
  
  @scala.inline
  implicit class ColumnPositionChangedMutableBuilder[Self <: ColumnPositionChanged] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColumnPositionChanged(value: (/* scope */ IScope, /* handler */ columnPositionChangedHandler) => Unit): Self = StObject.set(x, "columnPositionChanged", js.Any.fromFunction2(value))
    
    @scala.inline
    def setColumnPositionChangedUndefined: Self = StObject.set(x, "columnPositionChanged", js.undefined)
  }
}
