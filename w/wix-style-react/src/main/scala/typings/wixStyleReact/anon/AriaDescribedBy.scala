package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AriaDescribedBy extends StObject {
  
  var ariaDescribedBy: Null
  
  var status: Null
}
object AriaDescribedBy {
  
  inline def apply(ariaDescribedBy: Null, status: Null): AriaDescribedBy = {
    val __obj = js.Dynamic.literal(ariaDescribedBy = ariaDescribedBy.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[AriaDescribedBy]
  }
  
  extension [Self <: AriaDescribedBy](x: Self) {
    
    inline def setAriaDescribedBy(value: Null): Self = StObject.set(x, "ariaDescribedBy", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Null): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
