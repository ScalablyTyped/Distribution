package typings
package stripeLib.stripeMod.StripeNs.refundsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IRefundCreationOptions
  extends stripeLib.stripeMod.StripeNs.IDataOptionsWithMetadata {
  /**
               * A positive integer in cents/pence representing how much of this charge to
               * refund. Can only refund up to the unrefunded amount remaining of the
               * charge.
               *
               * default is entire charge
               */
  var amount: js.UndefOr[scala.Double] = js.undefined
  /**
               * String indicating the reason for the refund. If set, possible values are
               * "duplicate", "fraudulent", and "requested_by_customer". Specifying
               * "fraudulent" as the reason when you believe the charge to be fraudulent
               * will help us improve our fraud detection algorithms.
               */
  var reason: js.UndefOr[java.lang.String] = js.undefined
  /**
               * Boolean indicating whether the application fee should be refunded when
               * refunding this charge. If a full charge refund is given, the full application
               * fee will be refunded. Else, the application fee will be refunded with an
               * amount proportional to the amount of the charge refunded.
               * An application fee can only be refunded by the application that created the
               * charge.
               *
               * Connect only, default is false.
               */
  var refund_application_fee: js.UndefOr[scala.Boolean] = js.undefined
  /**
               * Boolean indicating whether the transfer should be reversed when
               * refunding this charge. The transfer will be reversed for the same amount
               * being refunded (either the entire or partial amount).
               * A transfer can only be reversed by the application that created the charge.
               *
               * Connect only, default is false.
               */
  var reverse_transfer: js.UndefOr[scala.Boolean] = js.undefined
}

