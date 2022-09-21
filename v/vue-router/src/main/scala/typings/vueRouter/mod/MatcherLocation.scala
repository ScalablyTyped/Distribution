package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Normalized/resolved Route location that returned by the matcher.
  */
trait MatcherLocation extends StObject {
  
  /**
    * Array of {@link RouteRecord} containing components as they were
    * passed when adding records. It can also contain redirect records. This
    * can't be used directly
    */
  var matched: js.Array[RouteRecord]
  
  /**
    * Merged `meta` properties from all the matched route records.
    */
  var meta: RouteMeta
  
  /**
    * Name of the matched record
    */
  var name: js.UndefOr[RouteRecordName | Null] = js.undefined
  
  /**
    * Object of decoded params extracted from the `path`.
    */
  var params: RouteParams
  
  /**
    * Percentage encoded pathname section of the URL.
    */
  var path: String
}
object MatcherLocation {
  
  inline def apply(matched: js.Array[RouteRecord], meta: RouteMeta, params: RouteParams, path: String): MatcherLocation = {
    val __obj = js.Dynamic.literal(matched = matched.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatcherLocation]
  }
  
  extension [Self <: MatcherLocation](x: Self) {
    
    inline def setMatched(value: js.Array[RouteRecord]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setMatchedVarargs(value: RouteRecord*): Self = StObject.set(x, "matched", js.Array(value*))
    
    inline def setMeta(value: RouteMeta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setName(value: RouteRecordName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setParams(value: RouteParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
  }
}
