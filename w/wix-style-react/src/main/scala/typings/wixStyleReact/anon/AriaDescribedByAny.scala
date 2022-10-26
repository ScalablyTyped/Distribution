package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaDescribedByAny extends StObject {
  
  var ariaDescribedBy: Any
}
object AriaDescribedByAny {
  
  inline def apply(ariaDescribedBy: Any): AriaDescribedByAny = {
    val __obj = js.Dynamic.literal(ariaDescribedBy = ariaDescribedBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaDescribedByAny]
  }
  
  extension [Self <: AriaDescribedByAny](x: Self) {
    
    inline def setAriaDescribedBy(value: Any): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
  }
}
