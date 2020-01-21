package typings.stripe.mod.setupIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISetupIntentConfirmOptions extends js.Object {
  /**
    * The client secret of this SetupIntent. Used for client-side confirmation using a publishable key. Please refer to dynamic authentication guide on how client_secret should be handled.
    */
  var client_secret: js.UndefOr[String] = js.undefined
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
    client_secret: String = null,
    payment_method: String = null,
    payment_method_options: ISetupIntentPaymentMethodOptions = null,
    return_url: String = null
  ): ISetupIntentConfirmOptions = {
    val __obj = js.Dynamic.literal()
    if (client_secret != null) __obj.updateDynamic("client_secret")(client_secret.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (payment_method_options != null) __obj.updateDynamic("payment_method_options")(payment_method_options.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISetupIntentConfirmOptions]
  }
}

