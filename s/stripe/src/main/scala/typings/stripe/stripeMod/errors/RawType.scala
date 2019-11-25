package typings.stripe.stripeMod.errors

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.card_error
  - typings.stripe.stripeStrings.invalid_request_error
  - typings.stripe.stripeStrings.api_error
  - typings.stripe.stripeStrings.idempotency_error
*/
trait RawType extends js.Object

object RawType {
  @scala.inline
  def api_error: typings.stripe.stripeStrings.api_error = this.cast("api_error")
  @scala.inline
  def card_error: typings.stripe.stripeStrings.card_error = this.cast("card_error")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idempotency_error: typings.stripe.stripeStrings.idempotency_error = this.cast("idempotency_error")
  @scala.inline
  def invalid_request_error: typings.stripe.stripeStrings.invalid_request_error = this.cast("invalid_request_error")
}

