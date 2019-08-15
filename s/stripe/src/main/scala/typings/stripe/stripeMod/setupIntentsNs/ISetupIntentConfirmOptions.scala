package typings.stripe.stripeMod.setupIntentsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentConfirmOptions extends js.Object {
  /**
    * ID of the payment method (a PaymentMethod, Card, BankAccount, or saved Source object)
    * to attach to this SetupIntent.
    */
  var payment_method: js.UndefOr[String] = js.undefined
  /**
    * Payment-method-specific configuration for this SetupIntent.
    */
  var payment_method_options: js.UndefOr[ISetupIntentPaymentMethodOptions] = js.undefined
  /**
    * The URL to redirect your customer back to after they authenticate on the payment method’s
    * app or site. If you’d prefer to redirect to a mobile application, you can alternatively
    * supply an application URI scheme. This parameter is only used for cards and other
    * redirect-based payment methods.
    */
  var return_url: js.UndefOr[String] = js.undefined
}

object ISetupIntentConfirmOptions {
  @scala.inline
  def apply(
    payment_method: String = null,
    payment_method_options: ISetupIntentPaymentMethodOptions = null,
    return_url: String = null
  ): ISetupIntentConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options)
    if (return_url != null) __obj.updateDynamic("return_url")(return_url)
    __obj.asInstanceOf[ISetupIntentConfirmOptions]
  }
}

