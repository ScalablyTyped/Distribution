package typings
package yandexDashMapsLib.ymapsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IClusterPlacemarkProperties extends IDataManager {
  var geoObjects: js.Array[IGeoObject]
}

object IClusterPlacemarkProperties {
  @scala.inline
  def apply(
    events: IEventManager,
    geoObjects: js.Array[IGeoObject],
    get: js.Function2[java.lang.String, js.Object, js.Object]
  ): IClusterPlacemarkProperties = {
    val __obj = js.Dynamic.literal(events = events, geoObjects = geoObjects, get = get)
  
    __obj.asInstanceOf[IClusterPlacemarkProperties]
  }
}

