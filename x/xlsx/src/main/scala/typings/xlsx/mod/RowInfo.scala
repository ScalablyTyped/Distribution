package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowInfo extends StObject {
  
  /* --- visibility --- */
  /** if true, the column is hidden */
  var hidden: js.UndefOr[Boolean] = js.undefined
  
  /** height in points */
  var hpt: js.UndefOr[Double] = js.undefined
  
  /* --- row height --- */
  /** height in screen pixels */
  var hpx: js.UndefOr[Double] = js.undefined
  
  /** outline / group level */
  var level: js.UndefOr[Double] = js.undefined
}
object RowInfo {
  
  inline def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  
  extension [Self <: RowInfo](x: Self) {
    
    inline def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
    
    inline def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
    
    inline def setHpt(value: Double): Self = StObject.set(x, "hpt", value.asInstanceOf[js.Any])
    
    inline def setHptUndefined: Self = StObject.set(x, "hpt", js.undefined)
    
    inline def setHpx(value: Double): Self = StObject.set(x, "hpx", value.asInstanceOf[js.Any])
    
    inline def setHpxUndefined: Self = StObject.set(x, "hpx", js.undefined)
    
    inline def setLevel(value: Double): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    
    inline def setLevelUndefined: Self = StObject.set(x, "level", js.undefined)
  }
}
