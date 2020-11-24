package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClusterPlacemarkProperties extends IDataManager {
  
  var geoObjects: js.Array[IGeoObject[IGeometry]] = js.native
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
  implicit class IClusterPlacemarkPropertiesOps[Self <: IClusterPlacemarkProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGeoObjectsVarargs(value: IGeoObject[IGeometry]*): Self = this.set("geoObjects", js.Array(value :_*))
    
    @scala.inline
    def setGeoObjects(value: js.Array[IGeoObject[IGeometry]]): Self = this.set("geoObjects", value.asInstanceOf[js.Any])
  }
}
