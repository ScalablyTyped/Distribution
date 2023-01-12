package typings.webix.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphQLProxy extends StObject {
  
  @JSName("$proxy")
  var $proxy: Boolean
  
  def load(view: obj): js.Promise[Any]
  
  def save(data: Any): js.Promise[Any]
  
  var url: js.UndefOr[String] = js.undefined
}
object GraphQLProxy {
  
  inline def apply($proxy: Boolean, load: obj => js.Promise[Any], save: Any => js.Promise[Any]): GraphQLProxy = {
    val __obj = js.Dynamic.literal($proxy = $proxy.asInstanceOf[js.Any], load = js.Any.fromFunction1(load), save = js.Any.fromFunction1(save))
    __obj.asInstanceOf[GraphQLProxy]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphQLProxy] (val x: Self) extends AnyVal {
    
    inline def set$proxy(value: Boolean): Self = StObject.set(x, "$proxy", value.asInstanceOf[js.Any])
    
    inline def setLoad(value: obj => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    
    inline def setSave(value: Any => js.Promise[Any]): Self = StObject.set(x, "save", js.Any.fromFunction1(value))
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
