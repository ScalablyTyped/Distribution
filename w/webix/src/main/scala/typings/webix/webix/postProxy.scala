package typings.webix.webix

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait postProxy extends StObject {
  
  @JSName("$proxy")
  var $proxy: Boolean
  
  def load(view: obj, params: obj): js.Promise[Any]
}
object postProxy {
  
  inline def apply($proxy: Boolean, load: (obj, obj) => js.Promise[Any]): postProxy = {
    val __obj = js.Dynamic.literal($proxy = $proxy.asInstanceOf[js.Any], load = js.Any.fromFunction2(load))
    __obj.asInstanceOf[postProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: postProxy] (val x: Self) extends AnyVal {
    
    inline def set$proxy(value: Boolean): Self = StObject.set(x, "$proxy", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: (obj, obj) => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction2(value))
  }
}
