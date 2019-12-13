package typings.stripe.stripeMod.issuing.authorizations

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.chip
  - typings.stripe.stripeStrings.contactless
  - typings.stripe.stripeStrings.keyed_in
  - typings.stripe.stripeStrings.online
  - typings.stripe.stripeStrings.swipe
*/
trait AuthorizationMethod extends js.Object

object AuthorizationMethod {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def chip: typings.stripe.stripeStrings.chip = this.cast("chip")
  @scala.inline
  def contactless: typings.stripe.stripeStrings.contactless = this.cast("contactless")
  @scala.inline
  def keyed_in: typings.stripe.stripeStrings.keyed_in = this.cast("keyed_in")
  @scala.inline
  def online: typings.stripe.stripeStrings.online = this.cast("online")
  @scala.inline
  def swipe: typings.stripe.stripeStrings.swipe = this.cast("swipe")
}

