package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelPointGeometry
  extends StObject
     with IPixelGeometry {
  
  def getCoordinates(): js.Array[Double]
}
object IPixelPointGeometry {
  
  inline def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getCoordinates: () => js.Array[Double],
    getMetaData: () => js.Object,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelPointGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getCoordinates = js.Any.fromFunction0(getCoordinates), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelPointGeometry]
  }
  
  extension [Self <: IPixelPointGeometry](x: Self) {
    
    inline def setGetCoordinates(value: () => js.Array[Double]): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
  }
}
