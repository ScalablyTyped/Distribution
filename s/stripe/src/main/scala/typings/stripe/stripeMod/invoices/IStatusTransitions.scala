package typings.stripe.stripeMod.invoices

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
    finalized_at: Int | Double = null,
    marked_uncollectible_at: Int | Double = null,
    paid_at: Int | Double = null,
    voided_at: Int | Double = null
  ): IStatusTransitions = {
    val __obj = js.Dynamic.literal()
    if (finalized_at != null) __obj.updateDynamic("finalized_at")(finalized_at.asInstanceOf[js.Any])
    if (marked_uncollectible_at != null) __obj.updateDynamic("marked_uncollectible_at")(marked_uncollectible_at.asInstanceOf[js.Any])
    if (paid_at != null) __obj.updateDynamic("paid_at")(paid_at.asInstanceOf[js.Any])
    if (voided_at != null) __obj.updateDynamic("voided_at")(voided_at.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStatusTransitions]
  }
}

