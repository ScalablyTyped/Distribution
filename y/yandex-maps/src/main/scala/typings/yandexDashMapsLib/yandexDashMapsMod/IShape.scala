package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShape extends js.Object {
  def contains(position: js.Array[scala.Double]): scala.Boolean
  def equals(shape: IShape): scala.Boolean
  def getBounds(): js.Array[js.Array[scala.Double]] | scala.Null
  def getGeometry(): IPixelGeometry
  def getType(): java.lang.String
  def scale(factor: scala.Double): IShape
  def shift(offset: js.Array[scala.Double]): IShape
}

object IShape {
  @scala.inline
  def apply(
    contains: js.Array[scala.Double] => scala.Boolean,
    equals: IShape => scala.Boolean,
    getBounds: () => js.Array[js.Array[scala.Double]] | scala.Null,
    getGeometry: () => IPixelGeometry,
    getType: () => java.lang.String,
    scale: scala.Double => IShape,
    shift: js.Array[scala.Double] => IShape
  ): IShape = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), equals = js.Any.fromFunction1(equals), getBounds = js.Any.fromFunction0(getBounds), getGeometry = js.Any.fromFunction0(getGeometry), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
  
    __obj.asInstanceOf[IShape]
  }
}

