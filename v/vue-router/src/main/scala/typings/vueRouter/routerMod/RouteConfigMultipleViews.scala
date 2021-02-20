package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteConfigMultipleViews
  extends RouteConfigBase
     with RouteConfig {
  
  var components: js.UndefOr[Dictionary[Component]] = js.native
  
  var props: js.UndefOr[Dictionary[Boolean | js.Object | RoutePropsFunction]] = js.native
}
object RouteConfigMultipleViews {
  
  @scala.inline
  def apply(path: String): RouteConfigMultipleViews = {
    val __obj = js.Dynamic.literal(path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteConfigMultipleViews]
  }
  
  @scala.inline
  implicit class RouteConfigMultipleViewsMutableBuilder[Self <: RouteConfigMultipleViews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setComponents(value: Dictionary[Component]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    @scala.inline
    def setProps(value: Dictionary[Boolean | js.Object | RoutePropsFunction]): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropsUndefined: Self = StObject.set(x, "props", js.undefined)
  }
}
