package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShape extends js.Object {
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
    equals: IShape => Boolean,
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getGeometry: () => IPixelGeometry,
    getType: () => String,
    scale: Double => IShape,
    shift: js.Array[Double] => IShape
  ): IShape = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), equals = js.Any.fromFunction1(equals), getBounds = js.Any.fromFunction0(getBounds), getGeometry = js.Any.fromFunction0(getGeometry), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
  
    __obj.asInstanceOf[IShape]
  }
}

