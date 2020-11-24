package typings.xlsx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColInfo extends js.Object {
  
  /** Excel's "Max Digit Width" unit, always integral */
  var MDW: js.UndefOr[Double] = js.native
  
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** width in "characters" */
  var wch: js.UndefOr[Double] = js.native
  
  /* --- column width --- */
  /** width in Excel's "Max Digit Width", width*256 is integral */
  var width: js.UndefOr[Double] = js.native
  
  /** width in screen pixels */
  var wpx: js.UndefOr[Double] = js.native
}
object ColInfo {
  
  @scala.inline
  def apply(): ColInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ColInfo]
  }
  
  @scala.inline
  implicit class ColInfoOps[Self <: ColInfo] (val x: Self) extends AnyVal {
    
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
    def setMDW(value: Double): Self = this.set("MDW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMDW: Self = this.set("MDW", js.undefined)
    
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
    
    @scala.inline
    def setWch(value: Double): Self = this.set("wch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWch: Self = this.set("wch", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
    
    @scala.inline
    def setWpx(value: Double): Self = this.set("wpx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWpx: Self = this.set("wpx", js.undefined)
  }
}
