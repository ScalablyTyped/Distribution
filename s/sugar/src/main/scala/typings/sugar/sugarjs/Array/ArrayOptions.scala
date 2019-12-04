package typings.sugar.sugarjs.Array

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ArrayOptions extends js.Object {
  var sortCollate: js.UndefOr[typings.sugar.Function] = js.undefined
  var sortEquivalents: js.UndefOr[js.Object] = js.undefined
  var sortIgnore: js.UndefOr[typings.sugar.RegExp] = js.undefined
  var sortIgnoreCase: js.UndefOr[Boolean] = js.undefined
  var sortNatural: js.UndefOr[Boolean] = js.undefined
  var sortOrder: js.UndefOr[java.lang.String] = js.undefined
}

object ArrayOptions {
  @scala.inline
  def apply(
    sortCollate: typings.sugar.Function = null,
    sortEquivalents: js.Object = null,
    sortIgnore: typings.sugar.RegExp = null,
    sortIgnoreCase: js.UndefOr[Boolean] = js.undefined,
    sortNatural: js.UndefOr[Boolean] = js.undefined,
    sortOrder: java.lang.String = null
  ): ArrayOptions = {
    val __obj = js.Dynamic.literal()
    if (sortCollate != null) __obj.updateDynamic("sortCollate")(sortCollate.asInstanceOf[js.Any])
    if (sortEquivalents != null) __obj.updateDynamic("sortEquivalents")(sortEquivalents.asInstanceOf[js.Any])
    if (sortIgnore != null) __obj.updateDynamic("sortIgnore")(sortIgnore.asInstanceOf[js.Any])
    if (!js.isUndefined(sortIgnoreCase)) __obj.updateDynamic("sortIgnoreCase")(sortIgnoreCase.asInstanceOf[js.Any])
    if (!js.isUndefined(sortNatural)) __obj.updateDynamic("sortNatural")(sortNatural.asInstanceOf[js.Any])
    if (sortOrder != null) __obj.updateDynamic("sortOrder")(sortOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArrayOptions]
  }
}

