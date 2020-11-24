package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sheet2CSVOpts extends DateNFOption {
  
  /** Field Separator ("delimiter") */
  var FS: js.UndefOr[String] = js.native
  
  /** Record Separator ("row separator") */
  var RS: js.UndefOr[String] = js.native
  
  /** Include blank lines in the CSV output */
  var blankrows: js.UndefOr[Boolean] = js.native
  
  /** Force quotes around fields */
  var forceQuotes: js.UndefOr[Boolean] = js.native
  
  /** if true, return raw numbers; if false, return formatted numbers */
  var rawNumbers: js.UndefOr[Boolean] = js.native
  
  /** Skip hidden rows and columns in the CSV output */
  var skipHidden: js.UndefOr[Boolean] = js.native
  
  /** Remove trailing field separators in each record */
  var strip: js.UndefOr[Boolean] = js.native
}
object Sheet2CSVOpts {
  
  @scala.inline
  def apply(): Sheet2CSVOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sheet2CSVOpts]
  }
  
  @scala.inline
  implicit class Sheet2CSVOptsOps[Self <: Sheet2CSVOpts] (val x: Self) extends AnyVal {
    
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
    def setFS(value: String): Self = this.set("FS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFS: Self = this.set("FS", js.undefined)
    
    @scala.inline
    def setRS(value: String): Self = this.set("RS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRS: Self = this.set("RS", js.undefined)
    
    @scala.inline
    def setBlankrows(value: Boolean): Self = this.set("blankrows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBlankrows: Self = this.set("blankrows", js.undefined)
    
    @scala.inline
    def setForceQuotes(value: Boolean): Self = this.set("forceQuotes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteForceQuotes: Self = this.set("forceQuotes", js.undefined)
    
    @scala.inline
    def setRawNumbers(value: Boolean): Self = this.set("rawNumbers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRawNumbers: Self = this.set("rawNumbers", js.undefined)
    
    @scala.inline
    def setSkipHidden(value: Boolean): Self = this.set("skipHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkipHidden: Self = this.set("skipHidden", js.undefined)
    
    @scala.inline
    def setStrip(value: Boolean): Self = this.set("strip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrip: Self = this.set("strip", js.undefined)
  }
}
