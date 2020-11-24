package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Table2SheetOpts
  extends CommonOptions
     with DateNFOption {
  
  /** If true, hidden rows and cells will not be parsed */
  var display: js.UndefOr[Boolean] = js.native
  
  /** If true, plaintext parsing will not parse values */
  var raw: js.UndefOr[Boolean] = js.native
  
  /**
    * If >0, read the first sheetRows rows
    * @default 0
    */
  var sheetRows: js.UndefOr[Double] = js.native
}
object Table2SheetOpts {
  
  @scala.inline
  def apply(): Table2SheetOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Table2SheetOpts]
  }
  
  @scala.inline
  implicit class Table2SheetOptsOps[Self <: Table2SheetOpts] (val x: Self) extends AnyVal {
    
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
    def setDisplay(value: Boolean): Self = this.set("display", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplay: Self = this.set("display", js.undefined)
    
    @scala.inline
    def setRaw(value: Boolean): Self = this.set("raw", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRaw: Self = this.set("raw", js.undefined)
    
    @scala.inline
    def setSheetRows(value: Double): Self = this.set("sheetRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSheetRows: Self = this.set("sheetRows", js.undefined)
  }
}
