package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cookie extends StObject {
  
  def clear(): Unit
  
  def get(name: String): js.Any
  
  def put(name: String, value: js.Any): Unit
  
  def remove(name: String): Unit
}
object cookie {
  
  @scala.inline
  def apply(clear: () => Unit, get: String => js.Any, put: (String, js.Any) => Unit, remove: String => Unit): cookie = {
    val __obj = js.Dynamic.literal(clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[cookie]
  }
  
  @scala.inline
  implicit class cookieMutableBuilder[Self <: cookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGet(value: String => js.Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPut(value: (String, js.Any) => Unit): Self = StObject.set(x, "put", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
