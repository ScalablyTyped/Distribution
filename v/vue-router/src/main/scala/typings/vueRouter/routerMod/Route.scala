package typings.vueRouter.routerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends js.Object {
  
  var fullPath: String = js.native
  
  var hash: String = js.native
  
  var matched: js.Array[RouteRecord] = js.native
  
  var meta: js.UndefOr[js.Any] = js.native
  
  var name: js.UndefOr[String | Null] = js.native
  
  var params: Dictionary[String] = js.native
  
  var path: String = js.native
  
  var query: Dictionary[String | (js.Array[String | Null])] = js.native
  
  var redirectedFrom: js.UndefOr[String] = js.native
}
object Route {
  
  @scala.inline
  def apply(
    fullPath: String,
    hash: String,
    matched: js.Array[RouteRecord],
    params: Dictionary[String],
    path: String,
    query: Dictionary[String | (js.Array[String | Null])]
  ): Route = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
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
    def setFullPath(value: String): Self = this.set("fullPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = this.set("hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedVarargs(value: RouteRecord*): Self = this.set("matched", js.Array(value :_*))
    
    @scala.inline
    def setMatched(value: js.Array[RouteRecord]): Self = this.set("matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: Dictionary[String]): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Dictionary[String | (js.Array[String | Null])]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMeta: Self = this.set("meta", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setNameNull: Self = this.set("name", null)
    
    @scala.inline
    def setRedirectedFrom(value: String): Self = this.set("redirectedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectedFrom: Self = this.set("redirectedFrom", js.undefined)
  }
}
