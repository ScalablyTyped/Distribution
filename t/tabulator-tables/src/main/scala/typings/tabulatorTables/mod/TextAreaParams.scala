package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.hybrid
import typings.tabulatorTables.tabulatorTablesStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextAreaParams
  extends StObject
     with SharedEditorParams
     with _EditorParams {
  
  /** Allow submission of the value of the editor when the shift and enter keys are pressed together. */
  var shiftEnterSubmit: js.UndefOr[Boolean] = js.undefined
  
  var verticalNavigation: js.UndefOr[editor | table | hybrid] = js.undefined
}
object TextAreaParams {
  
  inline def apply(): TextAreaParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TextAreaParams] (val x: Self) extends AnyVal {
    
    inline def setShiftEnterSubmit(value: Boolean): Self = StObject.set(x, "shiftEnterSubmit", value.asInstanceOf[js.Any])
    
    inline def setShiftEnterSubmitUndefined: Self = StObject.set(x, "shiftEnterSubmit", js.undefined)
    
    inline def setVerticalNavigation(value: editor | table | hybrid): Self = StObject.set(x, "verticalNavigation", value.asInstanceOf[js.Any])
    
    inline def setVerticalNavigationUndefined: Self = StObject.set(x, "verticalNavigation", js.undefined)
  }
}
