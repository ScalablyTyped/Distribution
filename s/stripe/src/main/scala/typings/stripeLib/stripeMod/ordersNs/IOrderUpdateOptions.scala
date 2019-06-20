package typings
package stripeLib.stripeMod.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderUpdateOptions
  extends stripeLib.stripeMod.IDataOptionsWithMetadata {
  /**
    * A coupon code that represents a discount to be applied to this order. Must be one-time duration and in same currency as the order.
    */
  var coupon: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The shipping method to select for fulfilling this order. If specified, must be one of the ids of a shipping method in the
    * shipping_methods array. If specified, will overwrite the existing selected shipping method, updating items as necessary.
    */
  var selected_shipping_method: js.UndefOr[java.lang.String] = js.undefined
  var status: js.UndefOr[OrderStatus] = js.undefined
}

object IOrderUpdateOptions {
  @scala.inline
  def apply(
    coupon: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    metadata: stripeLib.stripeMod.IOptionsMetadata = null,
    selected_shipping_method: java.lang.String = null,
    status: OrderStatus = null
  ): IOrderUpdateOptions = {
    val __obj = js.Dynamic.literal()
    if (coupon != null) __obj.updateDynamic("coupon")(coupon)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (selected_shipping_method != null) __obj.updateDynamic("selected_shipping_method")(selected_shipping_method)
    if (status != null) __obj.updateDynamic("status")(status)
    __obj.asInstanceOf[IOrderUpdateOptions]
  }
}

