package typings.webpack.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintedElement extends StObject {
  
  var content: String
  
  var element: String
}
object PrintedElement {
  
  inline def apply(content: String, element: String): PrintedElement = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrintedElement]
  }
  
  extension [Self <: PrintedElement](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
  }
}
