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
  implicit class WritingOptionsOps[Self <: WritingOptions] (val x: Self) extends AnyVal {
    
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
    def setProps(value: Properties): Self = this.set("Props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("Props", js.undefined)
    
    @scala.inline
    def setBookSST(value: Boolean): Self = this.set("bookSST", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookSST: Self = this.set("bookSST", js.undefined)
    
    @scala.inline
    def setBookType(value: BookType): Self = this.set("bookType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBookType: Self = this.set("bookType", js.undefined)
    
    @scala.inline
    def setCompression(value: Boolean): Self = this.set("compression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompression: Self = this.set("compression", js.undefined)
    
    @scala.inline
    def setIgnoreEC(value: Boolean): Self = this.set("ignoreEC", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreEC: Self = this.set("ignoreEC", js.undefined)
    
    @scala.inline
    def setSheet(value: String): Self = this.set("sheet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheet: Self = this.set("sheet", js.undefined)
    
    @scala.inline
    def setType(value: base64 | binary | buffer | file | array | string): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
