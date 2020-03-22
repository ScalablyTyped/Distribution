package typings.textBuffer

import typings.textBuffer.mod._Global_.TextBuffer.PointCompatible
import typings.textBuffer.mod._Global_.TextBuffer.PointLike
import typings.textBuffer.mod._Global_.TextBuffer.RangeCompatible
import typings.textBuffer.mod._Global_.TextBuffer.RangeLike
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Readonly<text-buffer.text-buffer._Global_.TextBuffer.Range> */
@js.native
trait ReadonlyRangeContainsPoint extends js.Object {
  val end: PointLike = js.native
  val start: PointLike = js.native
  def compare(otherRange: RangeCompatible): Double = js.native
  def containsPoint(point: PointCompatible): Boolean = js.native
  def containsPoint(point: PointCompatible, exclusive: Boolean): Boolean = js.native
  def containsRange(otherRange: RangeCompatible): Boolean = js.native
  def containsRange(otherRange: RangeCompatible, exclusive: Boolean): Boolean = js.native
  def copy(): this.type = js.native
  def coversSameRows(otherRange: RangeLike): Boolean = js.native
  def freeze(): ReadonlyRangeCompare = js.native
  def getRowCount(): Double = js.native
  def getRows(): js.Array[Double] = js.native
  def intersectsRow(row: Double): Boolean = js.native
  def intersectsRowRange(startRow: Double, endRow: Double): Boolean = js.native
  def intersectsWith(otherRange: RangeLike): Boolean = js.native
  def intersectsWith(otherRange: RangeLike, exclusive: Boolean): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def isEqual(otherRange: RangeCompatible): Boolean = js.native
  def isSingleLine(): Boolean = js.native
  def negate(): this.type = js.native
  def serialize(): js.Array[js.Array[Double]] = js.native
  def translate(startDelta: PointCompatible): this.type = js.native
  def translate(startDelta: PointCompatible, endDelta: PointCompatible): this.type = js.native
  def traverse(delta: PointCompatible): this.type = js.native
  def union(other: RangeLike): this.type = js.native
}

