package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Expmonth extends js.Object {
  var exp_month: js.UndefOr[Double] = js.undefined
  var exp_year: js.UndefOr[Double] = js.undefined
}

object Anon_Expmonth {
  @scala.inline
  def apply(exp_month: Int | Double = null, exp_year: Int | Double = null): Anon_Expmonth = {
    val __obj = js.Dynamic.literal()
    if (exp_month != null) __obj.updateDynamic("exp_month")(exp_month.asInstanceOf[js.Any])
    if (exp_year != null) __obj.updateDynamic("exp_year")(exp_year.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Expmonth]
  }
}

