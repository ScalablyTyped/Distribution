package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.district
import typings.yandexMaps.yandexMapsStrings.house
import typings.yandexMaps.yandexMapsStrings.latlong
import typings.yandexMaps.yandexMapsStrings.locality
import typings.yandexMaps.yandexMapsStrings.longlat
import typings.yandexMaps.yandexMapsStrings.metro
import typings.yandexMaps.yandexMapsStrings.street
import typings.yandexMaps.yandexMapsStrings.yandexNumbersignmap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeocodeOptions extends StObject {
  
  /**
    * A rectangular area on the map, where the object being searched for is presumably located.
    */
  var boundedBy: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * If true, JSON is passed to the handler function. Otherwise, the handler function is passed an object containing the geoObjects field with the geocoding results as GeoObjectCollection.
    * When geocoding using the 'yandex#map' geocoder, the collection contains GeocodeResult objects.
    */
  var json: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Type of toponym (only for reverse geocoding).
    */
  var kind: js.UndefOr[house | street | metro | district | locality] = js.undefined
  
  /**
    * Geocoding provider
    */
  var provider: js.UndefOr[IGeocodeProvider | yandexNumbersignmap] = js.undefined
  
  /**
    * Maximum number of results to be returned.
    */
  var results: js.UndefOr[Double] = js.undefined
  
  /**
    * Determines how to interpret the coordinates in the request.
    */
  var searchCoordOrder: js.UndefOr[longlat | latlong] = js.undefined
  
  /**
    * Number of results that must be skipped.
    */
  var skip: js.UndefOr[Double] = js.undefined
  
  /**
    * Search only inside the area defined by the "boundedBy" option.
    */
  var strictBounds: js.UndefOr[Boolean] = js.undefined
}
object IGeocodeOptions {
  
  inline def apply(): IGeocodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IGeocodeOptions]
  }
  
  extension [Self <: IGeocodeOptions](x: Self) {
    
    inline def setBoundedBy(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "boundedBy", value.asInstanceOf[js.Any])
    
    inline def setBoundedByUndefined: Self = StObject.set(x, "boundedBy", js.undefined)
    
    inline def setBoundedByVarargs(value: js.Array[Double]*): Self = StObject.set(x, "boundedBy", js.Array(value*))
    
    inline def setJson(value: Boolean): Self = StObject.set(x, "json", value.asInstanceOf[js.Any])
    
    inline def setJsonUndefined: Self = StObject.set(x, "json", js.undefined)
    
    inline def setKind(value: house | street | metro | district | locality): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    
    inline def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
    
    inline def setProvider(value: IGeocodeProvider | yandexNumbersignmap): Self = StObject.set(x, "provider", value.asInstanceOf[js.Any])
    
    inline def setProviderUndefined: Self = StObject.set(x, "provider", js.undefined)
    
    inline def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
    
    inline def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
    
    inline def setSearchCoordOrder(value: longlat | latlong): Self = StObject.set(x, "searchCoordOrder", value.asInstanceOf[js.Any])
    
    inline def setSearchCoordOrderUndefined: Self = StObject.set(x, "searchCoordOrder", js.undefined)
    
    inline def setSkip(value: Double): Self = StObject.set(x, "skip", value.asInstanceOf[js.Any])
    
    inline def setSkipUndefined: Self = StObject.set(x, "skip", js.undefined)
    
    inline def setStrictBounds(value: Boolean): Self = StObject.set(x, "strictBounds", value.asInstanceOf[js.Any])
    
    inline def setStrictBoundsUndefined: Self = StObject.set(x, "strictBounds", js.undefined)
  }
}
