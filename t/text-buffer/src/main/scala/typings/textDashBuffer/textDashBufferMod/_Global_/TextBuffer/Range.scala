package typings.textDashBuffer.textDashBufferMod._Global_.TextBuffer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Represents a region in a buffer in row/column coordinates. */
@js.native
trait Range extends js.Object {
  /** A Point representing the end of the Range. */
  var end: PointLike = js.native
  // Properties
  /** A Point representing the start of the Range. */
  var start: PointLike = js.native
  // Comparison
  /**
    *  Compare two Ranges.
    *  Returns -1 if this range starts before the argument or contains it.
    *  Returns 0 if this range is equivalent to the argument.
    *  Returns 1 if this range starts after the argument or is contained by it.
    */
  def compare(otherRange: RangeCompatible): Double = js.native
  /** Returns a boolean indicating whether this range contains the given point. */
  def containsPoint(point: PointCompatible): Boolean = js.native
  def containsPoint(point: PointCompatible, exclusive: Boolean): Boolean = js.native
  /** Returns a boolean indicating whether this range contains the given range. */
  def containsRange(otherRange: RangeCompatible): Boolean = js.native
  def containsRange(otherRange: RangeCompatible, exclusive: Boolean): Boolean = js.native
  // Construction
  /** Returns a new range with the same start and end positions. */
  def copy(): Range = js.native
  // NOTE: this function doesn't actually take a range-compatible parameter.
  /**
    *  Returns a Boolean indicating whether this range starts and ends on the
    *  same row as the argument.
    */
  def coversSameRows(otherRange: RangeLike): Boolean = js.native
  // Operations
  /**
    *  Freezes the range and its start and end point so it becomes immutable
    *  and returns itself.
    */
  def freeze(): Range = js.native
  /** Get the number of rows in this range. */
  def getRowCount(): Double = js.native
  /** Returns an array of all rows in the range. */
  def getRows(): js.Array[Double] = js.native
  /**
    *  Returns a boolean indicating whether this range intersects the given
    *  row number.
    */
  def intersectsRow(row: Double): Boolean = js.native
  /**
    *  Returns a boolean indicating whether this range intersects the row range
    *  indicated by the given startRow and endRow numbers.
    */
  def intersectsRowRange(startRow: Double, endRow: Double): Boolean = js.native
  // NOTE: this function doesn't actually take a range-compatible parameter.
  /** Determines whether this range intersects with the argument. */
  def intersectsWith(otherRange: RangeLike): Boolean = js.native
  def intersectsWith(otherRange: RangeLike, exclusive: Boolean): Boolean = js.native
  // Range Details
  /** Is the start position of this range equal to the end position? */
  def isEmpty(): Boolean = js.native
  /**
    *  Returns a Boolean indicating whether this range has the same start and
    *  end points as the given Range.
    */
  def isEqual(otherRange: RangeCompatible): Boolean = js.native
  /**
    *  Returns a boolean indicating whether this range starts and ends on the
    *  same row.
    */
  def isSingleLine(): Boolean = js.native
  /** Returns a new range with the start and end positions negated. */
  def negate(): Range = js.native
  // Serialization and Deserialization
  /** Returns a plain javascript object representation of the range. */
  def serialize(): js.Array[js.Array[Double]] = js.native
  /**
    *  Build and return a new range by translating this range's start and end
    *  points by the given delta(s).
    */
  def translate(startDelta: PointCompatible): Range = js.native
  def translate(startDelta: PointCompatible, endDelta: PointCompatible): Range = js.native
  /**
    *  Build and return a new range by traversing this range's start and end
    *  points by the given delta.
    */
  def traverse(delta: PointCompatible): Range = js.native
  // NOTE: this function doesn't actually take a range-compatible parameter.
  /** Returns a new range that contains this range and the given range. */
  def union(other: RangeLike): Range = js.native
}

