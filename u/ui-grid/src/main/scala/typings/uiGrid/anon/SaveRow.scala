package typings.uiGrid.anon

import typings.angular.mod.IScope
import typings.uiGrid.mod.rowEdit.saveRowHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SaveRow[TEntity] extends StObject {
  
  /**
    * Raised when a row is ready for saving.
    * Once your row has saved you may need to use angular.extend to update the data entity
    * with any changed data from your save.
    * i.e. lock version information, or last update time/user information
    *
    * Your method should call setSavePromise somewhere in the body before returning control.
    * The feature will then wait, with the gridRow greyed out whilst this promise is being resolved.
    * @param {ng.IScope} scope The grid scope
    * @param {saveRowHandler} handler Callback
    */
  def saveRow(scope: IScope, handler: saveRowHandler[TEntity]): Unit
}
object SaveRow {
  
  inline def apply[TEntity](saveRow: (IScope, saveRowHandler[TEntity]) => Unit): SaveRow[TEntity] = {
    val __obj = js.Dynamic.literal(saveRow = js.Any.fromFunction2(saveRow))
    __obj.asInstanceOf[SaveRow[TEntity]]
  }
  
  extension [Self <: SaveRow[?], TEntity](x: Self & SaveRow[TEntity]) {
    
    inline def setSaveRow(value: (IScope, saveRowHandler[TEntity]) => Unit): Self = StObject.set(x, "saveRow", js.Any.fromFunction2(value))
  }
}
