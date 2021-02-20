package typings.xlsx.mod

import typings.xlsx.xlsxStrings.array
import typings.xlsx.xlsxStrings.base64
import typings.xlsx.xlsxStrings.binary
import typings.xlsx.xlsxStrings.buffer
import typings.xlsx.xlsxStrings.file
import typings.xlsx.xlsxStrings.string
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WritingOptions extends CommonOptions {
  
  /** Override workbook properties on save */
  var Props: js.UndefOr[Properties] = js.native
  
  /**
    * Generate Shared String Table
    * @default false
    */
  var bookSST: js.UndefOr[Boolean] = js.native
  
  /**
    * File format of generated workbook
    * @default 'xlsx'
    */
  var bookType: js.UndefOr[BookType] = js.native
  
  /**
    * Use ZIP compression for ZIP-based formats
    * @default false
    */
  var compression: js.UndefOr[Boolean] = js.native
  
  /**
    * Suppress "number stored as text" errors in generated files
    * @default true
    */
  var ignoreEC: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of Worksheet (for single-sheet formats)
    * @default ''
    */
  var sheet: js.UndefOr[String] = js.native
  
  /** Output data encoding */
  var `type`: js.UndefOr[base64 | binary | buffer | file | array | string] = js.native
}
object WritingOptions {
  
  @scala.inline
  def apply(): WritingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WritingOptions]
  }
  
  @scala.inline
  implicit class WritingOptionsMutableBuilder[Self <: WritingOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBookSST(value: Boolean): Self = StObject.set(x, "bookSST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookSSTUndefined: Self = StObject.set(x, "bookSST", js.undefined)
    
    @scala.inline
    def setBookType(value: BookType): Self = StObject.set(x, "bookType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBookTypeUndefined: Self = StObject.set(x, "bookType", js.undefined)
    
    @scala.inline
    def setCompression(value: Boolean): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
    
    @scala.inline
    def setIgnoreEC(value: Boolean): Self = StObject.set(x, "ignoreEC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIgnoreECUndefined: Self = StObject.set(x, "ignoreEC", js.undefined)
    
    @scala.inline
    def setProps(value: Properties): Self = StObject.set(x, "Props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "Props", js.undefined)
    
    @scala.inline
    def setSheet(value: String): Self = StObject.set(x, "sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSheetUndefined: Self = StObject.set(x, "sheet", js.undefined)
    
    @scala.inline
    def setType(value: base64 | binary | buffer | file | array | string): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
