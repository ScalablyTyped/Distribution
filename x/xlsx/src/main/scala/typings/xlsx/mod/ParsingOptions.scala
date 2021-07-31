package typings.xlsx.mod

import typings.xlsx.xlsxStrings.array
import typings.xlsx.xlsxStrings.base64
import typings.xlsx.xlsxStrings.binary
import typings.xlsx.xlsxStrings.buffer
import typings.xlsx.xlsxStrings.file
import typings.xlsx.xlsxStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParsingOptions
  extends StObject
     with CommonOptions {
  
  /**
    * If true, parse calculation chains
    * @default false
    */
  var bookDeps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, add raw files to book object
    * @default false
    */
  var bookFiles: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, only parse enough to get book metadata
    * @default false
    */
  var bookProps: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If true, only parse enough to get the sheet names
    * @default false
    */
  var bookSheets: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Save formulae to the .f field
    * @default true
    */
  var cellFormula: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Parse rich text and save HTML to the .h field
    * @default true
    */
  var cellHTML: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Save number format string to the .z field
    * @default false
    */
  var cellNF: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Generate formatted text to the .w field
    * @default true
    */
  var cellText: js.UndefOr[Boolean] = js.undefined
  
  /** Default codepage */
  var codepage: js.UndefOr[Double] = js.undefined
  
  /** Override default date format (code 14) */
  var dateNF: js.UndefOr[String] = js.undefined
  
  var dense: js.UndefOr[Boolean] = js.undefined
  
  /** If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.undefined
  
  /** If specified, only parse the specified sheets or sheet names */
  var sheets: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  
  /** Input data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array | string] = js.undefined
}
object ParsingOptions {
  
  @scala.inline
  def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  
  @scala.inline
  implicit class ParsingOptionsMutableBuilder[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookDeps(value: Boolean): Self = StObject.set(x, "bookDeps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookDepsUndefined: Self = StObject.set(x, "bookDeps", js.undefined)
    
    @scala.inline
    def setBookFiles(value: Boolean): Self = StObject.set(x, "bookFiles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookFilesUndefined: Self = StObject.set(x, "bookFiles", js.undefined)
    
    @scala.inline
    def setBookProps(value: Boolean): Self = StObject.set(x, "bookProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookPropsUndefined: Self = StObject.set(x, "bookProps", js.undefined)
    
    @scala.inline
    def setBookSheets(value: Boolean): Self = StObject.set(x, "bookSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookSheetsUndefined: Self = StObject.set(x, "bookSheets", js.undefined)
    
    @scala.inline
    def setCellFormula(value: Boolean): Self = StObject.set(x, "cellFormula", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellFormulaUndefined: Self = StObject.set(x, "cellFormula", js.undefined)
    
    @scala.inline
    def setCellHTML(value: Boolean): Self = StObject.set(x, "cellHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellHTMLUndefined: Self = StObject.set(x, "cellHTML", js.undefined)
    
    @scala.inline
    def setCellNF(value: Boolean): Self = StObject.set(x, "cellNF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellNFUndefined: Self = StObject.set(x, "cellNF", js.undefined)
    
    @scala.inline
    def setCellText(value: Boolean): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellTextUndefined: Self = StObject.set(x, "cellText", js.undefined)
    
    @scala.inline
    def setCodepage(value: Double): Self = StObject.set(x, "codepage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodepageUndefined: Self = StObject.set(x, "codepage", js.undefined)
    
    @scala.inline
    def setDateNF(value: String): Self = StObject.set(x, "dateNF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDateNFUndefined: Self = StObject.set(x, "dateNF", js.undefined)
    
    @scala.inline
    def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    @scala.inline
    def setSheetRows(value: Double): Self = StObject.set(x, "sheetRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetRowsUndefined: Self = StObject.set(x, "sheetRows", js.undefined)
    
    @scala.inline
    def setSheets(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    @scala.inline
    def setSheetsVarargs(value: (Double | String)*): Self = StObject.set(x, "sheets", js.Array(value :_*))
    
    @scala.inline
    def setType(value: base64 | binary | buffer | file | array | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
