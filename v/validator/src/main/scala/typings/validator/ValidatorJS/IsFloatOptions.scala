package typings.validator.ValidatorJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// options for IsFloat
trait IsFloatOptions extends js.Object {
  var gt: js.UndefOr[Double] = js.undefined
  var locale: js.UndefOr[FloatLocale] = js.undefined
  var lt: js.UndefOr[Double] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
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
    if (locale != null) __obj.updateDynamic("locale")(locale)
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsFloatOptions]
  }
}

