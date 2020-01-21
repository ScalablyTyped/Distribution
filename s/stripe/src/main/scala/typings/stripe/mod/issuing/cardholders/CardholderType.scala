package typings.stripe.mod.issuing.cardholders

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.individual
  - typings.stripe.stripeStrings.business_entity
*/
trait CardholderType extends js.Object

object CardholderType {
  @scala.inline
  def business_entity: typings.stripe.stripeStrings.business_entity = this.cast("business_entity")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def individual: typings.stripe.stripeStrings.individual = this.cast("individual")
}

