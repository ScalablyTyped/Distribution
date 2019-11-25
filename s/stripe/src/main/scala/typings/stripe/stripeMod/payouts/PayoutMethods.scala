package typings.stripe.stripeMod.payouts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.instant
  - typings.stripe.stripeStrings.standard
*/
trait PayoutMethods extends js.Object

object PayoutMethods {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def instant: typings.stripe.stripeStrings.instant = this.cast("instant")
  @scala.inline
  def standard: typings.stripe.stripeStrings.standard = this.cast("standard")
}

