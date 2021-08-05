package typings.uiGrid.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IBuildColumnsOptions extends StObject {
  
  var orderByColumnDefs: js.UndefOr[Boolean] = js.undefined
}
object IBuildColumnsOptions {
  
  inline def apply(): IBuildColumnsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBuildColumnsOptions]
  }
  
  extension [Self <: IBuildColumnsOptions](x: Self) {
    
    inline def setOrderByColumnDefs(value: Boolean): Self = StObject.set(x, "orderByColumnDefs", value.asInstanceOf[js.Any])
    
    inline def setOrderByColumnDefsUndefined: Self = StObject.set(x, "orderByColumnDefs", js.undefined)
  }
}
