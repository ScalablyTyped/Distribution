package typings.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkBook extends StObject {
  
  /** Custom workbook Properties */
  var Custprops: js.UndefOr[js.Object] = js.undefined
  
  /** Standard workbook Properties */
  var Props: js.UndefOr[FullProperties] = js.undefined
  
  /** Ordered list of the sheet names in the workbook */
  var SheetNames: js.Array[String]
  
  /**
    * A dictionary of the worksheets in the workbook.
    * Use SheetNames to reference these.
    */
  var Sheets: StringDictionary[WorkSheet]
  
  var Workbook: js.UndefOr[WBProps] = js.undefined
  
  var vbaraw: js.UndefOr[Any] = js.undefined
}
object WorkBook {
  
  inline def apply(SheetNames: js.Array[String], Sheets: StringDictionary[WorkSheet]): WorkBook = {
    val __obj = js.Dynamic.literal(SheetNames = SheetNames.asInstanceOf[js.Any], Sheets = Sheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkBook]
  }
  
  extension [Self <: WorkBook](x: Self) {
    
    inline def setCustprops(value: js.Object): Self = StObject.set(x, "Custprops", value.asInstanceOf[js.Any])
    
    inline def setCustpropsUndefined: Self = StObject.set(x, "Custprops", js.undefined)
    
    inline def setProps(value: FullProperties): Self = StObject.set(x, "Props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "Props", js.undefined)
    
    inline def setSheetNames(value: js.Array[String]): Self = StObject.set(x, "SheetNames", value.asInstanceOf[js.Any])
    
    inline def setSheetNamesVarargs(value: String*): Self = StObject.set(x, "SheetNames", js.Array(value*))
    
    inline def setSheets(value: StringDictionary[WorkSheet]): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    inline def setVbaraw(value: Any): Self = StObject.set(x, "vbaraw", value.asInstanceOf[js.Any])
    
    inline def setVbarawUndefined: Self = StObject.set(x, "vbaraw", js.undefined)
    
    inline def setWorkbook(value: WBProps): Self = StObject.set(x, "Workbook", value.asInstanceOf[js.Any])
    
    inline def setWorkbookUndefined: Self = StObject.set(x, "Workbook", js.undefined)
  }
}
