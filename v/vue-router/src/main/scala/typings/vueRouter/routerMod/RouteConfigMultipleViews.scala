package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteConfigMultipleViews
  extends StObject
     with RouteConfigBase
     with RouteConfig {
  
  var components: js.UndefOr[Dictionary[Component]] = js.undefined
  
  var props: js.UndefOr[Dictionary[Boolean | js.Object | RoutePropsFunction]] = js.undefined
}
object RouteConfigMultipleViews {
  
  inline def apply(path: String): RouteConfigMultipleViews = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigMultipleViews]
  }
  
  extension [Self <: RouteConfigMultipleViews](x: Self) {
    
    inline def setComponents(value: Dictionary[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setProps(value: Dictionary[Boolean | js.Object | RoutePropsFunction]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    inline def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
