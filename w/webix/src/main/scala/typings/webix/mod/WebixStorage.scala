package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WebixStorage extends StObject {
  
  def get(name: String): Any
  
  def put(name: String, value: Any): Unit
  
  def remove(name: String): Unit
}
object WebixStorage {
  
  inline def apply(get: String => Any, put: (String, Any) => Unit, remove: String => Unit): WebixStorage = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[WebixStorage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebixStorage] (val x: Self) extends AnyVal {
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setPut(value: (String, Any) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
