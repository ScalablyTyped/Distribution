package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPixelRectangleGeometry
  extends StObject
     with IPixelGeometry {
  
  def getClosest(anchorPosition: js.Array[Double]): js.Object
  
  def getCoordinates(): js.Array[js.Array[Double]]
}
object IPixelRectangleGeometry {
  
  @scala.inline
  def apply(
    equals_ : IPixelGeometry => Boolean,
    events: IEventManager[js.Object],
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getClosest: js.Array[Double] => js.Object,
    getCoordinates: () => js.Array[js.Array[Double]],
    getMetaData: () => js.Object,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelRectangleGeometry = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IPixelRectangleGeometry]
  }
  
  @scala.inline
  implicit class IPixelRectangleGeometryMutableBuilder[Self <: IPixelRectangleGeometry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetClosest(value: js.Array[Double] => js.Object): Self = StObject.set(x, "getClosest", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetCoordinates(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getCoordinates", js.Any.fromFunction0(value))
  }
}
