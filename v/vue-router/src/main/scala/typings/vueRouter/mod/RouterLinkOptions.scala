package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterLinkOptions extends StObject {
  
  /**
    * Calls `router.replace` instead of `router.push`.
    */
  var replace: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Route Location the link should navigate to when clicked on.
    */
  var to: RouteLocationRaw
}
object RouterLinkOptions {
  
  inline def apply(to: RouteLocationRaw): RouterLinkOptions = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterLinkOptions]
  }
  
  extension [Self <: RouterLinkOptions](x: Self) {
    
    inline def setReplace(value: Boolean): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    
    inline def setReplaceUndefined: Self = StObject.set(x, "replace", js.undefined)
    
    inline def setTo(value: RouteLocationRaw): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
