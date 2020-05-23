package typings.telejson.anon

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
    maxDepth: js.UndefOr[Double] = js.undefined,
    space: js.UndefOr[Double] = js.undefined
  ): PartialOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowClass)) __obj.updateDynamic("allowClass")(allowClass.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowDate)) __obj.updateDynamic("allowDate")(allowDate.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowFunction)) __obj.updateDynamic("allowFunction")(allowFunction.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowRegExp)) __obj.updateDynamic("allowRegExp")(allowRegExp.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowSymbol)) __obj.updateDynamic("allowSymbol")(allowSymbol.get.asInstanceOf[js.Any])
    if (!js.isUndefined(allowUndefined)) __obj.updateDynamic("allowUndefined")(allowUndefined.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lazyEval)) __obj.updateDynamic("lazyEval")(lazyEval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxDepth)) __obj.updateDynamic("maxDepth")(maxDepth.get.asInstanceOf[js.Any])
    if (!js.isUndefined(space)) __obj.updateDynamic("space")(space.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialOptions]
  }
}

