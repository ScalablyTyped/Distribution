package typings.threeTdsLoader.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCache extends StObject {
  
  def add(key: String, file: Any): Unit
  
  def clear(): Unit
  
  /**
    * @default false
    */
  var enabled: Boolean
  
  /**
    * @default {}
    */
  var files: Any
  
  def get(key: String): Any
  
  def remove(key: String): Unit
}
object TypeofCache {
  
  inline def apply(
    add: (String, Any) => Unit,
    clear: () => Unit,
    enabled: Boolean,
    files: Any,
    get: String => Any,
    remove: String => Unit
  ): TypeofCache = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction2(add), clear = js.Any.fromFunction0(clear), enabled = enabled.asInstanceOf[js.Any], files = files.asInstanceOf[js.Any], get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[TypeofCache]
  }
  
  extension [Self <: TypeofCache](x: Self) {
    
    inline def setAdd(value: (String, Any) => Unit): Self = StObject.set(x, "add", js.Any.fromFunction2(value))
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Any): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setGet(value: String => Any): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    
    inline def setRemove(value: String => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
  }
}
