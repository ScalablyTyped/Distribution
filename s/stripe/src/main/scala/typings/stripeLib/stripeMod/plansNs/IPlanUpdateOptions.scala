package typings
package stripeLib.stripeMod.plansNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPlanUpdateOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A brief description of the plan, hidden from customers. This can be unset by updating the value to null and then saving.
    */
  var nickname: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The product the plan belongs to. Note that after updating, statement descriptors and line items of the plan in active subscriptions will
    * be affected.
    */
  var product: js.UndefOr[java.lang.String] = js.undefined
}

object IPlanUpdateOptions {
  @scala.inline
  def apply(
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    nickname: java.lang.String = null,
    product: java.lang.String = null
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

