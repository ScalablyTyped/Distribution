package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterParams extends StObject {
  
  var matchAll: js.UndefOr[Boolean] = js.undefined
  
  var separator: js.UndefOr[String] = js.undefined
}
object FilterParams {
  
  inline def apply(): FilterParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterParams]
  }
  
  extension [Self <: FilterParams](x: Self) {
    
    inline def setMatchAll(value: Boolean): Self = StObject.set(x, "matchAll", value.asInstanceOf[js.Any])
    
    inline def setMatchAllUndefined: Self = StObject.set(x, "matchAll", js.undefined)
    
    inline def setSeparator(value: String): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
