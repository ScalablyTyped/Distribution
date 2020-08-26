package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPixelGeometry extends IBaseGeometry {
  def equals(geometry: IPixelGeometry): Boolean = js.native
  def getMetaData(): js.Object = js.native
  def scale(factor: Double): IPixelGeometry = js.native
  def shift(offset: js.Array[Double]): IPixelGeometry = js.native
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
  @scala.inline
  implicit class IPixelGeometryOps[Self <: IPixelGeometry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEquals(value: IPixelGeometry => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetMetaData(value: () => js.Object): Self = this.set("getMetaData", js.Any.fromFunction0(value))
    @scala.inline
    def setScale(value: Double => IPixelGeometry): Self = this.set("scale", js.Any.fromFunction1(value))
    @scala.inline
    def setShift(value: js.Array[Double] => IPixelGeometry): Self = this.set("shift", js.Any.fromFunction1(value))
  }
  
}

