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
    gt: Int | Double = null,
    locale: FloatLocale = null,
    lt: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): IsFloatOptions = {
    val __obj = js.Dynamic.literal()
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFloatOptions]
  }
}

