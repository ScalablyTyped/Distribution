package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IGeocodeResult extends StObject {
  
  /**
    *  Geocoding results.
    */
  var geoObjects: GeoObjectCollection
}
object IGeocodeResult {
  
  inline def apply(geoObjects: GeoObjectCollection): IGeocodeResult = {
    val __obj = js.Dynamic.literal(geoObjects = geoObjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGeocodeResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGeocodeResult] (val x: Self) extends AnyVal {
    
    inline def setGeoObjects(value: GeoObjectCollection): Self = StObject.set(x, "geoObjects", value.asInstanceOf[js.Any])
  }
}
