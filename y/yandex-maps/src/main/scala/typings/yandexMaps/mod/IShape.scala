package typings.yandexMaps.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IShape extends StObject {
  
  def contains(position: js.Array[Double]): Boolean
  
  def equals(shape: IShape): Boolean
  
  def getBounds(): js.Array[js.Array[Double]] | Null
  
  def getGeometry(): IPixelGeometry
  
  def getType(): String
  
  def scale(factor: Double): IShape
  
  def shift(offset: js.Array[Double]): IShape
}
object IShape {
  
  @scala.inline
  def apply(
    contains: js.Array[Double] => Boolean,
    equals_ : IShape => Boolean,
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getGeometry: () => IPixelGeometry,
    getType: () => String,
    scale: Double => IShape,
    shift: js.Array[Double] => IShape
  ): IShape = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getBounds = js.Any.fromFunction0(getBounds), getGeometry = js.Any.fromFunction0(getGeometry), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[IShape]
  }
  
  @scala.inline
  implicit class IShapeMutableBuilder[Self <: IShape] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: js.Array[Double] => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals_(value: IShape => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetBounds(value: () => js.Array[js.Array[Double]] | Null): Self = StObject.set(x, "getBounds", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetGeometry(value: () => IPixelGeometry): Self = StObject.set(x, "getGeometry", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetType(value: () => String): Self = StObject.set(x, "getType", js.Any.fromFunction0(value))
    
    @scala.inline
    def setScale(value: Double => IShape): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setShift(value: js.Array[Double] => IShape): Self = StObject.set(x, "shift", js.Any.fromFunction1(value))
  }
}
