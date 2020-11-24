package typings.xlsx.mod

import typings.xlsx.xlsxNumbers.`0`
import typings.xlsx.xlsxNumbers.`1`
import typings.xlsx.xlsxNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XLSXConsts extends js.Object {
  
  /** Visibility: Hidden */
  var SHEET_HIDDEN: `1` = js.native
  
  /** Visibility: Very Hidden */
  var SHEET_VERYHIDDEN: `2` = js.native
  
  /* --- Sheet Visibility --- */
  /** Visibility: Visible */
  var SHEET_VISIBLE: `0` = js.native
}
object XLSXConsts {
  
  @scala.inline
  def apply(SHEET_HIDDEN: `1`, SHEET_VERYHIDDEN: `2`, SHEET_VISIBLE: `0`): XLSXConsts = {
    val __obj = js.Dynamic.literal(SHEET_HIDDEN = SHEET_HIDDEN.asInstanceOf[js.Any], SHEET_VERYHIDDEN = SHEET_VERYHIDDEN.asInstanceOf[js.Any], SHEET_VISIBLE = SHEET_VISIBLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[XLSXConsts]
  }
  
  @scala.inline
  implicit class XLSXConstsOps[Self <: XLSXConsts] (val x: Self) extends AnyVal {
    
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
    def setSHEET_HIDDEN(value: `1`): Self = this.set("SHEET_HIDDEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEET_VERYHIDDEN(value: `2`): Self = this.set("SHEET_VERYHIDDEN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHEET_VISIBLE(value: `0`): Self = this.set("SHEET_VISIBLE", value.asInstanceOf[js.Any])
  }
}
