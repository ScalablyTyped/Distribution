package typings.sugar.sugarjs.Array

import typings.sugar.Function
import typings.sugar.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions extends js.Object {
  var sortCollate: js.UndefOr[Function] = js.undefined
  var sortEquivalents: js.UndefOr[js.Object] = js.undefined
  var sortIgnore: js.UndefOr[RegExp] = js.undefined
  var sortIgnoreCase: js.UndefOr[Boolean] = js.undefined
  var sortNatural: js.UndefOr[Boolean] = js.undefined
  var sortOrder: js.UndefOr[String] = js.undefined
}

object ArrayOptions {
  @scala.inline
  def apply(
    sortCollate: Function = null,
    sortEquivalents: js.Object = null,
    sortIgnore: RegExp = null,
    sortIgnoreCase: js.UndefOr[Boolean] = js.undefined,
    sortNatural: js.UndefOr[Boolean] = js.undefined,
    sortOrder: String = null
  ): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (sortCollate != null) __obj.updateDynamic("sortCollate")(sortCollate.asInstanceOf[js.Any])
    if (sortEquivalents != null) __obj.updateDynamic("sortEquivalents")(sortEquivalents.asInstanceOf[js.Any])
    if (sortIgnore != null) __obj.updateDynamic("sortIgnore")(sortIgnore.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIgnoreCase)) __obj.updateDynamic("sortIgnoreCase")(sortIgnoreCase.get.asInstanceOf[js.Any])
    if (!js.isUndefined(sortNatural)) __obj.updateDynamic("sortNatural")(sortNatural.get.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptions]
  }
}

