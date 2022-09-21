package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLocation
  extends StObject
     with RouteLocationBase {
  
  /**
    * Array of {@link RouteRecord} containing components as they were
    * passed when adding records. It can also contain redirect records. This
    * can't be used directly
    */
  var matched: js.Array[RouteRecord]
}
object RouteLocation {
  
  inline def apply(
    fullPath: String,
    hash: String,
    matched: js.Array[RouteRecord],
    meta: RouteMeta,
    params: RouteParams,
    path: String,
    query: LocationQuery
  ): RouteLocation = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLocation]
  }
  
  extension [Self <: RouteLocation](x: Self) {
    
    inline def setMatched(value: js.Array[RouteRecord]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setMatchedVarargs(value: RouteRecord*): Self = StObject.set(x, "matched", js.Array(value*))
  }
}
