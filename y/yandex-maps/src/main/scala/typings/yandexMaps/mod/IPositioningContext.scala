package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPositioningContext extends StObject {
  
  def fromClientPixels(clientPixelPoint: js.Array[Double]): js.Array[Double]
  
  def getZoom(): Double
  
  def toClientPixels(globalPixelPoint: js.Array[Double]): js.Array[Double]
}
object IPositioningContext {
  
  inline def apply(
    fromClientPixels: js.Array[Double] => js.Array[Double],
    getZoom: () => Double,
    toClientPixels: js.Array[Double] => js.Array[Double]
  ): IPositioningContext = {
    val __obj = js.Dynamic.literal(fromClientPixels = js.Any.fromFunction1(fromClientPixels), getZoom = js.Any.fromFunction0(getZoom), toClientPixels = js.Any.fromFunction1(toClientPixels))
    __obj.asInstanceOf[IPositioningContext]
  }
  
  extension [Self <: IPositioningContext](x: Self) {
    
    inline def setFromClientPixels(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "fromClientPixels", js.Any.fromFunction1(value))
    
    inline def setGetZoom(value: () => Double): Self = StObject.set(x, "getZoom", js.Any.fromFunction0(value))
    
    inline def setToClientPixels(value: js.Array[Double] => js.Array[Double]): Self = StObject.set(x, "toClientPixels", js.Any.fromFunction1(value))
  }
}
