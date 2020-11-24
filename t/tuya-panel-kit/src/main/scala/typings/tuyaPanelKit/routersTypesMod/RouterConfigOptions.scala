package typings.tuyaPanelKit.routersTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RouterConfigOptions extends js.Object {
  
  var routeNames: js.Array[String] = js.native
  
  var routeParamList: ParamListBase = js.native
}
object RouterConfigOptions {
  
  @scala.inline
  def apply(routeNames: js.Array[String], routeParamList: ParamListBase): RouterConfigOptions = {
    val __obj = js.Dynamic.literal(routeNames = routeNames.asInstanceOf[js.Any], routeParamList = routeParamList.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouterConfigOptions]
  }
  
  @scala.inline
  implicit class RouterConfigOptionsOps[Self <: RouterConfigOptions] (val x: Self) extends AnyVal {
    
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
    def setRouteNamesVarargs(value: String*): Self = this.set("routeNames", js.Array(value :_*))
    
    @scala.inline
    def setRouteNames(value: js.Array[String]): Self = this.set("routeNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRouteParamList(value: ParamListBase): Self = this.set("routeParamList", value.asInstanceOf[js.Any])
  }
}
