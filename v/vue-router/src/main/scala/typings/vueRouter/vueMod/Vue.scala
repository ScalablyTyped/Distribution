package typings.vueRouter.vueMod

import typings.vueRouter.mod.default
import typings.vueRouter.routerMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Vue extends js.Object {
  
  @JSName("$route")
  var $route: Route = js.native
  
  @JSName("$router")
  var $router: default = js.native
}
object Vue {
  
  @scala.inline
  def apply($route: Route, $router: default): Vue = {
    val __obj = js.Dynamic.literal($route = $route.asInstanceOf[js.Any], $router = $router.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vue]
  }
  
  @scala.inline
  implicit class VueOps[Self <: Vue] (val x: Self) extends AnyVal {
    
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
    def set$route(value: Route): Self = this.set("$route", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set$router(value: default): Self = this.set("$router", value.asInstanceOf[js.Any])
  }
}
