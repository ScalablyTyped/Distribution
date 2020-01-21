package typings.stripeV3.stripe

import typings.stripeV3.stripeV3Strings.unknown_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripeV3.stripeV3Strings.credit
  - typings.stripeV3.stripeV3Strings.debit
  - typings.stripeV3.stripeV3Strings.prepaid
  - typings.stripeV3.stripeV3Strings.unknown_
*/
trait fundingType extends js.Object

object fundingType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def credit: typings.stripeV3.stripeV3Strings.credit = this.cast("credit")
  @scala.inline
  def debit: typings.stripeV3.stripeV3Strings.debit = this.cast("debit")
  @scala.inline
  def prepaid: typings.stripeV3.stripeV3Strings.prepaid = this.cast("prepaid")
  @scala.inline
  def unknown: unknown_ = this.cast("unknown")
}

