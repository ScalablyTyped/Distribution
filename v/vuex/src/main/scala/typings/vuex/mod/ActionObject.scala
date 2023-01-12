package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionObject[S, R] extends StObject {
  
  def handler(injectee: ActionContext[S, R]): Any
  def handler(injectee: ActionContext[S, R], payload: Any): Any
  @JSName("handler")
  var handler_Original: ActionHandler[S, R]
  
  var root: js.UndefOr[Boolean] = js.undefined
}
object ActionObject {
  
  inline def apply[S, R](handler: ActionHandler[S, R]): ActionObject[S, R] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionObject[S, R]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActionObject[?, ?], S, R] (val x: Self & (ActionObject[S, R])) extends AnyVal {
    
    inline def setHandler(value: ActionHandler[S, R]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
