package typings.stripe.stripeMod.refunds

import typings.stripe.stripeMod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRefundListOptions extends IListOptions {
  /**
    * Only return refunds for the charge specified by this charge ID.
    */
  var charge: js.UndefOr[String] = js.undefined
}

object IRefundListOptions {
  @scala.inline
  def apply(
    charge: String = null,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: Int | Double = null,
    starting_after: String = null
  ): IRefundListOptions = {
    val __obj = js.Dynamic.literal()
    if (charge != null) __obj.updateDynamic("charge")(charge)
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IRefundListOptions]
  }
}

