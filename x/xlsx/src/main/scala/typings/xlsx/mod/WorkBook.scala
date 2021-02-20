package typings.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkBook extends StObject {
  
  /** Custom workbook Properties */
  var Custprops: js.UndefOr[js.Object] = js.native
  
  /** Standard workbook Properties */
  var Props: js.UndefOr[FullProperties] = js.native
  
  /** Ordered list of the sheet names in the workbook */
  var SheetNames: js.Array[String] = js.native
  
  /**
    * A dictionary of the worksheets in the workbook.
    * Use SheetNames to reference these.
    */
  var Sheets: StringDictionary[WorkSheet] = js.native
  
  var Workbook: js.UndefOr[WBProps] = js.native
  
  var vbaraw: js.UndefOr[js.Any] = js.native
}
object WorkBook {
  
  @scala.inline
  def apply(SheetNames: js.Array[String], Sheets: StringDictionary[WorkSheet]): WorkBook = {
    val __obj = js.Dynamic.literal(SheetNames = SheetNames.asInstanceOf[js.Any], Sheets = Sheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkBook]
  }
  
  @scala.inline
  implicit class WorkBookMutableBuilder[Self <: WorkBook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustprops(value: js.Object): Self = StObject.set(x, "Custprops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustpropsUndefined: Self = StObject.set(x, "Custprops", js.undefined)
    
    @scala.inline
    def setProps(value: FullProperties): Self = StObject.set(x, "Props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "Props", js.undefined)
    
    @scala.inline
    def setSheetNames(value: js.Array[String]): Self = StObject.set(x, "SheetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetNamesVarargs(value: String*): Self = StObject.set(x, "SheetNames", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: StringDictionary[WorkSheet]): Self = StObject.set(x, "Sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbaraw(value: js.Any): Self = StObject.set(x, "vbaraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVbarawUndefined: Self = StObject.set(x, "vbaraw", js.undefined)
    
    @scala.inline
    def setWorkbook(value: WBProps): Self = StObject.set(x, "Workbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkbookUndefined: Self = StObject.set(x, "Workbook", js.undefined)
  }
}
