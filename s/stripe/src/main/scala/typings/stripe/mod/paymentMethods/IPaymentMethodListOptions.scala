package typings.stripe.mod.paymentMethods

import typings.stripe.mod.IListOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPaymentMethodListOptions[T /* <: IPaymentMethodType */] extends IListOptions {
  /** The ID of the customer whose PaymentMethods will be retrieved. */
  var customer: String
  /** A required filter on the list, based on the object type field. */
  var `type`: T
}

object IPaymentMethodListOptions {
  @scala.inline
  def apply[T](
    customer: String,
    `type`: T,
    ending_before: String = null,
    expand: js.Array[String] = null,
    include: js.Array[String] = null,
    limit: js.UndefOr[Double] = js.undefined,
    starting_after: String = null
  ): IPaymentMethodListOptions[T] = {
    val __obj = js.Dynamic.literal(customer = customer.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (ending_before != null) __obj.updateDynamic("ending_before")(ending_before.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (include != null) __obj.updateDynamic("include")(include.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (starting_after != null) __obj.updateDynamic("starting_after")(starting_after.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPaymentMethodListOptions[T]]
  }
}

