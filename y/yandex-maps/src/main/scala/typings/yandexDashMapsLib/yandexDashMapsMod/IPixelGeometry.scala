package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelGeometry extends IBaseGeometry {
  def equals(geometry: IPixelGeometry): scala.Boolean
  def getMetaData(): js.Object
  def scale(factor: scala.Double): IPixelGeometry
  def shift(offset: js.Array[scala.Double]): IPixelGeometry
}

object IPixelGeometry {
  @scala.inline
  def apply(
    equals: IPixelGeometry => scala.Boolean,
    events: IEventManager,
    getBounds: () => js.Array[js.Array[scala.Double]] | scala.Null,
    getMetaData: () => js.Object,
    getType: () => java.lang.String,
    scale: scala.Double => IPixelGeometry,
    shift: js.Array[scala.Double] => IPixelGeometry
  ): IPixelGeometry = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), events = events, getBounds = js.Any.fromFunction0(getBounds), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
  
    __obj.asInstanceOf[IPixelGeometry]
  }
}

