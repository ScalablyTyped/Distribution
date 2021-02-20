package typings.vueRouter.routerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Route extends StObject {
  
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
  implicit class RouteMutableBuilder[Self <: Route] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatched(value: js.Array[RouteRecord]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMatchedVarargs(value: RouteRecord*): Self = StObject.set(x, "matched", js.Array(value :_*))
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaUndefined: Self = StObject.set(x, "meta", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setParams(value: Dictionary[String]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQuery(value: Dictionary[String | (js.Array[String | Null])]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectedFrom(value: String): Self = StObject.set(x, "redirectedFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRedirectedFromUndefined: Self = StObject.set(x, "redirectedFrom", js.undefined)
  }
}
