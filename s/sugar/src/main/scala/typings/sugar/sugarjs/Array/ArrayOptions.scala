package typings.sugar.sugarjs.Array

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions extends js.Object {
  var sortCollate: js.UndefOr[js.Function] = js.undefined
  var sortEquivalents: js.UndefOr[js.Object] = js.undefined
  var sortIgnore: js.UndefOr[typings.std.RegExp] = js.undefined
  var sortIgnoreCase: js.UndefOr[Boolean] = js.undefined
  var sortNatural: js.UndefOr[Boolean] = js.undefined
  var sortOrder: js.UndefOr[String] = js.undefined
}

object ArrayOptions {
  @scala.inline
  def apply(
    sortCollate: js.Function = null,
    sortEquivalents: js.Object = null,
    sortIgnore: typings.std.RegExp = null,
    sortIgnoreCase: js.UndefOr[Boolean] = js.undefined,
    sortNatural: js.UndefOr[Boolean] = js.undefined,
    sortOrder: String = null
  ): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (sortCollate != null) __obj.updateDynamic("sortCollate")(sortCollate)
    if (sortEquivalents != null) __obj.updateDynamic("sortEquivalents")(sortEquivalents)
    if (sortIgnore != null) __obj.updateDynamic("sortIgnore")(sortIgnore)
    if (!js.isUndefined(sortIgnoreCase)) __obj.updateDynamic("sortIgnoreCase")(sortIgnoreCase)
    if (!js.isUndefined(sortNatural)) __obj.updateDynamic("sortNatural")(sortNatural)
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder)
    __obj.asInstanceOf[ArrayOptions]
  }
}

