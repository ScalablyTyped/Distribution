package typings.stripe.stripeMod.paymentIntents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.automatic
  - typings.stripe.stripeStrings.manual
*/
trait PaymentIntentDataCaptureMethodOptions extends js.Object

object PaymentIntentDataCaptureMethodOptions {
  @scala.inline
  def automatic: typings.stripe.stripeStrings.automatic = this.cast("automatic")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def manual: typings.stripe.stripeStrings.manual = this.cast("manual")
}

