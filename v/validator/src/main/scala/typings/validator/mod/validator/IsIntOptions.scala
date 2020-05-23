package typings.validator.mod.validator

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
    gt: js.UndefOr[Double] = js.undefined,
    lt: js.UndefOr[Double] = js.undefined,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined
  ): IsIntOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allow_leading_zeroes)) __obj.updateDynamic("allow_leading_zeroes")(allow_leading_zeroes.get.asInstanceOf[js.Any])
    if (!js.isUndefined(gt)) __obj.updateDynamic("gt")(gt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(lt)) __obj.updateDynamic("lt")(lt.get.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsIntOptions]
  }
}

