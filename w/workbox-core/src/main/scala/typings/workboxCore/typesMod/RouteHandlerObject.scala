package typings.workboxCore.typesMod

import typings.std.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteHandlerObject extends StObject {
  
  def handle(options: RouteHandlerCallbackOptions): js.Promise[Response]
  @JSName("handle")
  var handle_Original: RouteHandlerCallback
}
object RouteHandlerObject {
  
  inline def apply(handle: /* options */ RouteHandlerCallbackOptions => js.Promise[Response]): RouteHandlerObject = {
    val __obj = js.Dynamic.literal(handle = js.Any.fromFunction1(handle))
    __obj.asInstanceOf[RouteHandlerObject]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteHandlerObject] (val x: Self) extends AnyVal {
    
    inline def setHandle(value: /* options */ RouteHandlerCallbackOptions => js.Promise[Response]): Self = StObject.set(x, "handle", js.Any.fromFunction1(value))
  }
}
