package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentRange extends TextRange {
  var hasTrailingNewLine: js.UndefOr[scala.Boolean] = js.undefined
  var kind: CommentKind
}

object CommentRange {
  @scala.inline
  def apply(
    end: scala.Double,
    kind: CommentKind,
    pos: scala.Double,
    hasTrailingNewLine: js.UndefOr[scala.Boolean] = js.undefined
  ): CommentRange = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("pos")(pos)
    if (!js.isUndefined(hasTrailingNewLine)) __obj.updateDynamic("hasTrailingNewLine")(hasTrailingNewLine)
    __obj.asInstanceOf[CommentRange]
  }
}

