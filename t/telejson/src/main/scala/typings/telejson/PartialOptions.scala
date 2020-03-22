package typings.telejson

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<telejson.telejson.Options> */
trait PartialOptions extends js.Object {
  var allowClass: js.UndefOr[Boolean] = js.undefined
  var allowDate: js.UndefOr[Boolean] = js.undefined
  var allowFunction: js.UndefOr[Boolean] = js.undefined
  var allowRegExp: js.UndefOr[Boolean] = js.undefined
  var allowSymbol: js.UndefOr[Boolean] = js.undefined
  var allowUndefined: js.UndefOr[Boolean] = js.undefined
  var lazyEval: js.UndefOr[Boolean] = js.undefined
  var maxDepth: js.UndefOr[Double] = js.undefined
  var space: js.UndefOr[Double] = js.undefined
}

object PartialOptions {
  @scala.inline
  def apply(
    allowClass: js.UndefOr[Boolean] = js.undefined,
    allowDate: js.UndefOr[Boolean] = js.undefined,
    allowFunction: js.UndefOr[Boolean] = js.undefined,
    allowRegExp: js.UndefOr[Boolean] = js.undefined,
    allowSymbol: js.UndefOr[Boolean] = js.undefined,
    allowUndefined: js.UndefOr[Boolean] = js.undefined,
    lazyEval: js.UndefOr[Boolean] = js.undefined,
    maxDepth: Int | Double = null,
    space: Int | Double = null
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClass)) __obj.updateDynamic("allowClass")(allowClass.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDate)) __obj.updateDynamic("allowDate")(allowDate.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFunction)) __obj.updateDynamic("allowFunction")(allowFunction.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRegExp)) __obj.updateDynamic("allowRegExp")(allowRegExp.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSymbol)) __obj.updateDynamic("allowSymbol")(allowSymbol.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUndefined)) __obj.updateDynamic("allowUndefined")(allowUndefined.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyEval)) __obj.updateDynamic("lazyEval")(lazyEval.asInstanceOf[js.Any])
    if (maxDepth != null) __obj.updateDynamic("maxDepth")(maxDepth.asInstanceOf[js.Any])
    if (space != null) __obj.updateDynamic("space")(space.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

