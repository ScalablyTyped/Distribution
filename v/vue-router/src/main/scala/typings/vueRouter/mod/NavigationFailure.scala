package typings.vueRouter.mod

import typings.std.Error
import typings.vueRouter.vueRouterInts.`16`
import typings.vueRouter.vueRouterInts.`4`
import typings.vueRouter.vueRouterInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NavigationFailure
  extends StObject
     with Error {
  
  /**
    * Route location we were navigating from
    */
  var from: RouteLocationNormalized
  
  /**
    * Route location we were navigating to
    */
  var to: RouteLocationNormalized
  
  /**
    * Type of the navigation. One of {@link NavigationFailureType}
    */
  var `type`: `8` | `4` | `16`
}
object NavigationFailure {
  
  inline def apply(
    from: RouteLocationNormalized,
    message: String,
    name: String,
    to: RouteLocationNormalized,
    `type`: `8` | `4` | `16`
  ): NavigationFailure = {
    val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NavigationFailure]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NavigationFailure] (val x: Self) extends AnyVal {
    
    inline def setFrom(value: RouteLocationNormalized): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
    
    inline def setTo(value: RouteLocationNormalized): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    
    inline def setType(value: `8` | `4` | `16`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
