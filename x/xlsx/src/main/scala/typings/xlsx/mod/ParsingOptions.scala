package typings.xlsx.mod

import typings.xlsx.xlsxStrings.array
import typings.xlsx.xlsxStrings.base64
import typings.xlsx.xlsxStrings.binary
import typings.xlsx.xlsxStrings.buffer
import typings.xlsx.xlsxStrings.file
import typings.xlsx.xlsxStrings.string
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ParsingOptions extends CommonOptions {
  
  /**
    * If true, parse calculation chains
    * @default false
    */
  var bookDeps: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, add raw files to book object
    * @default false
    */
  var bookFiles: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, only parse enough to get book metadata
    * @default false
    */
  var bookProps: js.UndefOr[Boolean] = js.native
  
  /**
    * If true, only parse enough to get the sheet names
    * @default false
    */
  var bookSheets: js.UndefOr[Boolean] = js.native
  
  /**
    * Save formulae to the .f field
    * @default true
    */
  var cellFormula: js.UndefOr[Boolean] = js.native
  
  /**
    * Parse rich text and save HTML to the .h field
    * @default true
    */
  var cellHTML: js.UndefOr[Boolean] = js.native
  
  /**
    * Save number format string to the .z field
    * @default false
    */
  var cellNF: js.UndefOr[Boolean] = js.native
  
  /**
    * Generate formatted text to the .w field
    * @default true
    */
  var cellText: js.UndefOr[Boolean] = js.native
  
  /** Default codepage */
  var codepage: js.UndefOr[Double] = js.native
  
  /** Override default date format (code 14) */
  var dateNF: js.UndefOr[String] = js.native
  
  var dense: js.UndefOr[Boolean] = js.native
  
  /** If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.native
  
  /** If specified, only parse the specified sheets or sheet names */
  var sheets: js.UndefOr[Double | String | (js.Array[Double | String])] = js.native
  
  /** Input data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array | string] = js.native
}
object ParsingOptions {
  
  @scala.inline
  def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  
  @scala.inline
  implicit class ParsingOptionsOps[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    
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
    def setBookDeps(value: Boolean): Self = this.set("bookDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookDeps: Self = this.set("bookDeps", js.undefined)
    
    @scala.inline
    def setBookFiles(value: Boolean): Self = this.set("bookFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookFiles: Self = this.set("bookFiles", js.undefined)
    
    @scala.inline
    def setBookProps(value: Boolean): Self = this.set("bookProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookProps: Self = this.set("bookProps", js.undefined)
    
    @scala.inline
    def setBookSheets(value: Boolean): Self = this.set("bookSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookSheets: Self = this.set("bookSheets", js.undefined)
    
    @scala.inline
    def setCellFormula(value: Boolean): Self = this.set("cellFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellFormula: Self = this.set("cellFormula", js.undefined)
    
    @scala.inline
    def setCellHTML(value: Boolean): Self = this.set("cellHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellHTML: Self = this.set("cellHTML", js.undefined)
    
    @scala.inline
    def setCellNF(value: Boolean): Self = this.set("cellNF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellNF: Self = this.set("cellNF", js.undefined)
    
    @scala.inline
    def setCellText(value: Boolean): Self = this.set("cellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellText: Self = this.set("cellText", js.undefined)
    
    @scala.inline
    def setCodepage(value: Double): Self = this.set("codepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodepage: Self = this.set("codepage", js.undefined)
    
    @scala.inline
    def setDateNF(value: String): Self = this.set("dateNF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDateNF: Self = this.set("dateNF", js.undefined)
    
    @scala.inline
    def setDense(value: Boolean): Self = this.set("dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDense: Self = this.set("dense", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSheetRows(value: Double): Self = this.set("sheetRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetRows: Self = this.set("sheetRows", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: (Double | String)*): Self = this.set("sheets", js.Array(value :_*))
    
    @scala.inline
    def setSheets(value: Double | String | (js.Array[Double | String])): Self = this.set("sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheets: Self = this.set("sheets", js.undefined)
    
    @scala.inline
    def setType(value: base64 | binary | buffer | file | array | string): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
