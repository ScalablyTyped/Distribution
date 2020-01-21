package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.api_connection_error
  - typings.stripeV3.stripeV3Strings.api_error
  - typings.stripeV3.stripeV3Strings.authentication_error
  - typings.stripeV3.stripeV3Strings.card_error
  - typings.stripeV3.stripeV3Strings.idempotency_error
  - typings.stripeV3.stripeV3Strings.invalid_request_error
  - typings.stripeV3.stripeV3Strings.rate_limit_error
*/
trait ErrorType extends js.Object

object ErrorType {
  @scala.inline
  def api_connection_error: typings.stripeV3.stripeV3Strings.api_connection_error = this.cast("api_connection_error")
  @scala.inline
  def api_error: typings.stripeV3.stripeV3Strings.api_error = this.cast("api_error")
  @scala.inline
  def authentication_error: typings.stripeV3.stripeV3Strings.authentication_error = this.cast("authentication_error")
  @scala.inline
  def card_error: typings.stripeV3.stripeV3Strings.card_error = this.cast("card_error")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def idempotency_error: typings.stripeV3.stripeV3Strings.idempotency_error = this.cast("idempotency_error")
  @scala.inline
  def invalid_request_error: typings.stripeV3.stripeV3Strings.invalid_request_error = this.cast("invalid_request_error")
  @scala.inline
  def rate_limit_error: typings.stripeV3.stripeV3Strings.rate_limit_error = this.cast("rate_limit_error")
}

