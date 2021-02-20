package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ColInfo extends StObject {
  
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
  implicit class ColInfoMutableBuilder[Self <: ColInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setMDW(value: Double): Self = StObject.set(x, "MDW", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMDWUndefined: Self = StObject.set(x, "MDW", js.undefined)
    
    @scala.inline
    def setWch(value: Double): Self = StObject.set(x, "wch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWchUndefined: Self = StObject.set(x, "wch", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    
    @scala.inline
    def setWpx(value: Double): Self = StObject.set(x, "wpx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWpxUndefined: Self = StObject.set(x, "wpx", js.undefined)
  }
}
