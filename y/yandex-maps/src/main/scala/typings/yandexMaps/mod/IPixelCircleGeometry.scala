package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelCircleGeometry
  extends StObject
     with IPixelGeometry {
  
  def getCoordinates(): js.Array[Double]
  
  def getRadius(): Double
}
object IPixelCircleGeometry {
  
  inline def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getCoordinates: () => js.Array[Double],
    getMetaData: () => js.Object,
    getRadius: () => Double,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelCircleGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getCoordinates = js.Any.fromFunction0(getCoordinates), getMetaData = js.Any.fromFunction0(getMetaData), getRadius = js.Any.fromFunction0(getRadius), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelCircleGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPixelCircleGeometry] (val x: Self) extends AnyVal {
    
    inline def setGetCoordinates(value: () => js.Array[Double]): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    inline def setGetRadius(value: () => Double): Self = StObject.set(x, "getRadius", js.Any.fromFunction0(value))
  }
}
