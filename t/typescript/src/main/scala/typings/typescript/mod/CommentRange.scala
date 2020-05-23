package typings.typescript.mod

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
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    if (!js.isUndefined(hasTrailingNewLine)) __obj.updateDynamic("hasTrailingNewLine")(hasTrailingNewLine.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentRange]
  }
}

