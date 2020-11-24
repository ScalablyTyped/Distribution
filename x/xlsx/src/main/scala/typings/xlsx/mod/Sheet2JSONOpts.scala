package typings.xlsx.mod

import typings.xlsx.xlsxStrings.A
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet2JSONOpts extends DateNFOption {
  
  /** Include or omit blank lines in the output */
  var blankrows: js.UndefOr[Boolean] = js.native
  
  /** Default value for null/undefined values */
  var defval: js.UndefOr[js.Any] = js.native
  
  /** Output format */
  var header: js.UndefOr[A | Double | js.Array[String]] = js.native
  
  /** Override worksheet range */
  var range: js.UndefOr[js.Any] = js.native
  
  /** if true, return raw data; if false, return formatted text */
  var raw: js.UndefOr[Boolean] = js.native
  
  /** if true, return raw numbers; if false, return formatted numbers */
  var rawNumbers: js.UndefOr[Boolean] = js.native
}
object Sheet2JSONOpts {
  
  @scala.inline
  def apply(): Sheet2JSONOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2JSONOpts]
  }
  
  @scala.inline
  implicit class Sheet2JSONOptsOps[Self <: Sheet2JSONOpts] (val x: Self) extends AnyVal {
    
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
    def setBlankrows(value: Boolean): Self = this.set("blankrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlankrows: Self = this.set("blankrows", js.undefined)
    
    @scala.inline
    def setDefval(value: js.Any): Self = this.set("defval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefval: Self = this.set("defval", js.undefined)
    
    @scala.inline
    def setHeaderVarargs(value: String*): Self = this.set("header", js.Array(value :_*))
    
    @scala.inline
    def setHeader(value: A | Double | js.Array[String]): Self = this.set("header", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    
    @scala.inline
    def setRange(value: js.Any): Self = this.set("range", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRange: Self = this.set("range", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setRawNumbers(value: Boolean): Self = this.set("rawNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawNumbers: Self = this.set("rawNumbers", js.undefined)
  }
}
