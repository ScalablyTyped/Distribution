package typings.stripeV3.stripe

import typings.stripeV3.AnonBillingdetails
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HandleCardSetupOptions extends js.Object {
  /**
    * Use this parameter to supply additional data relevant to
    * the payment method, such as billing details.
    */
  var payment_method_data: js.UndefOr[AnonBillingdetails] = js.undefined
}

object HandleCardSetupOptions {
  @scala.inline
  def apply(payment_method_data: AnonBillingdetails = null): HandleCardSetupOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method_data != null) __obj.updateDynamic("payment_method_data")(payment_method_data.asInstanceOf[js.Any])
    __obj.asInstanceOf[HandleCardSetupOptions]
  }
}

