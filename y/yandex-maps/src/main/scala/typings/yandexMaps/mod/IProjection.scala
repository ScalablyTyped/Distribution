package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IProjection extends StObject {
  
  def fromGlobalPixels(globalPixelPoint: js.Array[Double], zoom: Double): js.Array[Double]
  
  def getCoordSystem(): ICoordSystem
  
  def isCycled(): js.Array[Boolean]
  
  def toGlobalPixels(coordPoint: js.Array[Double], zoom: Double): js.Array[Double]
}
object IProjection {
  
  @scala.inline
  def apply(
    fromGlobalPixels: (js.Array[Double], Double) => js.Array[Double],
    getCoordSystem: () => ICoordSystem,
    isCycled: () => js.Array[Boolean],
    toGlobalPixels: (js.Array[Double], Double) => js.Array[Double]
  ): IProjection = {
    val __obj = js.Dynamic.literal(fromGlobalPixels = js.Any.fromFunction2(fromGlobalPixels), getCoordSystem = js.Any.fromFunction0(getCoordSystem), isCycled = js.Any.fromFunction0(isCycled), toGlobalPixels = js.Any.fromFunction2(toGlobalPixels))
    __obj.asInstanceOf[IProjection]
  }
  
  @scala.inline
  implicit class IProjectionMutableBuilder[Self <: IProjection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = StObject.set(x, "fromGlobalPixels", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetCoordSystem(value: () => ICoordSystem): Self = StObject.set(x, "getCoordSystem", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsCycled(value: () => js.Array[Boolean]): Self = StObject.set(x, "isCycled", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToGlobalPixels(value: (js.Array[Double], Double) => js.Array[Double]): Self = StObject.set(x, "toGlobalPixels", js.Any.fromFunction2(value))
  }
}
