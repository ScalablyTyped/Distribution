package typings.stripe.stripeMod.plans

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.stripe.stripeStrings.day
  - typings.stripe.stripeStrings.week
  - typings.stripe.stripeStrings.month
  - typings.stripe.stripeStrings.year
*/
trait IntervalUnit extends js.Object

object IntervalUnit {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typings.stripe.stripeStrings.day = this.cast("day")
  @scala.inline
  def month: typings.stripe.stripeStrings.month = this.cast("month")
  @scala.inline
  def week: typings.stripe.stripeStrings.week = this.cast("week")
  @scala.inline
  def year: typings.stripe.stripeStrings.year = this.cast("year")
}

