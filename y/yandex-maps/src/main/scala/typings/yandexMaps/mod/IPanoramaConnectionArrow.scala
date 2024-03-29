package typings.yandexMaps.mod

import typings.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPanoramaConnectionArrow
  extends StObject
     with IPanoramaConnection {
  
  def getDirection(): js.Array[Double]
  
  def getPanorama(): IPanorama
  
  var properties: Manager
}
object IPanoramaConnectionArrow {
  
  inline def apply(
    getConnectedPanorama: () => js.Promise[IPanorama],
    getDirection: () => js.Array[Double],
    getPanorama: () => IPanorama,
    properties: Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama), getDirection = js.Any.fromFunction0(getDirection), getPanorama = js.Any.fromFunction0(getPanorama), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPanoramaConnectionArrow] (val x: Self) extends AnyVal {
    
    inline def setGetDirection(value: () => js.Array[Double]): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
    
    inline def setGetPanorama(value: () => IPanorama): Self = StObject.set(x, "getPanorama", js.Any.fromFunction0(value))
    
    inline def setProperties(value: Manager): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
