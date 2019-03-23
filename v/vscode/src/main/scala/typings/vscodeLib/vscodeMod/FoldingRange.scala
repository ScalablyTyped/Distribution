package typings
package vscodeLib.vscodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("vscode", "FoldingRange")
@js.native
class FoldingRange protected () extends js.Object {
  /**
  		 * Creates a new folding range.
  		 *
  		 * @param start The start line of the folded range.
  		 * @param end The end line of the folded range.
  		 * @param kind The kind of the folding range.
  		 */
  def this(start: scala.Double, end: scala.Double) = this()
  def this(start: scala.Double, end: scala.Double, kind: FoldingRangeKind) = this()
  /**
  		 * The zero-based end line of the range to fold. The folded area ends with the line's last character.
  		 * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
  		 */
  var end: scala.Double = js.native
  /**
  		 * Describes the [Kind](#FoldingRangeKind) of the folding range such as [Comment](#FoldingRangeKind.Comment) or
  		 * [Region](#FoldingRangeKind.Region). The kind is used to categorize folding ranges and used by commands
  		 * like 'Fold all comments'. See
  		 * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of all kinds.
  		 */
  var kind: js.UndefOr[FoldingRangeKind] = js.native
  /**
  		 * The zero-based start line of the range to fold. The folded area starts after the line's last character.
  		 * To be valid, the end must be zero or larger and smaller than the number of lines in the document.
  		 */
  var start: scala.Double = js.native
}

