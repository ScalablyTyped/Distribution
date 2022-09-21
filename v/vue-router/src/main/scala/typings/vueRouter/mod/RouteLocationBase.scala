package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined parent std.Pick<vue-router.vue-router.MatcherLocation, 'name' | 'path' | 'params' | 'meta'> */
trait RouteLocationBase extends StObject {
  
  /**
    * The whole location including the `search` and `hash`. This string is
    * percentage encoded.
    */
  var fullPath: String
  
  /**
    * Hash of the current location. If present, starts with a `#`.
    */
  var hash: String
  
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
object RouteLocationBase {
  
  inline def apply(
    fullPath: String,
    hash: String,
    meta: RouteMeta,
    params: RouteParams,
    path: String,
    query: LocationQuery
  ): RouteLocationBase = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLocationBase]
  }
  
  extension [Self <: RouteLocationBase](x: Self) {
    
    inline def setFullPath(value: String): Self = StObject.set(x, "fullPath", value.asInstanceOf[js.Any])
    
    inline def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
    
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
