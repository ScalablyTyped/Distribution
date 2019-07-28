package typings.vscodeDashLanguageserverDashTypes.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRange extends js.Object {
  /**
    * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
    */
  var endCharacter: js.UndefOr[Double] = js.undefined
  /**
    * The zero-based line number where the folded range ends.
    */
  var endLine: Double
  /**
    * Describes the kind of the folding range such as `comment' or 'region'. The kind
    * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[String] = js.undefined
  /**
    * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
    */
  var startCharacter: js.UndefOr[Double] = js.undefined
  /**
    * The zero-based line number from where the folded range starts.
    */
  var startLine: Double
}

object FoldingRange {
  @scala.inline
  def apply(
    endLine: Double,
    startLine: Double,
    endCharacter: Int | Double = null,
    kind: String = null,
    startCharacter: Int | Double = null
  ): FoldingRange = {
    val __obj = js.Dynamic.literal(endLine = endLine, startLine = startLine)
    if (endCharacter != null) __obj.updateDynamic("endCharacter")(endCharacter.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (startCharacter != null) __obj.updateDynamic("startCharacter")(startCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
}

