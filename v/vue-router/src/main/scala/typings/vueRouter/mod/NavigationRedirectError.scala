package typings.vueRouter.mod

import typings.vueRouter.vueRouterNumbers.`2`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Omit<vue-router.vue-router.NavigationFailure, 'to' | 'type'> */
trait NavigationRedirectError extends StObject {
  
  var cause: js.UndefOr[Any] = js.undefined
  
  var from: RouteLocationNormalized
  
  var message: String
  
  var name: String
  
  var stack: js.UndefOr[String] = js.undefined
  
  var to: RouteLocationRaw
  
  var `type`: `2`
}
object NavigationRedirectError {
  
  inline def apply(from: RouteLocationNormalized, message: String, name: String, to: RouteLocationRaw): NavigationRedirectError = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(2)
    __obj.asInstanceOf[NavigationRedirectError]
  }
  
  extension [Self <: NavigationRedirectError](x: Self) {
    
    inline def setCause(value: Any): Self = StObject.set(x, "cause", value.asInstanceOf[js.Any])
    
    inline def setCauseUndefined: Self = StObject.set(x, "cause", js.undefined)
    
    inline def setFrom(value: RouteLocationNormalized): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
    
    inline def setStackUndefined: Self = StObject.set(x, "stack", js.undefined)
    
    inline def setTo(value: RouteLocationRaw): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setType(value: `2`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
