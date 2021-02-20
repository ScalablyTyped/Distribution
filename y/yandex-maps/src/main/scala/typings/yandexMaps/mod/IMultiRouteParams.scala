package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.auto
import typings.yandexMaps.yandexMapsStrings.masstransit
import typings.yandexMaps.yandexMapsStrings.pedestrian
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IMultiRouteParams extends StObject {
  
  var avoidTrafficJams: js.UndefOr[Boolean] = js.native
  
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]] | Null] = js.native
  
  var requestSendInterval: js.UndefOr[String | Double] = js.native
  
  var results: js.UndefOr[Double] = js.native
  
  var reverseGeocoding: js.UndefOr[Boolean] = js.native
  
  var routingMode: js.UndefOr[auto | masstransit | pedestrian] = js.native
  
  var searchCoordOrder: js.UndefOr[String] = js.native
  
  var strictBounds: js.UndefOr[Boolean] = js.native
  
  var viaIndexes: js.UndefOr[js.Array[Double]] = js.native
}
object IMultiRouteParams {
  
  @scala.inline
  def apply(): IMultiRouteParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IMultiRouteParams]
  }
  
  @scala.inline
  implicit class IMultiRouteParamsMutableBuilder[Self <: IMultiRouteParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvoidTrafficJams(value: Boolean): Self = StObject.set(x, "avoidTrafficJams", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvoidTrafficJamsUndefined: Self = StObject.set(x, "avoidTrafficJams", js.undefined)
    
    @scala.inline
    def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBoundedByNull: Self = StObject.set(x, "boundedBy", null)
    
    @scala.inline
    def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    @scala.inline
    def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value :_*))
    
    @scala.inline
    def setRequestSendInterval(value: String | Double): Self = StObject.set(x, "requestSendInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestSendIntervalUndefined: Self = StObject.set(x, "requestSendInterval", js.undefined)
    
    @scala.inline
    def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    @scala.inline
    def setReverseGeocoding(value: Boolean): Self = StObject.set(x, "reverseGeocoding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReverseGeocodingUndefined: Self = StObject.set(x, "reverseGeocoding", js.undefined)
    
    @scala.inline
    def setRoutingMode(value: auto | masstransit | pedestrian): Self = StObject.set(x, "routingMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutingModeUndefined: Self = StObject.set(x, "routingMode", js.undefined)
    
    @scala.inline
    def setSearchCoordOrder(value: String): Self = StObject.set(x, "searchCoordOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSearchCoordOrderUndefined: Self = StObject.set(x, "searchCoordOrder", js.undefined)
    
    @scala.inline
    def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
    
    @scala.inline
    def setViaIndexes(value: js.Array[Double]): Self = StObject.set(x, "viaIndexes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViaIndexesUndefined: Self = StObject.set(x, "viaIndexes", js.undefined)
    
    @scala.inline
    def setViaIndexesVarargs(value: Double*): Self = StObject.set(x, "viaIndexes", js.Array(value :_*))
  }
}
