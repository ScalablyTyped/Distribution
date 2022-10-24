package typings.wixStyleReact.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait First extends StObject {
  
  var first: Any
  
  var last: Any
}
object First {
  
  inline def apply(first: Any, last: Any): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
  
  extension [Self <: First](x: Self) {
    
    inline def setFirst(value: Any): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setLast(value: Any): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
  }
}
