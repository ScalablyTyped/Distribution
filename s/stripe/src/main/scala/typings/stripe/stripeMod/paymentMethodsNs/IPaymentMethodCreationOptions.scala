package typings.stripe.stripeMod.paymentMethodsNs

import typings.stripe.Anon_Address
import typings.stripe.Anon_Cvc
import typings.stripe.Anon_Token
import typings.stripe.stripeMod.IMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodCreationOptions extends js.Object {
  /** Billing information associated with the PaymentMethod that may be used or required by particular types of payment methods. */
  var billing_details: js.UndefOr[Anon_Address] = js.undefined
  /**
    * If this is a card PaymentMethod, this hash contains the user’s card details. For backwards compatibility, you can alternatively provide a Stripe token (e.g., for Apple Pay,
    * Amex Express Checkout, or legacy Checkout) into the card hash with format card: {token: "tok_visa"}. When creating with a card number, you must meet the requirements for
    * PCI compliance. We strongly recommend using Stripe.js instead of interacting with this API directly.
    */
  var card: js.UndefOr[Anon_Cvc | Anon_Token] = js.undefined
  /** Set of key-value pairs that you can attach to an object. This can be useful for storing additional information about the object in a structured format. */
  var metadata: js.UndefOr[IMetadata] = js.undefined
  /**
    * The type of the PaymentMethod, one of: card and card_present. An additional hash is included on the PaymentMethod with a name matching this value.
    * It contains additional information specific to the PaymentMethod type.
    */
  var `type`: IPaymentMethodType
}

object IPaymentMethodCreationOptions {
  @scala.inline
  def apply(
    `type`: IPaymentMethodType,
    billing_details: Anon_Address = null,
    card: Anon_Cvc | Anon_Token = null,
    metadata: IMetadata = null
  ): IPaymentMethodCreationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`)
    if (billing_details != null) __obj.updateDynamic("billing_details")(billing_details)
    if (card != null) __obj.updateDynamic("card")(card.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[IPaymentMethodCreationOptions]
  }
}

