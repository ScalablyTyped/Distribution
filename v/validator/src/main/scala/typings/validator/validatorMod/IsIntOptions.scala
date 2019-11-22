package typings.validator.validatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsIntOptions extends js.Object {
  /**
    * if `false`, will disallow integer values with leading zeroes
    * @default true
    */
  var allow_leading_zeroes: js.UndefOr[Boolean] = js.undefined
  /**
    * enforce integers being less than the value provided
    */
  var gt: js.UndefOr[Double] = js.undefined
  /**
    * enforce integers being greater than the value provided
    */
  var lt: js.UndefOr[Double] = js.undefined
  /**
    * to check the integer max boundary
    */
  var max: js.UndefOr[Double] = js.undefined
  /**
    * to check the integer min boundary
    */
  var min: js.UndefOr[Double] = js.undefined
}

object IsIntOptions {
  @scala.inline
  def apply(
    allow_leading_zeroes: js.UndefOr[Boolean] = js.undefined,
    gt: Int | Double = null,
    lt: Int | Double = null,
    max: Int | Double = null,
    min: Int | Double = null
  ): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_leading_zeroes)) __obj.updateDynamic("allow_leading_zeroes")(allow_leading_zeroes)
    if (gt != null) __obj.updateDynamic("gt")(gt.asInstanceOf[js.Any])
    if (lt != null) __obj.updateDynamic("lt")(lt.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIntOptions]
  }
}

