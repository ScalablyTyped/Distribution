package typings
package wrapDashAnsiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Hard extends js.Object {
  var hard: js.UndefOr[scala.Boolean] = js.undefined
  var trim: js.UndefOr[scala.Boolean] = js.undefined
  var wordWrap: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Hard {
  @scala.inline
  def apply(
    hard: js.UndefOr[scala.Boolean] = js.undefined,
    trim: js.UndefOr[scala.Boolean] = js.undefined,
    wordWrap: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Hard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hard)) __obj.updateDynamic("hard")(hard)
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim)
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap)
    __obj.asInstanceOf[Anon_Hard]
  }
}

