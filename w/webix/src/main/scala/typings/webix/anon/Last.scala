package typings.webix.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Last extends StObject {
  
  var last: String
  
  var next: String
  
  var prev: String
}
object Last {
  
  inline def apply(last: String, next: String, prev: String): Last = {
    val __obj = js.Dynamic.literal(last = last.asInstanceOf[js.Any], next = next.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[Last]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Last] (val x: Self) extends AnyVal {
    
    inline def setLast(value: String): Self = StObject.set(x, "last", value.asInstanceOf[js.Any])
    
    inline def setNext(value: String): Self = StObject.set(x, "next", value.asInstanceOf[js.Any])
    
    inline def setPrev(value: String): Self = StObject.set(x, "prev", value.asInstanceOf[js.Any])
  }
}
