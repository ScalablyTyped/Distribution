package typings.typescript.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextChangeRange extends StObject {
  
  var newLength: Double
  
  var span: TextSpan
}
object TextChangeRange {
  
  inline def apply(newLength: Double, span: TextSpan): TextChangeRange = {
    val __obj = js.Dynamic.literal(newLength = newLength.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextChangeRange]
  }
  
  extension [Self <: TextChangeRange](x: Self) {
    
    inline def setNewLength(value: Double): Self = StObject.set(x, "newLength", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: TextSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}
