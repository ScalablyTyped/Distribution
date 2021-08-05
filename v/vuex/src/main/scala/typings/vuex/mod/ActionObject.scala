package typings.vuex.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActionObject[S, R] extends StObject {
  
  def handler(injectee: ActionContext[S, R]): js.Any
  def handler(injectee: ActionContext[S, R], payload: js.Any): js.Any
  @JSName("handler")
  var handler_Original: ActionHandler[S, R]
  
  var root: js.UndefOr[Boolean] = js.undefined
}
object ActionObject {
  
  inline def apply[S, R](handler: ActionHandler[S, R]): ActionObject[S, R] = {
    val __obj = js.Dynamic.literal(handler = handler.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionObject[S, R]]
  }
  
  extension [Self <: ActionObject[?, ?], S, R](x: Self & (ActionObject[S, R])) {
    
    inline def setHandler(value: ActionHandler[S, R]): Self = StObject.set(x, "handler", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Boolean): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
