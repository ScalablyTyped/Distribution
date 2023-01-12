package typings.trimblemapsTrimblemapsJs.mod

import typings.trimblemapsTrimblemapsJs.anon.DataAny
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Detail
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Directions
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Mileage
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.Road
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.State
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.TollDetail
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.af
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.as
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.eu
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.me
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.na
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.oc
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.sa
import typings.trimblemapsTrimblemapsJs.trimblemapsTrimblemapsJsStrings.ww
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReduceTripOptions extends StObject {
  
  def callback(error: js.Error, result: DataAny): Unit
  @JSName("callback")
  var callback_Original: Callback[DataAny]
  
  var extendedOptions: js.UndefOr[SharedOptions] = js.undefined
  
  var highwayOnly: js.UndefOr[Boolean] = js.undefined
  
  var offRouteMiles: js.UndefOr[Double] = js.undefined
  
  var region: js.UndefOr[as | af | me | ww | sa | oc | eu | na] = js.undefined
  
  // This value will be ignored if routingOptions are supplied.
  var reportType: js.UndefOr[TollDetail | Detail | Road | Directions | Mileage | State] = js.undefined
  
  var routePings: js.Array[LngLat]
  
  var routingOptions: js.UndefOr[RouteOptionsBase] = js.undefined
}
object ReduceTripOptions {
  
  inline def apply(callback: (/* error */ js.Error, DataAny) => Unit, routePings: js.Array[LngLat]): ReduceTripOptions = {
    val __obj = js.Dynamic.literal(callback = js.Any.fromFunction2(callback), routePings = routePings.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReduceTripOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReduceTripOptions] (val x: Self) extends AnyVal {
    
    inline def setCallback(value: (/* error */ js.Error, DataAny) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
    
    inline def setExtendedOptions(value: SharedOptions): Self = StObject.set(x, "extendedOptions", value.asInstanceOf[js.Any])
    
    inline def setExtendedOptionsUndefined: Self = StObject.set(x, "extendedOptions", js.undefined)
    
    inline def setHighwayOnly(value: Boolean): Self = StObject.set(x, "highwayOnly", value.asInstanceOf[js.Any])
    
    inline def setHighwayOnlyUndefined: Self = StObject.set(x, "highwayOnly", js.undefined)
    
    inline def setOffRouteMiles(value: Double): Self = StObject.set(x, "offRouteMiles", value.asInstanceOf[js.Any])
    
    inline def setOffRouteMilesUndefined: Self = StObject.set(x, "offRouteMiles", js.undefined)
    
    inline def setRegion(value: as | af | me | ww | sa | oc | eu | na): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    
    inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    
    inline def setReportType(value: TollDetail | Detail | Road | Directions | Mileage | State): Self = StObject.set(x, "reportType", value.asInstanceOf[js.Any])
    
    inline def setReportTypeUndefined: Self = StObject.set(x, "reportType", js.undefined)
    
    inline def setRoutePings(value: js.Array[LngLat]): Self = StObject.set(x, "routePings", value.asInstanceOf[js.Any])
    
    inline def setRoutePingsVarargs(value: LngLat*): Self = StObject.set(x, "routePings", js.Array(value*))
    
    inline def setRoutingOptions(value: RouteOptionsBase): Self = StObject.set(x, "routingOptions", value.asInstanceOf[js.Any])
    
    inline def setRoutingOptionsUndefined: Self = StObject.set(x, "routingOptions", js.undefined)
  }
}
