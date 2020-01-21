package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExpmonth extends js.Object {
  var exp_month: js.UndefOr[Double] = js.undefined
  var exp_year: js.UndefOr[Double] = js.undefined
}

object AnonExpmonth {
  @scala.inline
  def apply(exp_month: Int | Double = null, exp_year: Int | Double = null): AnonExpmonth = {
    val __obj = js.Dynamic.literal()
    if (exp_month != null) __obj.updateDynamic("exp_month")(exp_month.asInstanceOf[js.Any])
    if (exp_year != null) __obj.updateDynamic("exp_year")(exp_year.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonExpmonth]
  }
}

