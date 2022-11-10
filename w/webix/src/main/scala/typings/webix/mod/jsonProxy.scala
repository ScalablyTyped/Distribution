package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait jsonProxy extends StObject {
  
  @JSName("$proxy")
  var $proxy: Boolean
  
  def load(): js.Promise[Any]
  
  def save(view: obj, update: obj): js.Promise[Any]
}
object jsonProxy {
  
  inline def apply($proxy: Boolean, load: () => js.Promise[Any], save: (obj, obj) => js.Promise[Any]): jsonProxy = {
    val __obj = js.Dynamic.literal($proxy = $proxy.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), save = js.Any.fromFunction2(save))
    __obj.asInstanceOf[jsonProxy]
  }
  
  extension [Self <: jsonProxy](x: Self) {
    
    inline def set$proxy(value: Boolean): Self = StObject.set(x, "$proxy", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: () => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setSave(value: (obj, obj) => js.Promise[Any]): Self = StObject.set(x, "save", js.Any.fromFunction2(value))
  }
}
