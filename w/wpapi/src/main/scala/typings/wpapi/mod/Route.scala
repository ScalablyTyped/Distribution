package typings.wpapi.mod

import typings.wpapi.anon.Self
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends js.Object {
  
  var _links: js.UndefOr[Self] = js.native
  
  var endpoints: js.Array[HTTPEndpoint] = js.native
  
  var methods: js.Array[HTTPMethod] = js.native
  
  var namespace: String = js.native
}
object Route {
  
  @scala.inline
  def apply(endpoints: js.Array[HTTPEndpoint], methods: js.Array[HTTPMethod], namespace: String): Route = {
    val __obj = js.Dynamic.literal(endpoints = endpoints.asInstanceOf[js.Any], methods = methods.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[Route]
  }
  
  @scala.inline
  implicit class RouteOps[Self <: Route] (val x: Self) extends AnyVal {
    
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
    def setEndpointsVarargs(value: HTTPEndpoint*): Self = this.set("endpoints", js.Array(value :_*))
    
    @scala.inline
    def setEndpoints(value: js.Array[HTTPEndpoint]): Self = this.set("endpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodsVarargs(value: HTTPMethod*): Self = this.set("methods", js.Array(value :_*))
    
    @scala.inline
    def setMethods(value: js.Array[HTTPMethod]): Self = this.set("methods", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNamespace(value: String): Self = this.set("namespace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_links(value: Self): Self = this.set("_links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete_links: Self = this.set("_links", js.undefined)
  }
}
