package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.anon.DataAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RoadSurfaceRouteOptions extends StObject {
  
  // Optional to switch provider from "Default" to "RC1".
  def callback(error: js.Error, result: DataAny): Unit
  // Optional to switch provider from "Default" to "RC1".
  @JSName("callback")
  var callback_Original: Callback[DataAny]
  
  var provider: String
  
  var routeDuration: Double
  
  // The duration of the route in minutes (integer). This is required as it is used to calculate the temporal offset for each point in the route path.
  var routePath: js.Array[LngLatLike]
}
object RoadSurfaceRouteOptions {
  
  inline def apply(
    callback: (/* error */ js.Error, DataAny) => Unit,
    provider: String,
    routeDuration: Double,
    routePath: js.Array[LngLatLike]
  ): RoadSurfaceRouteOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), provider = provider.asInstanceOf[js.Any], routeDuration = routeDuration.asInstanceOf[js.Any], routePath = routePath.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoadSurfaceRouteOptions]
  }
  
  extension [Self <: RoadSurfaceRouteOptions](x: Self) {
    
    inline def setCallback(value: (/* error */ js.Error, DataAny) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setProvider(value: String): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setRouteDuration(value: Double): Self = StObject.set(x, "routeDuration", value.asInstanceOf[js.Any])
    
    inline def setRoutePath(value: js.Array[LngLatLike]): Self = StObject.set(x, "routePath", value.asInstanceOf[js.Any])
    
    inline def setRoutePathVarargs(value: LngLatLike*): Self = StObject.set(x, "routePath", js.Array(value*))
  }
}
