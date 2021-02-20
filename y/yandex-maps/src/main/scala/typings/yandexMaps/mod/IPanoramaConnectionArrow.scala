package typings.yandexMaps.mod

import typings.yandexMaps.mod.data.Manager
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPanoramaConnectionArrow extends IPanoramaConnection {
  
  def getDirection(): js.Array[Double] = js.native
  
  def getPanorama(): IPanorama = js.native
  
  var properties: Manager = js.native
}
object IPanoramaConnectionArrow {
  
  @scala.inline
  def apply(
    getConnectedPanorama: () => js.Promise[IPanorama],
    getDirection: () => js.Array[Double],
    getPanorama: () => IPanorama,
    properties: Manager
  ): IPanoramaConnectionArrow = {
    val __obj = js.Dynamic.literal(getConnectedPanorama = js.Any.fromFunction0(getConnectedPanorama), getDirection = js.Any.fromFunction0(getDirection), getPanorama = js.Any.fromFunction0(getPanorama), properties = properties.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanoramaConnectionArrow]
  }
  
  @scala.inline
  implicit class IPanoramaConnectionArrowMutableBuilder[Self <: IPanoramaConnectionArrow] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetDirection(value: () => js.Array[Double]): Self = StObject.set(x, "getDirection", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPanorama(value: () => IPanorama): Self = StObject.set(x, "getPanorama", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProperties(value: Manager): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
  }
}
