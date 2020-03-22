package typings.textBuffer

import typings.textBuffer.mod._Global_.TextBuffer.PointCompatible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<text-buffer.text-buffer._Global_.TextBuffer.Point> */
trait ReadonlyPointColumn extends js.Object {
  val column: Double
  val row: Double
  def compare(other: PointCompatible): Double
  def copy(): this.type
  def freeze(): ReadonlyPoint
  def isEqual(other: PointCompatible): Boolean
  def isGreaterThan(other: PointCompatible): Boolean
  def isGreaterThanOrEqual(other: PointCompatible): Boolean
  def isLessThan(other: PointCompatible): Boolean
  def isLessThanOrEqual(other: PointCompatible): Boolean
  def negate(): this.type
  def serialize(): js.Tuple2[Double, Double]
  def toArray(): js.Tuple2[Double, Double]
  def translate(other: PointCompatible): this.type
  def traverse(other: PointCompatible): this.type
}

object ReadonlyPointColumn {
  @scala.inline
  def apply(
    column: Double,
    compare: PointCompatible => Double,
    copy: () => ReadonlyPointColumn,
    freeze: () => ReadonlyPoint,
    isEqual: PointCompatible => Boolean,
    isGreaterThan: PointCompatible => Boolean,
    isGreaterThanOrEqual: PointCompatible => Boolean,
    isLessThan: PointCompatible => Boolean,
    isLessThanOrEqual: PointCompatible => Boolean,
    negate: () => ReadonlyPointColumn,
    row: Double,
    serialize: () => js.Tuple2[Double, Double],
    toArray: () => js.Tuple2[Double, Double],
    translate: PointCompatible => ReadonlyPointColumn,
    traverse: PointCompatible => ReadonlyPointColumn
  ): ReadonlyPointColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], compare = js.Any.fromFunction1(compare), copy = js.Any.fromFunction0(copy), freeze = js.Any.fromFunction0(freeze), isEqual = js.Any.fromFunction1(isEqual), isGreaterThan = js.Any.fromFunction1(isGreaterThan), isGreaterThanOrEqual = js.Any.fromFunction1(isGreaterThanOrEqual), isLessThan = js.Any.fromFunction1(isLessThan), isLessThanOrEqual = js.Any.fromFunction1(isLessThanOrEqual), negate = js.Any.fromFunction0(negate), row = row.asInstanceOf[js.Any], serialize = js.Any.fromFunction0(serialize), toArray = js.Any.fromFunction0(toArray), translate = js.Any.fromFunction1(translate), traverse = js.Any.fromFunction1(traverse))
  
    __obj.asInstanceOf[ReadonlyPointColumn]
  }
}

