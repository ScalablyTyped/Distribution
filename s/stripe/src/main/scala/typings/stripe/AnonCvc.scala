package typings.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCvc extends js.Object {
  var cvc: js.UndefOr[String] = js.undefined
  var exp_month: Double
  var exp_year: Double
  var number: String
}

object AnonCvc {
  @scala.inline
  def apply(exp_month: Double, exp_year: Double, number: String, cvc: String = null): AnonCvc = {
    val __obj = js.Dynamic.literal(exp_month = exp_month.asInstanceOf[js.Any], exp_year = exp_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
    if (cvc != null) __obj.updateDynamic("cvc")(cvc.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCvc]
  }
}

