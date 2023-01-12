package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait binaryProxy extends StObject {
  
  @JSName("$proxy")
  var $proxy: Boolean
  
  def load(): js.Promise[Any]
}
object binaryProxy {
  
  inline def apply($proxy: Boolean, load: () => js.Promise[Any]): binaryProxy = {
    val __obj = js.Dynamic.literal($proxy = $proxy.asInstanceOf[js.Any], load = js.Any.fromFunction0(load))
    __obj.asInstanceOf[binaryProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: binaryProxy] (val x: Self) extends AnyVal {
    
    inline def set$proxy(value: Boolean): Self = StObject.set(x, "$proxy", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: () => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
  }
}
