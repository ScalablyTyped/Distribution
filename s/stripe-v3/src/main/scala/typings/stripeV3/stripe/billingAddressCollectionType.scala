package typings.stripeV3.stripe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.required
  - typings.stripeV3.stripeV3Strings.auto
  - typings.stripeV3.stripeV3Strings._empty
*/
trait billingAddressCollectionType extends js.Object

object billingAddressCollectionType {
  @scala.inline
  def _empty: typings.stripeV3.stripeV3Strings._empty = this.cast("")
  @scala.inline
  def auto: typings.stripeV3.stripeV3Strings.auto = this.cast("auto")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def required: typings.stripeV3.stripeV3Strings.required = this.cast("required")
}

