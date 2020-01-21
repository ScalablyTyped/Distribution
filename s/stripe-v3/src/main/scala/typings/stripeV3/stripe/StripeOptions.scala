package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StripeOptions extends js.Object {
  var betas: js.UndefOr[js.Array[String]] = js.undefined
  var locale: js.UndefOr[String] = js.undefined
  var stripeAccount: js.UndefOr[String] = js.undefined
}

object StripeOptions {
  @scala.inline
  def apply(betas: js.Array[String] = null, locale: String = null, stripeAccount: String = null): StripeOptions = {
    val __obj = js.Dynamic.literal()
    if (betas != null) __obj.updateDynamic("betas")(betas.asInstanceOf[js.Any])
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (stripeAccount != null) __obj.updateDynamic("stripeAccount")(stripeAccount.asInstanceOf[js.Any])
    __obj.asInstanceOf[StripeOptions]
  }
}

