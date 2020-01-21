package typings.stripe.mod.plans

import typings.stripe.mod.IDataOptionsWithMetadata
import typings.stripe.mod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * Whether the plan is currently available for new subscriptions.
    */
  var active: js.UndefOr[Boolean] = js.undefined
  /**
    * A brief description of the plan, hidden from customers. This can be unset by updating the value to null and then saving.
    */
  var nickname: js.UndefOr[String] = js.undefined
  /**
    * The product the plan belongs to. Note that after updating, statement descriptors and line items of the plan in active subscriptions will
    * be affected.
    */
  var product: js.UndefOr[String] = js.undefined
  /**
    * Default number of trial days when subscribing a customer to this plan using `trial_from_plan=true`.
    */
  var trial_period_days: js.UndefOr[Double] = js.undefined
}

object IPlanUpdateOptions {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    nickname: String = null,
    product: String = null,
    trial_period_days: Int | Double = null
  ): IPlanUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (nickname != null) __obj.updateDynamic("nickname")(nickname.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product.asInstanceOf[js.Any])
    if (trial_period_days != null) __obj.updateDynamic("trial_period_days")(trial_period_days.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPlanUpdateOptions]
  }
}

