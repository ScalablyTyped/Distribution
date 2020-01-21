package typings.stripe.mod.issuing.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.other
  - typings.stripe.stripeStrings.fraudlent
*/
trait IssuingDisputeReason extends js.Object

object IssuingDisputeReason {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fraudlent: typings.stripe.stripeStrings.fraudlent = this.cast("fraudlent")
  @scala.inline
  def other: typings.stripe.stripeStrings.other = this.cast("other")
}

