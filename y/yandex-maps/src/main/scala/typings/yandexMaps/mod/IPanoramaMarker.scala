package typings.yandexMaps.mod

import typings.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaMarker extends StObject {
  
  def getIconSet(): js.Promise[IPanoramaMarkerIconSet]
  
  def getPanorama(): IPanorama
  
  def getPosition(): js.Array[Double]
  
  var properties: Manager
}
object IPanoramaMarker {
  
  inline def apply(
    getIconSet: () => js.Promise[IPanoramaMarkerIconSet],
    getPanorama: () => IPanorama,
    getPosition: () => js.Array[Double],
    properties: Manager
  ): IPanoramaMarker = {
    val __obj = js.Dynamic.literal(getIconSet = js.Any.fromFunction0(getIconSet), getPanorama = js.Any.fromFunction0(getPanorama), getPosition = js.Any.fromFunction0(getPosition), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaMarker]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanoramaMarker] (val x: Self) extends AnyVal {
    
    inline def setGetIconSet(value: () => js.Promise[IPanoramaMarkerIconSet]): Self = StObject.set(x, "getIconSet", js.Any.fromFunction0(value))
    
    inline def setGetPanorama(value: () => IPanorama): Self = StObject.set(x, "getPanorama", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => js.Array[Double]): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setProperties(value: Manager): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
