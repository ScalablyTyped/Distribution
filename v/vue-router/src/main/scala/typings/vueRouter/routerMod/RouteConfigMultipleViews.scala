package typings.vueRouter.routerMod

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
  implicit class RouteConfigMultipleViewsOps[Self <: RouteConfigMultipleViews] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setComponents(value: Dictionary[Component]): Self = this.set("components", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComponents: Self = this.set("components", js.undefined)
    
    @scala.inline
    def setProps(value: Dictionary[Boolean | js.Object | RoutePropsFunction]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
