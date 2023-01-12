package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLocationNormalized
  extends StObject
     with RouteLocationBase {
  
  /**
    * Array of {@link RouteRecordNormalized}
    */
  var matched: js.Array[RouteRecordNormalized]
}
object RouteLocationNormalized {
  
  inline def apply(
    fullPath: String,
    hash: String,
    matched: js.Array[RouteRecordNormalized],
    meta: RouteMeta,
    params: RouteParams,
    path: String,
    query: LocationQuery
  ): RouteLocationNormalized = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLocationNormalized]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteLocationNormalized] (val x: Self) extends AnyVal {
    
    inline def setMatched(value: js.Array[RouteRecordNormalized]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setMatchedVarargs(value: RouteRecordNormalized*): Self = StObject.set(x, "matched", js.Array(value*))
  }
}
