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
  
  /** Field Separator ("Delimiter" override) */
  var FS: js.UndefOr[String] = js.undefined
  
  var PRN: js.UndefOr[Boolean] = js.undefined
  
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
  
  /** If true, preserve _xlfn. prefixes in formula function names */
  var xlfn: js.UndefOr[Boolean] = js.undefined
}
object ParsingOptions {
  
  inline def apply(): ParsingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParsingOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParsingOptions] (val x: Self) extends AnyVal {
    
    inline def setBookDeps(value: Boolean): Self = StObject.set(x, "bookDeps", value.asInstanceOf[js.Any])
    
    inline def setBookDepsUndefined: Self = StObject.set(x, "bookDeps", js.undefined)
    
    inline def setBookFiles(value: Boolean): Self = StObject.set(x, "bookFiles", value.asInstanceOf[js.Any])
    
    inline def setBookFilesUndefined: Self = StObject.set(x, "bookFiles", js.undefined)
    
    inline def setBookProps(value: Boolean): Self = StObject.set(x, "bookProps", value.asInstanceOf[js.Any])
    
    inline def setBookPropsUndefined: Self = StObject.set(x, "bookProps", js.undefined)
    
    inline def setBookSheets(value: Boolean): Self = StObject.set(x, "bookSheets", value.asInstanceOf[js.Any])
    
    inline def setBookSheetsUndefined: Self = StObject.set(x, "bookSheets", js.undefined)
    
    inline def setCellFormula(value: Boolean): Self = StObject.set(x, "cellFormula", value.asInstanceOf[js.Any])
    
    inline def setCellFormulaUndefined: Self = StObject.set(x, "cellFormula", js.undefined)
    
    inline def setCellHTML(value: Boolean): Self = StObject.set(x, "cellHTML", value.asInstanceOf[js.Any])
    
    inline def setCellHTMLUndefined: Self = StObject.set(x, "cellHTML", js.undefined)
    
    inline def setCellNF(value: Boolean): Self = StObject.set(x, "cellNF", value.asInstanceOf[js.Any])
    
    inline def setCellNFUndefined: Self = StObject.set(x, "cellNF", js.undefined)
    
    inline def setCellText(value: Boolean): Self = StObject.set(x, "cellText", value.asInstanceOf[js.Any])
    
    inline def setCellTextUndefined: Self = StObject.set(x, "cellText", js.undefined)
    
    inline def setCodepage(value: Double): Self = StObject.set(x, "codepage", value.asInstanceOf[js.Any])
    
    inline def setCodepageUndefined: Self = StObject.set(x, "codepage", js.undefined)
    
    inline def setDateNF(value: String): Self = StObject.set(x, "dateNF", value.asInstanceOf[js.Any])
    
    inline def setDateNFUndefined: Self = StObject.set(x, "dateNF", js.undefined)
    
    inline def setDense(value: Boolean): Self = StObject.set(x, "dense", value.asInstanceOf[js.Any])
    
    inline def setDenseUndefined: Self = StObject.set(x, "dense", js.undefined)
    
    inline def setFS(value: String): Self = StObject.set(x, "FS", value.asInstanceOf[js.Any])
    
    inline def setFSUndefined: Self = StObject.set(x, "FS", js.undefined)
    
    inline def setPRN(value: Boolean): Self = StObject.set(x, "PRN", value.asInstanceOf[js.Any])
    
    inline def setPRNUndefined: Self = StObject.set(x, "PRN", js.undefined)
    
    inline def setRaw(value: Boolean): Self = StObject.set(x, "raw", value.asInstanceOf[js.Any])
    
    inline def setRawUndefined: Self = StObject.set(x, "raw", js.undefined)
    
    inline def setSheetRows(value: Double): Self = StObject.set(x, "sheetRows", value.asInstanceOf[js.Any])
    
    inline def setSheetRowsUndefined: Self = StObject.set(x, "sheetRows", js.undefined)
    
    inline def setSheets(value: Double | String | (js.Array[Double | String])): Self = StObject.set(x, "sheets", value.asInstanceOf[js.Any])
    
    inline def setSheetsUndefined: Self = StObject.set(x, "sheets", js.undefined)
    
    inline def setSheetsVarargs(value: (Double | String)*): Self = StObject.set(x, "sheets", js.Array(value*))
    
    inline def setType(value: base64 | binary | buffer | file | array | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setXlfn(value: Boolean): Self = StObject.set(x, "xlfn", value.asInstanceOf[js.Any])
    
    inline def setXlfnUndefined: Self = StObject.set(x, "xlfn", js.undefined)
  }
}
