package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IClusterPlacemarkProperties
  extends StObject
     with IDataManager {
  
  var geoObjects: js.Array[IGeoObject[IGeometry]]
}
object IClusterPlacemarkProperties {
  
  @scala.inline
  def apply(
    events: IEventManager[js.Object],
    geoObjects: js.Array[IGeoObject[IGeometry]],
    get: (String, js.Object) => js.Object
  ): IClusterPlacemarkProperties = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], geoObjects = geoObjects.asInstanceOf[js.Any], get = js.Any.fromFunction2(get))
    __obj.asInstanceOf[IClusterPlacemarkProperties]
  }
  
  @scala.inline
  implicit class IClusterPlacemarkPropertiesMutableBuilder[Self <: IClusterPlacemarkProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoObjects(value: js.Array[IGeoObject[IGeometry]]): Self = StObject.set(x, "geoObjects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoObjectsVarargs(value: IGeoObject[IGeometry]*): Self = StObject.set(x, "geoObjects", js.Array(value :_*))
  }
}
