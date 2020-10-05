package typings.yandexMaps.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShape extends js.Object {
  def contains(position: js.Array[Double]): Boolean = js.native
  def equals(shape: IShape): Boolean = js.native
  def getBounds(): js.Array[js.Array[Double]] | Null = js.native
  def getGeometry(): IPixelGeometry = js.native
  def getType(): String = js.native
  def scale(factor: Double): IShape = js.native
  def shift(offset: js.Array[Double]): IShape = js.native
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
  @scala.inline
  implicit class IShapeOps[Self <: IShape] (val x: Self) extends AnyVal {
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
    def setEquals(value: IShape => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    @scala.inline
    def setGetBounds(value: () => js.Array[js.Array[Double]] | Null): Self = this.set("getBounds", js.Any.fromFunction0(value))
    @scala.inline
    def setGetGeometry(value: () => IPixelGeometry): Self = this.set("getGeometry", js.Any.fromFunction0(value))
    @scala.inline
    def setGetType(value: () => String): Self = this.set("getType", js.Any.fromFunction0(value))
    @scala.inline
    def setScale(value: Double => IShape): Self = this.set("scale", js.Any.fromFunction1(value))
    @scala.inline
    def setShift(value: js.Array[Double] => IShape): Self = this.set("shift", js.Any.fromFunction1(value))
  }
  
}

