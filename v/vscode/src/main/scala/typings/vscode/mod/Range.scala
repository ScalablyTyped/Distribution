package typings.vscode.mod

import typings.vscode.AnonEnd
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "Range")
@js.native
class Range protected () extends js.Object {
  /**
  		 * Create a new range from two positions. If `start` is not
  		 * before or equal to `end`, the values will be swapped.
  		 *
  		 * @param start A position.
  		 * @param end A position.
  		 */
  def this(start: Position, end: Position) = this()
  /**
  		 * Create a new range from number coordinates. It is a shorter equivalent of
  		 * using `new Range(new Position(startLine, startCharacter), new Position(endLine, endCharacter))`
  		 *
  		 * @param startLine A zero-based line value.
  		 * @param startCharacter A zero-based character value.
  		 * @param endLine A zero-based line value.
  		 * @param endCharacter A zero-based character value.
  		 */
  def this(startLine: Double, startCharacter: Double, endLine: Double, endCharacter: Double) = this()
  /**
  		 * The end position. It is after or equal to [start](#Range.start).
  		 */
  val end: Position = js.native
  /**
  		 * `true` if `start` and `end` are equal.
  		 */
  var isEmpty: Boolean = js.native
  /**
  		 * `true` if `start.line` and `end.line` are equal.
  		 */
  var isSingleLine: Boolean = js.native
  /**
  		 * The start position. It is before or equal to [end](#Range.end).
  		 */
  val start: Position = js.native
  /**
  		 * Check if a position or a range is contained in this range.
  		 *
  		 * @param positionOrRange A position or a range.
  		 * @return `true` if the position or range is inside or equal
  		 * to this range.
  		 */
  def contains(positionOrRange: Position): Boolean = js.native
  def contains(positionOrRange: Range): Boolean = js.native
  /**
  		 * Intersect `range` with this range and returns a new range or `undefined`
  		 * if the ranges have no overlap.
  		 *
  		 * @param range A range.
  		 * @return A range of the greater start and smaller end positions. Will
  		 * return undefined when there is no overlap.
  		 */
  def intersection(range: Range): js.UndefOr[Range] = js.native
  /**
  		 * Check if `other` equals this range.
  		 *
  		 * @param other A range.
  		 * @return `true` when start and end are [equal](#Position.isEqual) to
  		 * start and end of this range.
  		 */
  def isEqual(other: Range): Boolean = js.native
  /**
  		 * Compute the union of `other` with this range.
  		 *
  		 * @param other A range.
  		 * @return A range of smaller start position and the greater end position.
  		 */
  def union(other: Range): Range = js.native
  /**
  		 * Derived a new range from this range.
  		 *
  		 * @param start A position that should be used as start. The default value is the [current start](#Range.start).
  		 * @param end A position that should be used as end. The default value is the [current end](#Range.end).
  		 * @return A range derived from this range with the given start and end position.
  		 * If start and end are not different `this` range will be returned.
  		 */
  def `with`(): Range = js.native
  /**
  		 * Derived a new range from this range.
  		 *
  		 * @param change An object that describes a change to this range.
  		 * @return A range that reflects the given change. Will return `this` range if the change
  		 * is not changing anything.
  		 */
  def `with`(change: AnonEnd): Range = js.native
  def `with`(start: Position): Range = js.native
  def `with`(start: Position, end: Position): Range = js.native
}

