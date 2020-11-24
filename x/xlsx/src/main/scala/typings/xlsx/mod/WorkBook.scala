package typings.xlsx.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkBook extends js.Object {
  
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
  implicit class WorkBookOps[Self <: WorkBook] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSheetNamesVarargs(value: String*): Self = this.set("SheetNames", js.Array(value :_*))
    
    @scala.inline
    def setSheetNames(value: js.Array[String]): Self = this.set("SheetNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheets(value: StringDictionary[WorkSheet]): Self = this.set("Sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustprops(value: js.Object): Self = this.set("Custprops", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustprops: Self = this.set("Custprops", js.undefined)
    
    @scala.inline
    def setProps(value: FullProperties): Self = this.set("Props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("Props", js.undefined)
    
    @scala.inline
    def setWorkbook(value: WBProps): Self = this.set("Workbook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkbook: Self = this.set("Workbook", js.undefined)
    
    @scala.inline
    def setVbaraw(value: js.Any): Self = this.set("vbaraw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVbaraw: Self = this.set("vbaraw", js.undefined)
  }
}
