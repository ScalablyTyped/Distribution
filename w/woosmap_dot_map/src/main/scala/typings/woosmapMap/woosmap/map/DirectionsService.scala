package typings.woosmapMap.woosmap.map

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsService extends StObject {
  
  /**
    * Issue a directions search request.
    */
  def route(
    request: DirectionRequest,
    callback: js.Function2[/* result */ DirectionResult, /* status */ String, Any]
  ): Unit
}
object DirectionsService {
  
  inline def apply(
    route: (DirectionRequest, js.Function2[/* result */ DirectionResult, /* status */ String, Any]) => Unit
  ): DirectionsService = {
    val __obj = js.Dynamic.literal(route = js.Any.fromFunction2(route))
    __obj.asInstanceOf[DirectionsService]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsService] (val x: Self) extends AnyVal {
    
    inline def setRoute(
      value: (DirectionRequest, js.Function2[/* result */ DirectionResult, /* status */ String, Any]) => Unit
    ): Self = StObject.set(x, "route", js.Any.fromFunction2(value))
  }
}
