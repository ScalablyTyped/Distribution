package typings.yandexMaps.mod

import typings.yandexMaps.yandexMapsStrings.evenOdd
import typings.yandexMaps.yandexMapsStrings.nonZero
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPixelMultiPolygonGeometry extends IPixelGeometry {
  def contains(position: js.Array[Double]): Boolean = js.native
  def getClosest(anchorPosition: js.Array[Double]): js.Object = js.native
  def getCoordinates(): js.Array[js.Array[js.Array[js.Array[Double]]]] = js.native
  def getFillRule(): evenOdd | nonZero = js.native
  def getLength(): Double = js.native
}

object IPixelMultiPolygonGeometry {
  @scala.inline
  def apply(
    contains: js.Array[Double] => Boolean,
    equals: IPixelGeometry => Boolean,
    events: IEventManager,
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
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), equals = js.Any.fromFunction1(equals), events = events.asInstanceOf[js.Any], getBounds = js.Any.fromFunction0(getBounds), getClosest = js.Any.fromFunction1(getClosest), getCoordinates = js.Any.fromFunction0(getCoordinates), getFillRule = js.Any.fromFunction0(getFillRule), getLength = js.Any.fromFunction0(getLength), getMetaData = js.Any.fromFunction0(getMetaData), getType = js.Any.fromFunction0(getType), scale = js.Any.fromFunction1(scale), shift = js.Any.fromFunction1(shift))
    __obj.asInstanceOf[IPixelMultiPolygonGeometry]
  }
  @scala.inline
  implicit class IPixelMultiPolygonGeometryOps[Self <: IPixelMultiPolygonGeometry] (val x: Self) extends AnyVal {
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
    def setContains(value: js.Array[Double] => Boolean): Self = this.set("contains", js.Any.fromFunction1(value))
    @scala.inline
    def setGetClosest(value: js.Array[Double] => js.Object): Self = this.set("getClosest", js.Any.fromFunction1(value))
    @scala.inline
    def setGetCoordinates(value: () => js.Array[js.Array[js.Array[js.Array[Double]]]]): Self = this.set("getCoordinates", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFillRule(value: () => evenOdd | nonZero): Self = this.set("getFillRule", js.Any.fromFunction0(value))
    @scala.inline
    def setGetLength(value: () => Double): Self = this.set("getLength", js.Any.fromFunction0(value))
  }
  
}

