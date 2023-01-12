package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelGeometry
  extends StObject
     with IBaseGeometry {
  
  def equals(geometry: IPixelGeometry): Boolean
  
  def getMetaData(): js.Object
  
  def scale(factor: Double): IPixelGeometry
  
  def shift(offset: js.Array[Double]): IPixelGeometry
}
object IPixelGeometry {
  
  inline def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getMetaData: () => js.Object,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelGeometry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPixelGeometry] (val x: Self) extends AnyVal {
    
    inline def setEquals_(value: IPixelGeometry => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetMetaData(value: () => js.Object): Self = StObject.set(x, "getMetaData", js.Any.fromFunction0(value))
    
    inline def setScale(value: Double => IPixelGeometry): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setShift(value: js.Array[Double] => IPixelGeometry): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
  }
}
