package typings.stripe.stripeMod.plansNs

import typings.stripe.stripeMod.IDataOptionsWithMetadata
import typings.stripe.stripeMod.IOptionsMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanUpdateOptions extends IDataOptionsWithMetadata {
  /**
    * A brief description of the plan, hidden from customers. This can be unset by updating the value to null and then saving.
    */
  var nickname: js.UndefOr[String] = js.undefined
  /**
    * The product the plan belongs to. Note that after updating, statement descriptors and line items of the plan in active subscriptions will
    * be affected.
    */
  var product: js.UndefOr[String] = js.undefined
}

object IPlanUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    metadata: IOptionsMetadata = null,
    nickname: String = null,
    product: String = null
  ): IPlanUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (nickname != null) __obj.updateDynamic("nickname")(nickname)
    if (product != null) __obj.updateDynamic("product")(product)
    __obj.asInstanceOf[IPlanUpdateOptions]
  }
}

