package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowInfo extends StObject {
  
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[Boolean] = js.native
  
  /** height in points */
  var hpt: js.UndefOr[Double] = js.native
  
  /* --- row height --- */
  /** height in screen pixels */
  var hpx: js.UndefOr[Double] = js.native
  
  /** outline / group level */
  var level: js.UndefOr[Double] = js.native
}
object RowInfo {
  
  @scala.inline
  def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  
  @scala.inline
  implicit class RowInfoMutableBuilder[Self <: RowInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    @scala.inline
    def setHpt(value: Double): Self = StObject.set(x, "hpt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHptUndefined: Self = StObject.set(x, "hpt", js.undefined)
    
    @scala.inline
    def setHpx(value: Double): Self = StObject.set(x, "hpx", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHpxUndefined: Self = StObject.set(x, "hpx", js.undefined)
    
    @scala.inline
    def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
