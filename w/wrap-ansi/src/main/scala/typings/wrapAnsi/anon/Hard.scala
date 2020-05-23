package typings.wrapAnsi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Hard extends js.Object {
  var hard: js.UndefOr[Boolean] = js.undefined
  var trim: js.UndefOr[Boolean] = js.undefined
  var wordWrap: js.UndefOr[Boolean] = js.undefined
}

object Hard {
  @scala.inline
  def apply(
    hard: js.UndefOr[Boolean] = js.undefined,
    trim: js.UndefOr[Boolean] = js.undefined,
    wordWrap: js.UndefOr[Boolean] = js.undefined
  ): Hard = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hard)) __obj.updateDynamic("hard")(hard.get.asInstanceOf[js.Any])
    if (!js.isUndefined(trim)) __obj.updateDynamic("trim")(trim.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wordWrap)) __obj.updateDynamic("wordWrap")(wordWrap.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Hard]
  }
}

