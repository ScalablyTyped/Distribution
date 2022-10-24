package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Month extends StObject {
  
  var month: Any
}
object Month {
  
  inline def apply(month: Any): Month = {
    val __obj = js.Dynamic.literal(month = month.asInstanceOf[js.Any])
    __obj.asInstanceOf[Month]
  }
  
  extension [Self <: Month](x: Self) {
    
    inline def setMonth(value: Any): Self = StObject.set(x, "month", value.asInstanceOf[js.Any])
  }
}
