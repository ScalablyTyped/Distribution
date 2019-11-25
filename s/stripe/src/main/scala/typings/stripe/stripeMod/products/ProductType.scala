package typings.stripe.stripeMod.products

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.service
  - typings.stripe.stripeStrings.good
*/
trait ProductType extends js.Object

object ProductType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def good: typings.stripe.stripeStrings.good = this.cast("good")
  @scala.inline
  def service: typings.stripe.stripeStrings.service = this.cast("service")
}

