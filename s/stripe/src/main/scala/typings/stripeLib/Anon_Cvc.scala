package typings
package stripeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Cvc extends js.Object {
  var cvc: js.UndefOr[java.lang.String] = js.undefined
  var exp_month: scala.Double
  var exp_year: scala.Double
  var number: java.lang.String
}

object Anon_Cvc {
  @scala.inline
  def apply(
    exp_month: scala.Double,
    exp_year: scala.Double,
    number: java.lang.String,
    cvc: java.lang.String = null
  ): Anon_Cvc = {
    val __obj = js.Dynamic.literal(exp_month = exp_month, exp_year = exp_year, number = number)
    if (cvc != null) __obj.updateDynamic("cvc")(cvc)
    __obj.asInstanceOf[Anon_Cvc]
  }
}

