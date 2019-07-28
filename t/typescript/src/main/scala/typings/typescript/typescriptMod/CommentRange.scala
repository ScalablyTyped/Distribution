package typings.typescript.typescriptMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentRange extends TextRange {
  var hasTrailingNewLine: js.UndefOr[Boolean] = js.undefined
  var kind: CommentKind
}

object CommentRange {
  @scala.inline
  def apply(
    end: Double,
    kind: CommentKind,
    pos: Double,
    hasTrailingNewLine: js.UndefOr[Boolean] = js.undefined
  ): CommentRange = {
    val __obj = js.Dynamic.literal(end = end, kind = kind, pos = pos)
    if (!js.isUndefined(hasTrailingNewLine)) __obj.updateDynamic("hasTrailingNewLine")(hasTrailingNewLine)
    __obj.asInstanceOf[CommentRange]
  }
}

