package typings.universalRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouteMatch[R, C /* <: RouterContext */] extends js.Object {
  
  var baseUrl: String = js.native
  
  var params: RouteParams = js.native
  
  var path: String = js.native
  
  var route: Route[R, C] = js.native
}
object RouteMatch {
  
  @scala.inline
  def apply[R, C /* <: RouterContext */](baseUrl: String, params: RouteParams, path: String, route: Route[R, C]): RouteMatch[R, C] = {
    val __obj = js.Dynamic.literal(baseUrl = baseUrl.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteMatch[R, C]]
  }
  
  @scala.inline
  implicit class RouteMatchOps[Self <: RouteMatch[_, _], R, C /* <: RouterContext */] (val x: Self with (RouteMatch[R, C])) extends AnyVal {
    
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
    def setBaseUrl(value: String): Self = this.set("baseUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: RouteParams): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: Route[R, C]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}
