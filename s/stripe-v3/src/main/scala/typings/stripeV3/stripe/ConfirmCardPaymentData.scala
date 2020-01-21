package typings.stripeV3.stripe

import typings.stripeV3.AnonBillingdetailsCardAnonToken
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Data to be sent with the request.
  * Refer to the Payment Intents API for a full list of parameters.
  */
trait ConfirmCardPaymentData extends js.Object {
  /*
    * Either the id of an existing PaymentMethod,
    * or an object containing data to create a PaymentMethod with.
    * See the use case sections below for details.
    * Recomended
    */
  var payment_method: js.UndefOr[String | AnonBillingdetailsCardAnonToken] = js.undefined
  /**
    * Email address that the receipt for the resulting payment will be sent to.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * If you are handling next actions yourself,
    * pass in a return_url. If the subsequent action is redirect_to_url,
    * this URL will be used on the return path for the redirect.
    */
  var return_url: js.UndefOr[String] = js.undefined
  /**
    * If the PaymentIntent is associated with a customer and this parameter is set to true,
    * the provided payment method will be attached to the customer. Default is false.
    */
  var save_payment_method: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates that you intend to make future payments with this PaymentIntent's payment method.
    */
  var setup_future_usage: js.UndefOr[Boolean] = js.undefined
  /**
    * The shipping details for the payment, if collected.
    * Recomended
    */
  var shipping: js.UndefOr[ShippingDetails] = js.undefined
}

object ConfirmCardPaymentData {
  @scala.inline
  def apply(
    payment_method: String | AnonBillingdetailsCardAnonToken = null,
    receipt_email: String = null,
    return_url: String = null,
    save_payment_method: js.UndefOr[Boolean] = js.undefined,
    setup_future_usage: js.UndefOr[Boolean] = js.undefined,
    shipping: ShippingDetails = null
  ): ConfirmCardPaymentData = {
    val __obj = js.Dynamic.literal()
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (return_url != null) __obj.updateDynamic("return_url")(return_url.asInstanceOf[js.Any])
    if (!js.isUndefined(save_payment_method)) __obj.updateDynamic("save_payment_method")(save_payment_method.asInstanceOf[js.Any])
    if (!js.isUndefined(setup_future_usage)) __obj.updateDynamic("setup_future_usage")(setup_future_usage.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfirmCardPaymentData]
  }
}

