package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonOptions extends js.Object {
  
  /**
    * If true, throw errors when features are not understood
    * @default false
    */
  var WTF: js.UndefOr[Boolean] = js.native
  
  /**
    * When reading a file with VBA macros, expose CFB blob to `vbaraw` field
    * When writing BIFF8/XLSB/XLSM, reseat `vbaraw` and export to file
    * @default false
    */
  var bookVBA: js.UndefOr[Boolean] = js.native
  
  /**
    * When reading a file, store dates as type d (default is n)
    * When writing XLSX/XLSM file, use native date (default uses date codes)
    * @default false
    */
  var cellDates: js.UndefOr[Boolean] = js.native
  
  /**
    * When reading a file, save style/theme info to the .s field
    * When writing a file, export style/theme info
    * @default false
    */
  var cellStyles: js.UndefOr[Boolean] = js.native
  
  /**
    * If defined and file is encrypted, use password
    * @default ''
    */
  var password: js.UndefOr[String] = js.native
  
  /**
    * Create cell objects for stub cells
    * @default false
    */
  var sheetStubs: js.UndefOr[Boolean] = js.native
}
object CommonOptions {
  
  @scala.inline
  def apply(): CommonOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonOptions]
  }
  
  @scala.inline
  implicit class CommonOptionsOps[Self <: CommonOptions] (val x: Self) extends AnyVal {
    
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
    def setWTF(value: Boolean): Self = this.set("WTF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWTF: Self = this.set("WTF", js.undefined)
    
    @scala.inline
    def setBookVBA(value: Boolean): Self = this.set("bookVBA", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookVBA: Self = this.set("bookVBA", js.undefined)
    
    @scala.inline
    def setCellDates(value: Boolean): Self = this.set("cellDates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellDates: Self = this.set("cellDates", js.undefined)
    
    @scala.inline
    def setCellStyles(value: Boolean): Self = this.set("cellStyles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellStyles: Self = this.set("cellStyles", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setSheetStubs(value: Boolean): Self = this.set("sheetStubs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetStubs: Self = this.set("sheetStubs", js.undefined)
  }
}
