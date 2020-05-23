package typings.validator.mod.validator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsFloatOptions extends js.Object {
  /**
    * greater than
    */
  var gt: js.UndefOr[Double] = js.undefined
  /**
    * FloatLocale
    */
  var locale: js.UndefOr[FloatLocale] = js.undefined
  /**
    * less than
    */
  var lt: js.UndefOr[Double] = js.undefined
  /**
    * greater or equal
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * less or equal
    */
  var min: js.UndefOr[Double] = js.undefined
}

object IsFloatOptions {
  @scala.inline
  def apply(
    gt: js.UndefOr[Double] = js.undefined,
    locale: FloatLocale = null,
    lt: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFloatOptions]
  }
}

