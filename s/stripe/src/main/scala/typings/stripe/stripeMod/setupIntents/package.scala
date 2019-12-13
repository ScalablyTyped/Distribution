package typings.stripe.stripeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object setupIntents {
  import typings.stripe.stripeMod.paymentIntents.PaymentIntentPaymentMethodType

  /** Payment methods supported by Payment Intents. This is a subsetset of all Payment Method types. See https://stripe.com/docs/api/payment_methods/create#create_payment_method-type */
  type SetupIntentPaymentMethodType = PaymentIntentPaymentMethodType
}
