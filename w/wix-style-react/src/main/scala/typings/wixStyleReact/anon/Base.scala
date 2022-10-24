package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Base extends StObject {
  
  var base: Any
  
  var element: Any
}
object Base {
  
  inline def apply(base: Any, element: Any): Base = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[Base]
  }
  
  extension [Self <: Base](x: Self) {
    
    inline def setBase(value: Any): Self = StObject.set(x, "base", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
