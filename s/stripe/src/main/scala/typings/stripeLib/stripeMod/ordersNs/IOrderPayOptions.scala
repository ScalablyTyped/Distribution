package typings
package stripeLib.stripeMod.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderPayOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A fee in cents/pence that will be applied to the order and transferred to the application owner's Stripe account. To use an application
    * fee, the request must be made on behalf of another account, using the Stripe-Account header or OAuth key. For more information, see
    * the application fees documentation.
    */
  var application_fee: js.UndefOr[scala.Double] = js.undefined
  /**
    * The ID of an existing customer that will be charged in this request.
    *
    * Either customer or source is required
    */
  var customer: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The email address of the customer placing the order. If a customer is specified, that customer's email address will be used.
    *
    * Optional, but required if not previously specified.
    */
  var email: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A payment source to be charged, such as a credit card. If you also pass a customer ID, the source must be the ID of a source belonging
    * to the customer. Otherwise, if you do not pass a customer ID, the source you provide must either be a token, like the ones returned
    * by Stripe.js, or a object containing a user's credit card details, with the options described below. Although not all information is
    * required, the extra info helps prevent fraud.
    *
    * Either source or customer is required
    */
  var source: js.UndefOr[stripeLib.stripeMod.sourcesNs.ISourceCreationOptions] = js.undefined
}

object IOrderPayOptions {
  @scala.inline
  def apply(
    application_fee: scala.Int | scala.Double = null,
    customer: java.lang.String = null,
    email: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    source: stripeLib.stripeMod.sourcesNs.ISourceCreationOptions = null
  ): IOrderPayOptions = {
    val __obj = js.Dynamic.literal()
    if (application_fee != null) __obj.updateDynamic("application_fee")(application_fee.asInstanceOf[js.Any])
    if (customer != null) __obj.updateDynamic("customer")(customer)
    if (email != null) __obj.updateDynamic("email")(email)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderPayOptions]
  }
}

