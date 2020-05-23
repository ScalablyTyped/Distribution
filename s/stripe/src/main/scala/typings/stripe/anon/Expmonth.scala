package typings.stripe.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Expmonth extends js.Object {
  var exp_month: js.UndefOr[Double] = js.undefined
  var exp_year: js.UndefOr[Double] = js.undefined
}

object Expmonth {
  @scala.inline
  def apply(exp_month: js.UndefOr[Double] = js.undefined, exp_year: js.UndefOr[Double] = js.undefined): Expmonth = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(exp_month)) __obj.updateDynamic("exp_month")(exp_month.get.asInstanceOf[js.Any])
    if (!js.isUndefined(exp_year)) __obj.updateDynamic("exp_year")(exp_year.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Expmonth]
  }
}

