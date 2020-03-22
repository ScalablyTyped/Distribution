package typings.stripe.mod.charges

import typings.stripe.AnonAmountDestination
import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import typings.stripe.mod.IShippingInformation
import typings.stripe.mod.cards.ICardSourceCreationOptions
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
    * For card charges, use statement_descriptor_suffix instead. Otherwise, you
    * can use this value as the complete description of a charge on your customers’
    * statements. Must contain at least one letter, maximum 22 characters.
    */
  var statement_descriptor: js.UndefOr[String] = js.undefined
  /**
    * Provides information about the charge that customers see on their statements.
    * Concatenated with the prefix (shortened descriptor) or statement descriptor
    * that’s set on the account to form the complete statement descriptor. Maximum
    * 22 characters for the concatenated descriptor.
    */
  var statement_descriptor_suffix: js.UndefOr[String] = js.undefined
  /**
    * An optional dictionary including the account to automatically transfer
    * to as part of a destination charge. See the Connect documentation for details.
    */
  var transfer_data: js.UndefOr[AnonAmountDestination] = js.undefined
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
    statement_descriptor_suffix: String = null,
    transfer_data: AnonAmountDestination = null,
    transfer_group: String = null
  ): IChargeCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of.asInstanceOf[js.Any])
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email.asInstanceOf[js.Any])
    if (shipping != null) __obj.updateDynamic("shipping")(shipping.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor.asInstanceOf[js.Any])
    if (statement_descriptor_suffix != null) __obj.updateDynamic("statement_descriptor_suffix")(statement_descriptor_suffix.asInstanceOf[js.Any])
    if (transfer_data != null) __obj.updateDynamic("transfer_data")(transfer_data.asInstanceOf[js.Any])
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChargeCreationOptions]
  }
}

