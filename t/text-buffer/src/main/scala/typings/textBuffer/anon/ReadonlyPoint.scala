package typings.textBuffer.anon

import typings.textBuffer.mod.global.TextBuffer.PointCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<text-buffer.text-buffer.<global>.TextBuffer.Point> */
@js.native
trait ReadonlyPoint extends js.Object {
  val column: Double = js.native
  val row: Double = js.native
  def compare(other: PointCompatible): Double = js.native
  def copy(): this.type = js.native
  def freeze(): this.type = js.native
  def isEqual(other: PointCompatible): Boolean = js.native
  def isGreaterThan(other: PointCompatible): Boolean = js.native
  def isGreaterThanOrEqual(other: PointCompatible): Boolean = js.native
  def isLessThan(other: PointCompatible): Boolean = js.native
  def isLessThanOrEqual(other: PointCompatible): Boolean = js.native
  def negate(): this.type = js.native
  def serialize(): js.Tuple2[Double, Double] = js.native
  def toArray(): js.Tuple2[Double, Double] = js.native
  def translate(other: PointCompatible): this.type = js.native
  def traverse(other: PointCompatible): this.type = js.native
}

object ReadonlyPoint {
  @scala.inline
  def apply(
    column: Double,
    compare: PointCompatible => Double,
    copy: () => ReadonlyPoint,
    freeze: () => ReadonlyPoint,
    isEqual: PointCompatible => Boolean,
    isGreaterThan: PointCompatible => Boolean,
    isGreaterThanOrEqual: PointCompatible => Boolean,
    isLessThan: PointCompatible => Boolean,
    isLessThanOrEqual: PointCompatible => Boolean,
    negate: () => ReadonlyPoint,
    row: Double,
    serialize: () => js.Tuple2[Double, Double],
    toArray: () => js.Tuple2[Double, Double],
    translate: PointCompatible => ReadonlyPoint,
    traverse: PointCompatible => ReadonlyPoint
  ): ReadonlyPoint = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction0(copy), freeze = js.Any.fromFunction0(freeze), isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = js.Any.fromFunction0(negate), row = row.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), toArray = js.Any.fromFunction0(toArray), translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
    __obj.asInstanceOf[ReadonlyPoint]
  }
  @scala.inline
  implicit class ReadonlyPointOps[Self <: ReadonlyPoint] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompare(value: PointCompatible => Double): Self = this.set("compare", js.Any.fromFunction1(value))
    @scala.inline
    def setCopy(value: () => ReadonlyPoint): Self = this.set("copy", js.Any.fromFunction0(value))
    @scala.inline
    def setFreeze(value: () => ReadonlyPoint): Self = this.set("freeze", js.Any.fromFunction0(value))
    @scala.inline
    def setIsEqual(value: PointCompatible => Boolean): Self = this.set("isEqual", js.Any.fromFunction1(value))
    @scala.inline
    def setIsGreaterThan(value: PointCompatible => Boolean): Self = this.set("isGreaterThan", js.Any.fromFunction1(value))
    @scala.inline
    def setIsGreaterThanOrEqual(value: PointCompatible => Boolean): Self = this.set("isGreaterThanOrEqual", js.Any.fromFunction1(value))
    @scala.inline
    def setIsLessThan(value: PointCompatible => Boolean): Self = this.set("isLessThan", js.Any.fromFunction1(value))
    @scala.inline
    def setIsLessThanOrEqual(value: PointCompatible => Boolean): Self = this.set("isLessThanOrEqual", js.Any.fromFunction1(value))
    @scala.inline
    def setNegate(value: () => ReadonlyPoint): Self = this.set("negate", js.Any.fromFunction0(value))
    @scala.inline
    def setRow(value: Double): Self = this.set("row", value.asInstanceOf[js.Any])
    @scala.inline
    def setSerialize(value: () => js.Tuple2[Double, Double]): Self = this.set("serialize", js.Any.fromFunction0(value))
    @scala.inline
    def setToArray(value: () => js.Tuple2[Double, Double]): Self = this.set("toArray", js.Any.fromFunction0(value))
    @scala.inline
    def setTranslate(value: PointCompatible => ReadonlyPoint): Self = this.set("translate", js.Any.fromFunction1(value))
    @scala.inline
    def setTraverse(value: PointCompatible => ReadonlyPoint): Self = this.set("traverse", js.Any.fromFunction1(value))
  }
  
}

