package typings
package stripeLib.stripeMod.invoicesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusTransitions extends js.Object {
  /**
    * The time that the invoice draft was finalized.
    */
  var finalized_at: scala.Double
  /**
    * The time that the invoice was marked uncollectible.
    */
  var marked_uncollectible_at: scala.Double
  /**
    * The time that the invoice was paid.
    */
  var paid_at: scala.Double
  /**
    * The time that the invoice was voided.
    */
  var voided_at: scala.Double
}

object IStatusTransitions {
  @scala.inline
  def apply(
    finalized_at: scala.Double,
    marked_uncollectible_at: scala.Double,
    paid_at: scala.Double,
    voided_at: scala.Double
  ): IStatusTransitions = {
    val __obj = js.Dynamic.literal(finalized_at = finalized_at, marked_uncollectible_at = marked_uncollectible_at, paid_at = paid_at, voided_at = voided_at)
  
    __obj.asInstanceOf[IStatusTransitions]
  }
}

