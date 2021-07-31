package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.evenOdd
import typings.yandexMaps.yandexMapsStrings.nonZero
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelMultiPolygonGeometry
  extends StObject
     with IPixelGeometry {
  
  def contains(position: js.Array[Double]): Boolean
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[js.Array[js.Array[Double]]]]
  
  def getFillRule(): evenOdd | nonZero
  
  def getLength(): Double
}
object IPixelMultiPolygonGeometry {
  
  @scala.inline
  def apply(
    contains: js.Array[Double] => Boolean,
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[js.Array[js.Array[Double]]]],
    getFillRule: () => evenOdd | nonZero,
    getLength: () => Double,
    getMetaData: () => js.Object,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelMultiPolygonGeometry = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelMultiPolygonGeometry]
  }
  
  @scala.inline
  implicit class IPixelMultiPolygonGeometryMutableBuilder[Self <: IPixelMultiPolygonGeometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: js.Array[Double] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCoordinates(value: () => js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetFillRule(value: () => evenOdd | nonZero): Self = StObject.set(x, "getFillRule", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetLength(value: () => Double): Self = StObject.set(x, "getLength", js.Any.fromFunction0(value))
  }
}
