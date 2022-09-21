package typings.yandexMaps.anon

import typings.yandexMaps.mod.IPanorama
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofBase_ extends StObject {
  
  /* static member */
  def createPanorama(params: AngularBBox): IPanorama
  
  /* static member */
  def getMarkerPositionFromDirection(panorama: IPanorama, direction: js.Array[Double], distance: Double): js.Array[Double]
}
object TypeofBase_ {
  
  inline def apply(
    createPanorama: AngularBBox => IPanorama,
    getMarkerPositionFromDirection: (IPanorama, js.Array[Double], Double) => js.Array[Double]
  ): TypeofBase_ = {
    val __obj = js.Dynamic.literal(createPanorama = js.Any.fromFunction1(createPanorama), getMarkerPositionFromDirection = js.Any.fromFunction3(getMarkerPositionFromDirection))
    __obj.asInstanceOf[TypeofBase_]
  }
  
  extension [Self <: TypeofBase_](x: Self) {
    
    inline def setCreatePanorama(value: AngularBBox => IPanorama): Self = StObject.set(x, "createPanorama", js.Any.fromFunction1(value))
    
    inline def setGetMarkerPositionFromDirection(value: (IPanorama, js.Array[Double], Double) => js.Array[Double]): Self = StObject.set(x, "getMarkerPositionFromDirection", js.Any.fromFunction3(value))
  }
}
