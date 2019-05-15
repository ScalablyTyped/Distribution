package typings
package stripeLib.stripeMod.chargesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IChargeCreationOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A positive integer in the smallest currency unit (e.g 100 cents to charge
    * $1.00, or 1 to charge ¥1, a 0-decimal currency) representing how much to
    * charge the card. The minimum amount is £0.50 (or equivalent in charge
    * currency).
    */
  var amount: scala.Double
  /**
    * A fee in cents that will be applied to the charge and transferred
    * to the application owner’s Stripe account. The request must be
    * made with an OAuth key or the Stripe-Account header in order to
    * take an application fee. For more information, see the
    * application fees documentation.
    */
  var application_fee_amount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Whether or not to immediately capture the charge. When false, the charge
    * issues an authorization (or pre-authorization), and will need to be
    * captured later. Uncaptured charges expire in 7 days. For more information,
    * see authorizing charges and settling later.
    */
  var capture: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * 3-letter ISO code for currency.
    */
  var currency: java.lang.String
  /**
    * The ID of an existing customer that will be charged in this request.
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An arbitrary string which you can attach to a charge object. It is displayed
    * when in the web interface alongside the charge. Note that if you use Stripe
    * to send automatic email receipts to your customers, your receipt emails
    * will include the description of the charge(s) that they are describing.
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An account to make the charge on behalf of. If specified, the charge will be
    * attributed to the destination account for tax reporting, and the funds from
    * the charge will be transferred to the destination account. The ID of the
    * resulting transfer will be returned in the transfer field of the response. See
    * the documentation for details.
    *
    * Connect only.
    */
  var destination: js.UndefOr[java.lang.String | stripeLib.Anon_Account] = js.undefined
  /**
    * The Stripe account ID that these funds are intended for.
    * Automatically set if you use the destination parameter.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var on_behalf_of: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The email address to send this charge's receipt to. The receipt will not be
    * sent until the charge is paid. If this charge is for a customer, the email
    * address specified here will override the customer's email address.
    * Receipts will not be sent for test mode charges. If receipt_email is
    * specified for a charge in live mode, a receipt will be sent regardless of your
    * email settings.
    */
  var receipt_email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Shipping information for the charge. Helps prevent fraud on charges for
    * physical goods. For more information, see the Charge object
    * documentation.
    */
  var shipping: js.UndefOr[stripeLib.stripeMod.IShippingInformation] = js.undefined
  /**
    * A payment source to be charged, such as a credit card. If you also pass a
    * customer ID, the source must be the ID of a source belonging to the
    * customer. Otherwise, if you do not pass a customer ID, the source you
    * provide must either be a token, like the ones returned by Stripe.js, or a
    * object containing a user's credit card details, with the options described
    * below. Although not all information is required, the extra info helps
    * prevent fraud.
    */
  var source: js.UndefOr[stripeLib.stripeMod.sourcesNs.ISourceCreationOptions] = js.undefined
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
  var statement_descriptor: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A string that identifies this transaction as part of a group.
    * See the Connect documentation for details.
    *
    * Connect only.
    */
  var transfer_group: js.UndefOr[java.lang.String] = js.undefined
}

object IChargeCreationOptions {
  @scala.inline
  def apply(
    amount: scala.Double,
    currency: java.lang.String,
    application_fee_amount: scala.Int | scala.Double = null,
    capture: js.UndefOr[scala.Boolean] = js.undefined,
    customer: java.lang.String = null,
    description: java.lang.String = null,
    destination: java.lang.String | stripeLib.Anon_Account = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    on_behalf_of: java.lang.String = null,
    receipt_email: java.lang.String = null,
    shipping: stripeLib.stripeMod.IShippingInformation = null,
    source: stripeLib.stripeMod.sourcesNs.ISourceCreationOptions = null,
    statement_descriptor: java.lang.String = null,
    transfer_group: java.lang.String = null
  ): IChargeCreationOptions = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency)
    if (application_fee_amount != null) __obj.updateDynamic("application_fee_amount")(application_fee_amount.asInstanceOf[js.Any])
    if (!js.isUndefined(capture)) __obj.updateDynamic("capture")(capture)
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (description != null) __obj.updateDynamic("description")(description)
    if (destination != null) __obj.updateDynamic("destination")(destination.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (on_behalf_of != null) __obj.updateDynamic("on_behalf_of")(on_behalf_of)
    if (receipt_email != null) __obj.updateDynamic("receipt_email")(receipt_email)
    if (shipping != null) __obj.updateDynamic("shipping")(shipping)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (statement_descriptor != null) __obj.updateDynamic("statement_descriptor")(statement_descriptor)
    if (transfer_group != null) __obj.updateDynamic("transfer_group")(transfer_group)
    __obj.asInstanceOf[IChargeCreationOptions]
  }
}

