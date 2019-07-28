package typings.typescript.typescriptMod

import typings.typescript.typescriptNumbers.`-1`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesizedComment extends CommentRange {
  @JSName("end")
  var end_SynthesizedComment: `-1`
  @JSName("pos")
  var pos_SynthesizedComment: `-1`
  var text: String
}

object SynthesizedComment {
  @scala.inline
  def apply(
    end: `-1`,
    kind: CommentKind,
    pos: `-1`,
    text: String,
    hasTrailingNewLine: js.UndefOr[Boolean] = js.undefined
  ): SynthesizedComment = {
    val __obj = js.Dynamic.literal(end = end, kind = kind, pos = pos, text = text)
    if (!js.isUndefined(hasTrailingNewLine)) __obj.updateDynamic("hasTrailingNewLine")(hasTrailingNewLine)
    __obj.asInstanceOf[SynthesizedComment]
  }
}

