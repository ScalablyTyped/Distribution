package typings.stripe.mod.invoices

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IStatusTransitions extends js.Object {
  /**
    * The time that the invoice draft was finalized.
    */
  var finalized_at: Double | Null
  /**
    * The time that the invoice was marked uncollectible.
    */
  var marked_uncollectible_at: Double | Null
  /**
    * The time that the invoice was paid.
    */
  var paid_at: Double | Null
  /**
    * The time that the invoice was voided.
    */
  var voided_at: Double | Null
}

object IStatusTransitions {
  @scala.inline
  def apply(
    finalized_at: Double = null.asInstanceOf[Double],
    marked_uncollectible_at: Double = null.asInstanceOf[Double],
    paid_at: Double = null.asInstanceOf[Double],
    voided_at: Double = null.asInstanceOf[Double]
  ): IStatusTransitions = {
    val __obj = js.Dynamic.literal(finalized_at = finalized_at.asInstanceOf[js.Any], marked_uncollectible_at = marked_uncollectible_at.asInstanceOf[js.Any], paid_at = paid_at.asInstanceOf[js.Any], voided_at = voided_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatusTransitions]
  }
}

