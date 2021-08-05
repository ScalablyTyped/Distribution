package typings.xlsx.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WBView extends StObject {
  
  /** Right-to-left mode */
  var RTL: js.UndefOr[Boolean] = js.undefined
}
object WBView {
  
  inline def apply(): WBView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WBView]
  }
  
  extension [Self <: WBView](x: Self) {
    
    inline def setRTL(value: Boolean): Self = StObject.set(x, "RTL", value.asInstanceOf[js.Any])
    
    inline def setRTLUndefined: Self = StObject.set(x, "RTL", js.undefined)
  }
}
