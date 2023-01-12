package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait debugProxy extends StObject {
  
  @JSName("$proxy")
  var $proxy: Boolean
  
  def load(): Unit
  
  def save(view: obj, update: obj, dp: obj): Unit
}
object debugProxy {
  
  inline def apply($proxy: Boolean, load: () => Unit, save: (obj, obj, obj) => Unit): debugProxy = {
    val __obj = js.Dynamic.literal($proxy = $proxy.asInstanceOf[js.Any], load = js.Any.fromFunction0(load), save = js.Any.fromFunction3(save))
    __obj.asInstanceOf[debugProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: debugProxy] (val x: Self) extends AnyVal {
    
    inline def set$proxy(value: Boolean): Self = StObject.set(x, "$proxy", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: () => Unit): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setSave(value: (obj, obj, obj) => Unit): Self = StObject.set(x, "save", js.Any.fromFunction3(value))
  }
}
