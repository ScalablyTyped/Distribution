package typings.stripe.stripeMod.issuing.disputes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.lost
  - typings.stripe.stripeStrings.under_review
  - typings.stripe.stripeStrings.unsubmitted
  - typings.stripe.stripeStrings.won
*/
trait IssuingDisputeStatus extends js.Object

object IssuingDisputeStatus {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def lost: typings.stripe.stripeStrings.lost = this.cast("lost")
  @scala.inline
  def under_review: typings.stripe.stripeStrings.under_review = this.cast("under_review")
  @scala.inline
  def unsubmitted: typings.stripe.stripeStrings.unsubmitted = this.cast("unsubmitted")
  @scala.inline
  def won: typings.stripe.stripeStrings.won = this.cast("won")
}

