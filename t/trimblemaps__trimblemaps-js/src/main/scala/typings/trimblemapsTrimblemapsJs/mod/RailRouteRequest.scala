package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.anon.DataAny
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RailRouteRequest extends StObject {
  
  def callback(error: js.Error, result: DataAny): Unit
  @JSName("callback")
  var callback_Original: Callback[DataAny]
  
  var options: RailRouteOptions
  
  var stops: js.Array[RailStation]
}
object RailRouteRequest {
  
  inline def apply(
    callback: (/* error */ js.Error, DataAny) => Unit,
    options: RailRouteOptions,
    stops: js.Array[RailStation]
  ): RailRouteRequest = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), options = options.asInstanceOf[js.Any], stops = stops.asInstanceOf[js.Any])
    __obj.asInstanceOf[RailRouteRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RailRouteRequest] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: (/* error */ js.Error, DataAny) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setOptions(value: RailRouteOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setStops(value: js.Array[RailStation]): Self = StObject.set(x, "stops", value.asInstanceOf[js.Any])
    
    inline def setStopsVarargs(value: RailStation*): Self = StObject.set(x, "stops", js.Array(value*))
  }
}
