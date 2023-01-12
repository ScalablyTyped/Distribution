package typings.vueRouter.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RouteLocationNormalizedLoaded
  extends StObject
     with RouteLocationBase {
  
  /**
    * Array of {@link RouteLocationMatched} containing only plain components (any
    * lazy-loaded components have been loaded and were replaced inside the
    * `components` object) so it can be directly used to display routes. It
    * cannot contain redirect records either
    */
  var matched: js.Array[RouteLocationMatched]
}
object RouteLocationNormalizedLoaded {
  
  inline def apply(
    fullPath: String,
    hash: String,
    matched: js.Array[RouteLocationMatched],
    meta: RouteMeta,
    params: RouteParams,
    path: String,
    query: LocationQuery
  ): RouteLocationNormalizedLoaded = {
    val __obj = js.Dynamic.literal(fullPath = fullPath.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], matched = matched.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any])
    __obj.asInstanceOf[RouteLocationNormalizedLoaded]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RouteLocationNormalizedLoaded] (val x: Self) extends AnyVal {
    
    inline def setMatched(value: js.Array[RouteLocationMatched]): Self = StObject.set(x, "matched", value.asInstanceOf[js.Any])
    
    inline def setMatchedVarargs(value: RouteLocationMatched*): Self = StObject.set(x, "matched", js.Array(value*))
  }
}
