package typings.vueRouter.anon

import typings.vueRouter.mod.LocationQuery
import typings.vueRouter.mod.RouteLocation
import typings.vueRouter.mod.RouteMeta
import typings.vueRouter.mod.RouteParams
import typings.vueRouter.mod.RouteRecord
import typings.vueRouter.mod.RouteRecordName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined vue-router.vue-router.RouteLocation & {  href :string} */
trait RouteLocationhrefstring extends StObject {
  
  /**
    * The whole location including the `search` and `hash`. This string is
    * percentage encoded.
    */
  var fullPath: String
  
  /**
    * Hash of the current location. If present, starts with a `#`.
    */
  var hash: String
  
  var href: String
  
  /**
    * Array of {@link RouteRecord} containing components as they were
    * passed when adding records. It can also contain redirect records. This
    * can't be used directly
    */
  var matched: js.Array[RouteRecord]
  
  var meta: RouteMeta
  
  var name: js.UndefOr[RouteRecordName | Null] = js.undefined
  
  var params: RouteParams
  
  var path: String
  
  /**
    * Object representation of the `search` property of the current location.
    */
  var query: LocationQuery
  
  /**
    * Contains the location we were initially trying to access before ending up
    * on the current location.
    */
  var redirectedFrom: js.UndefOr[RouteLocation] = js.undefined
}
object RouteLocationhrefstring {
  
  inline def apply(
    fullPath: String,
    hash: String,
    href: String,
    matched: js.Array[RouteRecord],
    meta: RouteMeta,
    params: RouteParams,
    path: String,
    query: LocationQuery
  ): RouteLocationhrefstring = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], href = href.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLocationhrefstring]
  }
  
  extension [Self <: RouteLocationhrefstring](x: Self) {
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
    inline def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    inline def setMatched(value: js.Array[RouteRecord]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setMatchedVarargs(value: RouteRecord*): Self = StObject.set(x, "matched", js.Array(value*))
    
    inline def setMeta(value: RouteMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setName(value: RouteRecordName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: RouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: LocationQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setRedirectedFrom(value: RouteLocation): Self = StObject.set(x, "redirectedFrom", value.asInstanceOf[js.Any])
    
    inline def setRedirectedFromUndefined: Self = StObject.set(x, "redirectedFrom", js.undefined)
  }
}
