package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait First extends StObject {
  
  var first: String
  
  var last: String
  
  var next: String
  
  var prev: String
}
object First {
  
  inline def apply(first: String, last: String, next: String, prev: String): First = {
    val __obj = js.Dynamic.literal(first = first.asInstanceOf[js.Any], last = last.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[First]
  }
  
  extension [Self <: First](x: Self) {
    
    inline def setFirst(value: String): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
  }
}
