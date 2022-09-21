package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouterViewProps extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var route: js.UndefOr[RouteLocationNormalized] = js.undefined
}
object RouterViewProps {
  
  inline def apply(): RouterViewProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouterViewProps]
  }
  
  extension [Self <: RouterViewProps](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setRoute(value: RouteLocationNormalized): Self = StObject.set(x, "route", value.asInstanceOf[js.Any])
    
    inline def setRouteUndefined: Self = StObject.set(x, "route", js.undefined)
  }
}
