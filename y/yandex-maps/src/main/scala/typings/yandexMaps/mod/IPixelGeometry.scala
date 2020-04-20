package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPixelGeometry extends IBaseGeometry {
  def equals(geometry: IPixelGeometry): Boolean
  def getMetaData(): js.Object
  def scale(factor: Double): IPixelGeometry
  def shift(offset: js.Array[Double]): IPixelGeometry
}

object IPixelGeometry {
  @scala.inline
  def apply(
    equals: IPixelGeometry => Boolean,
    events: IEventManager,
    getBounds: () => js.Array[js.Array[Double]] | Null,
    getMetaData: () => js.Object,
    getType: () => String,
    scale: Double => IPixelGeometry,
    shift: js.Array[Double] => IPixelGeometry
  ): IPixelGeometry = {
    val __obj = js.Dynamic.literal(equals = js.Any.fromFunction1(equals), events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.asInstanceOf[IPixelGeometry]
  }
}

