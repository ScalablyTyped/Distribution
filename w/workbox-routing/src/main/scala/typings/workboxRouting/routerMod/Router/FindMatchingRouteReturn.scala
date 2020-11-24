package typings.workboxRouting.routerMod.Router

import typings.workboxRouting.routeMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindMatchingRouteReturn[MatchReturn] extends js.Object {
  
  var params: js.Any = js.native
  
   // Exclude<MatchReturn, Falsy> | undefined; <-- TypeScript 2.8
  var route: Route[MatchReturn] = js.native
}
object FindMatchingRouteReturn {
  
  @scala.inline
  def apply[MatchReturn](params: js.Any, route: Route[MatchReturn]): FindMatchingRouteReturn[MatchReturn] = {
    val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], route = route.asInstanceOf[js.Any])
    __obj.asInstanceOf[FindMatchingRouteReturn[MatchReturn]]
  }
  
  @scala.inline
  implicit class FindMatchingRouteReturnOps[Self <: FindMatchingRouteReturn[_], MatchReturn] (val x: Self with FindMatchingRouteReturn[MatchReturn]) extends AnyVal {
    
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
    def setParams(value: js.Any): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoute(value: Route[MatchReturn]): Self = this.set("route", value.asInstanceOf[js.Any])
  }
}
