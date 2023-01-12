package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait restProxy extends StObject {
  
  @JSName("$proxy")
  var $proxy: Boolean
  
  def save(view: obj, update: obj): js.Promise[Any]
}
object restProxy {
  
  inline def apply($proxy: Boolean, save: (obj, obj) => js.Promise[Any]): restProxy = {
    val __obj = js.Dynamic.literal($proxy = $proxy.asInstanceOf[js.Any], save = js.Any.fromFunction2(save))
    __obj.asInstanceOf[restProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: restProxy] (val x: Self) extends AnyVal {
    
    inline def set$proxy(value: Boolean): Self = StObject.set(x, "$proxy", value.asInstanceOf[js.Any])
    
    inline def setSave(value: (obj, obj) => js.Promise[Any]): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
  }
}
