package typings.stripe.stripeMod.chargesNs

import typings.stripe.Anon_AmountDestination
import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import typings.stripe.stripeMod.IShippingInformation
import typings.stripe.stripeMod.cardsNs.ICardSourceCreationOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeCreationOptions extends IDataOptionsWithMetadata {
  /**
    * A positive integer in the smallest currency unit (e.g 100 cents to charge
    * $1.00, or 1 to charge ¥1, a 0-decimal currency) representing how much to
    * charge the card. The minimum amount is £0.50 (or equivalent in charge
    * currency).
    */
  var amount: Double
  /**
    * A fee in cents that will be applied to the charge and transferred
    * to the application owner’s Stripe account. The request must be
    * made with an OAuth key or the Stripe-Account header in order to
    * take an application fee. For more information, see the
    * application fees documentation.
    */
  var application_fee_amount: js.UndefOr[Double] = js.undefined
  /**
    * Whether or not to immediately capture the charge. When false, the charge
    * issues an authorization (or pre-authorization), and will need to be
    * captured later. Uncaptured charges expire in 7 days. For more information,
    * see authorizing charges and settling later.
    */
  var capture: js.UndefOr[Boolean] = js.undefined
  /**
    * Three-letter ISO currency code, in lowercase. Must be a supported currency.
    */
  var currency: String
  /**
    * The ID of an existing customer that will be charged in this request.
    */
  var customer: js.UndefOr[String] = js.undefined
  /**
    * An arbitrary string which you can attach to a charge object. It is displayed
    * when in the web interface alongside the charge. Note that if you use Stripe
    * to send automatic email receipts to your customers, your receipt emails
    * will include the description of the charge(s) that they are describing.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The Stripe account ID that these funds are intended for.
    * Automatically set if you use the destination parameter.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var on_behalf_of: js.UndefOr[String] = js.undefined
  /**
    * The email address to send this charge's receipt to. The receipt will not be
    * sent until the charge is paid. If this charge is for a customer, the email
    * address specified here will override the customer's email address.
    * Receipts will not be sent for test mode charges. If receipt_email is
    * specified for a charge in live mode, a receipt will be sent regardless of your
    * email settings.
    */
  var receipt_email: js.UndefOr[String] = js.undefined
  /**
    * Shipping information for the charge. Helps prevent fraud on charges for
    * physical goods. For more information, see the Charge object
    * documentation.
    */
  var shipping: js.UndefOr[IShippingInformation] = js.undefined
  /**
    * A payment source to be charged, such as a credit card. If you also pass a
    * customer ID, the source must be the ID of a source belonging to the
    * customer. Otherwise, if you do not pass a customer ID, the source you
    * provide must either be a token, like the ones returned by Stripe.js, or a
    * object containing a user's credit card details, with the options described
    * below. Although not all information is required, the extra info helps
    * prevent fraud.
    */
  var source: js.UndefOr[String | ICardSourceCreationOptions] = js.undefined
  /**
    * An arbitrary string to be displayed on your customer's credit card
    * statement. This may be up to 22 characters. As an example, if your
    * website is RunClub and the item you're charging for is a race ticket, you
    * may want to specify a statement_descriptor of
    * RunClub 5K race ticket. The statement description may not include
    * <>"' characters, and will appear on your customer's statement in capital
    * letters. Non-ASCII characters are automatically stripped. While most
    * banks display this information consistently, some may display it
    * incorrectly or not at all.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  /**
    * An optional dictionary including the account to automatically transfer
    * to as part of a destination charge. See the Connect documentation for details.
    */
  var transfer_data: js.UndefOr[Anon_AmountDestination] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var transfer_group: js.UndefOr[String] = js.undefined
}

object IChargeCreationOptions {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    application_fee_amount: Int | Double = null,
    capture: js.UndefOr[Boolean] = js.undefined,
    customer: String = null,
    description: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    on_behalf_of: String = null,
    receipt_email: String = null,
    shipping: IShippingInformation = null,
    source: String | ICardSourceCreationOptions = null,
    statement_descriptor: String = null,
    transfer_data: Anon_AmountDestination = null,
    transfer_group: String = null
  ): IChargeCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency)
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[IChargeCreationOptions]
  }
}

