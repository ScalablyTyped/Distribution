package typings.tabulatorTables.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuSeparator extends StObject {
  
  var separator: js.UndefOr[Boolean] = js.undefined
}
object MenuSeparator {
  
  inline def apply(): MenuSeparator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuSeparator]
  }
  
  extension [Self <: MenuSeparator](x: Self) {
    
    inline def setSeparator(value: Boolean): Self = StObject.set(x, "separator", value.asInstanceOf[js.Any])
    
    inline def setSeparatorUndefined: Self = StObject.set(x, "separator", js.undefined)
  }
}
