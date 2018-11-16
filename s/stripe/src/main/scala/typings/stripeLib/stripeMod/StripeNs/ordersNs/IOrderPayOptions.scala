package typings
package stripeLib.stripeMod.StripeNs.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOrderPayOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
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
  var source: js.UndefOr[stripeLib.stripeMod.StripeNs.sourcesNs.ISourceCreationOptions] = js.undefined
}

