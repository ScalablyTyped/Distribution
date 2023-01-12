package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.asc
import typings.tabulatorTables.tabulatorTablesStrings.desc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SharedSelectAutoCompleteEditorParams extends StObject {
  
  var defaultValue: js.UndefOr[String] = js.undefined
  
  var sortValuesList: js.UndefOr[asc | desc] = js.undefined
}
object SharedSelectAutoCompleteEditorParams {
  
  inline def apply(): SharedSelectAutoCompleteEditorParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SharedSelectAutoCompleteEditorParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SharedSelectAutoCompleteEditorParams] (val x: Self) extends AnyVal {
    
    inline def setDefaultValue(value: String): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
    
    inline def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
    
    inline def setSortValuesList(value: asc | desc): Self = StObject.set(x, "sortValuesList", value.asInstanceOf[js.Any])
    
    inline def setSortValuesListUndefined: Self = StObject.set(x, "sortValuesList", js.undefined)
  }
}
