package typings
package typescriptLib.typescriptMod.tsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SynthesizedComment extends CommentRange {
  @JSName("end")
  var end_SynthesizedComment: typescriptLib.typescriptLibNumbers.`-1`
  @JSName("pos")
  var pos_SynthesizedComment: typescriptLib.typescriptLibNumbers.`-1`
  var text: java.lang.String
}

object SynthesizedComment {
  @scala.inline
  def apply(
    end: typescriptLib.typescriptLibNumbers.`-1`,
    kind: CommentKind,
    pos: typescriptLib.typescriptLibNumbers.`-1`,
    text: java.lang.String,
    hasTrailingNewLine: js.UndefOr[scala.Boolean] = js.undefined
  ): SynthesizedComment = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("end")(end)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("text")(text)
    if (!js.isUndefined(hasTrailingNewLine)) __obj.updateDynamic("hasTrailingNewLine")(hasTrailingNewLine)
    __obj.asInstanceOf[SynthesizedComment]
  }
}

