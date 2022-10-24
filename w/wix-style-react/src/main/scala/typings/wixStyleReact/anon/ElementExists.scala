package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElementExists extends StObject {
  
  var element: Any
  
  var exists: Any
}
object ElementExists {
  
  inline def apply(element: Any, exists: Any): ElementExists = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], exists = exists.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElementExists]
  }
  
  extension [Self <: ElementExists](x: Self) {
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setExists(value: Any): Self = StObject.set(x, "exists", value.asInstanceOf[js.Any])
  }
}
