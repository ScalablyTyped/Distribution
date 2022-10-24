package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementAny extends StObject {
  
  var element: Any
}
object ElementAny {
  
  inline def apply(element: Any): ElementAny = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementAny]
  }
  
  extension [Self <: ElementAny](x: Self) {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
