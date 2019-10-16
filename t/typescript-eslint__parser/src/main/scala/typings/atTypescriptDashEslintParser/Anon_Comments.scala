package typings.atTypescriptDashEslintParser

import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Comment
import typings.atTypescriptDashEslintTypescriptDashEstree.distTsDashEstreeTsDashEstreeMod.Token
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Comments extends js.Object {
  var comments: js.UndefOr[js.Array[Comment]] = js.undefined
  var range: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
  var tokens: js.UndefOr[js.Array[Token]] = js.undefined
}

object Anon_Comments {
  @scala.inline
  def apply(
    comments: js.Array[Comment] = null,
    range: js.Tuple2[Double, Double] = null,
    tokens: js.Array[Token] = null
  ): Anon_Comments = {
    val __obj = js.Dynamic.literal()
    if (comments != null) __obj.updateDynamic("comments")(comments)
    if (range != null) __obj.updateDynamic("range")(range)
    if (tokens != null) __obj.updateDynamic("tokens")(tokens)
    __obj.asInstanceOf[Anon_Comments]
  }
}

