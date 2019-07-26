package typings
package stripeLib.stripeMod.paymentMethodsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodListOptions[T /* <: IPaymentMethodType */]
  extends stripeLib.stripeMod.IListOptions {
  /** The ID of the customer whose PaymentMethods will be retrieved. */
  var customer: java.lang.String
  /** A required filter on the list, based on the object type field. */
  var `type`: T
}

object IPaymentMethodListOptions {
  @scala.inline
  def apply[T /* <: IPaymentMethodType */](
    customer: java.lang.String,
    `type`: T,
    ending_before: java.lang.String = null,
    expand: js.Array[java.lang.String] = null,
    include: js.Array[java.lang.String] = null,
    limit: scala.Int | scala.Double = null,
    starting_after: java.lang.String = null
  ): IPaymentMethodListOptions[T] = {
    val __obj = js.Dynamic.literal(customer = customer)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before)
    if (expand != null) __obj.updateDynamic("expand")(expand)
    if (include != null) __obj.updateDynamic("include")(include)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after)
    __obj.asInstanceOf[IPaymentMethodListOptions[T]]
  }
}

