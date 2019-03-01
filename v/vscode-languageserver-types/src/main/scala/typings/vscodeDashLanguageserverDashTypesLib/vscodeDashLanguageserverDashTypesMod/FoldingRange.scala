package typings
package vscodeDashLanguageserverDashTypesLib.vscodeDashLanguageserverDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FoldingRange extends js.Object {
  /**
    * The zero-based character offset before the folded range ends. If not defined, defaults to the length of the end line.
    */
  var endCharacter: js.UndefOr[scala.Double] = js.undefined
  /**
    * The zero-based line number where the folded range ends.
    */
  var endLine: scala.Double
  /**
    * Describes the kind of the folding range such as `comment' or 'region'. The kind
    * is used to categorize folding ranges and used by commands like 'Fold all comments'. See
    * [FoldingRangeKind](#FoldingRangeKind) for an enumeration of standardized kinds.
    */
  var kind: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The zero-based character offset from where the folded range starts. If not defined, defaults to the length of the start line.
    */
  var startCharacter: js.UndefOr[scala.Double] = js.undefined
  /**
    * The zero-based line number from where the folded range starts.
    */
  var startLine: scala.Double
}

object FoldingRange {
  @scala.inline
  def apply(
    endLine: scala.Double,
    startLine: scala.Double,
    endCharacter: scala.Int | scala.Double = null,
    kind: java.lang.String = null,
    startCharacter: scala.Int | scala.Double = null
  ): FoldingRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("endLine")(endLine)
    __obj.updateDynamic("startLine")(startLine)
    if (endCharacter != null) __obj.updateDynamic("endCharacter")(endCharacter.asInstanceOf[js.Any])
    if (kind != null) __obj.updateDynamic("kind")(kind)
    if (startCharacter != null) __obj.updateDynamic("startCharacter")(startCharacter.asInstanceOf[js.Any])
    __obj.asInstanceOf[FoldingRange]
  }
}

