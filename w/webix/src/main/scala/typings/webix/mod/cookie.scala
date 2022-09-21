package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cookie extends StObject {
  
  def clear(): Unit
  
  def get(name: String): Any
  
  def put(name: String, value: Any): Unit
  
  def remove(name: String): Unit
}
object cookie {
  
  inline def apply(clear: () => Unit, get: String => Any, put: (String, Any) => Unit, remove: String => Unit): cookie = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[cookie]
  }
  
  extension [Self <: cookie](x: Self) {
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setPut(value: (String, Any) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
