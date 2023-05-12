package typings.tabulatorTables.mod

import typings.tabulatorTables.tabulatorTablesStrings.editor
import typings.tabulatorTables.tabulatorTablesStrings.table
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumberParams
  extends StObject
     with SharedEditorParams
     with _EditorParams {
  
  var max: js.UndefOr[Double] = js.undefined
  
  // range,number
  var min: js.UndefOr[Double] = js.undefined
  
  /** When the editor is loaded select its text content */
  var selectContents: js.UndefOr[Boolean] = js.undefined
  
  var step: js.UndefOr[Double] = js.undefined
  
  var verticalNavigation: js.UndefOr[editor | table] = js.undefined
}
object NumberParams {
  
  inline def apply(): NumberParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumberParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumberParams] (val x: Self) extends AnyVal {
    
    inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
    
    inline def setSelectContents(value: Boolean): Self = StObject.set(x, "selectContents", value.asInstanceOf[js.Any])
    
    inline def setSelectContentsUndefined: Self = StObject.set(x, "selectContents", js.undefined)
    
    inline def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
    
    inline def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    
    inline def setVerticalNavigation(value: editor | table): Self = StObject.set(x, "verticalNavigation", value.asInstanceOf[js.Any])
    
    inline def setVerticalNavigationUndefined: Self = StObject.set(x, "verticalNavigation", js.undefined)
  }
}
