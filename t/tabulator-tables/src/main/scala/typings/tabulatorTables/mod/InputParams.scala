package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputParams
  extends StObject
     with SharedEditorParams
     with _EditorParams {
  
  /** Changes input type to 'search' and shows an 'X' clear button to clear the cell value easily. */
  var search: js.UndefOr[Boolean] = js.undefined
}
object InputParams {
  
  inline def apply(): InputParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputParams] (val x: Self) extends AnyVal {
    
    inline def setSearch(value: Boolean): Self = StObject.set(x, "search", value.asInstanceOf[js.Any])
    
    inline def setSearchUndefined: Self = StObject.set(x, "search", js.undefined)
  }
}
