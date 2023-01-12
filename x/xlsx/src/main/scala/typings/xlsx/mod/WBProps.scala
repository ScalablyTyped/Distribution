package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WBProps extends StObject {
  
  /** Defined Names */
  var Names: js.UndefOr[js.Array[DefinedName]] = js.undefined
  
  /** Sheet Properties */
  var Sheets: js.UndefOr[js.Array[SheetProps]] = js.undefined
  
  /** Workbook Views */
  var Views: js.UndefOr[js.Array[WBView]] = js.undefined
  
  /** Other Workbook Properties */
  var WBProps: js.UndefOr[WorkbookProperties] = js.undefined
}
object WBProps {
  
  inline def apply(): WBProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WBProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WBProps] (val x: Self) extends AnyVal {
    
    inline def setNames(value: js.Array[DefinedName]): Self = StObject.set(x, "Names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "Names", js.undefined)
    
    inline def setNamesVarargs(value: DefinedName*): Self = StObject.set(x, "Names", js.Array(value*))
    
    inline def setSheets(value: js.Array[SheetProps]): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "Sheets", js.undefined)
    
    inline def setSheetsVarargs(value: SheetProps*): Self = StObject.set(x, "Sheets", js.Array(value*))
    
    inline def setViews(value: js.Array[WBView]): Self = StObject.set(x, "Views", value.asInstanceOf[js.Any])
    
    inline def setViewsUndefined: Self = StObject.set(x, "Views", js.undefined)
    
    inline def setViewsVarargs(value: WBView*): Self = StObject.set(x, "Views", js.Array(value*))
    
    inline def setWBProps(value: WorkbookProperties): Self = StObject.set(x, "WBProps", value.asInstanceOf[js.Any])
    
    inline def setWBPropsUndefined: Self = StObject.set(x, "WBProps", js.undefined)
  }
}
