package typings.tpdirect

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait elementObject extends StObject {
  
  var element: String
  
  var placeholder: String
}
object elementObject {
  
  inline def apply(element: String, placeholder: String): elementObject = {
    val __obj = js.Dynamic.literal(element = element.asInstanceOf[js.Any], placeholder = placeholder.asInstanceOf[js.Any])
    __obj.asInstanceOf[elementObject]
  }
  
  extension [Self <: elementObject](x: Self) {
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
  }
}
