package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.auto
import typings.yandexMaps.yandexMapsStrings.masstransit
import typings.yandexMaps.yandexMapsStrings.pedestrian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IMultiRouteParams extends StObject {
  
  var avoidTrafficJams: js.UndefOr[Boolean] = js.undefined
  
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.undefined
  
  var requestSendInterval: js.UndefOr[String | Double] = js.undefined
  
  var results: js.UndefOr[Double] = js.undefined
  
  var reverseGeocoding: js.UndefOr[Boolean] = js.undefined
  
  var routingMode: js.UndefOr[auto | masstransit | pedestrian] = js.undefined
  
  var searchCoordOrder: js.UndefOr[String] = js.undefined
  
  var strictBounds: js.UndefOr[Boolean] = js.undefined
  
  var viaIndexes: js.UndefOr[js.Array[Double]] = js.undefined
}
object IMultiRouteParams {
  
  inline def apply(): IMultiRouteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiRouteParams]
  }
  
  extension [Self <: IMultiRouteParams](x: Self) {
    
    inline def setAvoidTrafficJams(value: Boolean): Self = StObject.set(x, "avoidTrafficJams", value.asInstanceOf[js.Any])
    
    inline def setAvoidTrafficJamsUndefined: Self = StObject.set(x, "avoidTrafficJams", js.undefined)
    
    inline def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    inline def setBoundedByNull: Self = StObject.set(x, "boundedBy", null)
    
    inline def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    inline def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value :_*))
    
    inline def setRequestSendInterval(value: String | Double): Self = StObject.set(x, "requestSendInterval", value.asInstanceOf[js.Any])
    
    inline def setRequestSendIntervalUndefined: Self = StObject.set(x, "requestSendInterval", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setReverseGeocoding(value: Boolean): Self = StObject.set(x, "reverseGeocoding", value.asInstanceOf[js.Any])
    
    inline def setReverseGeocodingUndefined: Self = StObject.set(x, "reverseGeocoding", js.undefined)
    
    inline def setRoutingMode(value: auto | masstransit | pedestrian): Self = StObject.set(x, "routingMode", value.asInstanceOf[js.Any])
    
    inline def setRoutingModeUndefined: Self = StObject.set(x, "routingMode", js.undefined)
    
    inline def setSearchCoordOrder(value: String): Self = StObject.set(x, "searchCoordOrder", value.asInstanceOf[js.Any])
    
    inline def setSearchCoordOrderUndefined: Self = StObject.set(x, "searchCoordOrder", js.undefined)
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
    
    inline def setViaIndexes(value: js.Array[Double]): Self = StObject.set(x, "viaIndexes", value.asInstanceOf[js.Any])
    
    inline def setViaIndexesUndefined: Self = StObject.set(x, "viaIndexes", js.undefined)
    
    inline def setViaIndexesVarargs(value: Double*): Self = StObject.set(x, "viaIndexes", js.Array(value :_*))
  }
}
