package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionResult extends StObject {
  
  var routes: js.Array[DirectionRoute]
}
object DirectionResult {
  
  inline def apply(routes: js.Array[DirectionRoute]): DirectionResult = {
    val __obj = js.Dynamic.literal(routes = routes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionResult] (val x: Self) extends AnyVal {
    
    inline def setRoutes(value: js.Array[DirectionRoute]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesVarargs(value: DirectionRoute*): Self = StObject.set(x, "routes", js.Array(value*))
  }
}
