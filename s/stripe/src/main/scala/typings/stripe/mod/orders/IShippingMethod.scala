package typings.stripe.mod.orders

import typings.stripe.anon.Earliest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IShippingMethod extends js.Object {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
    * representing the total amount for the line item.
    */
  var amount: Double = js.native
  /**
    * 3-letter ISO code representing the currency of the line item.
    */
  var currency: String = js.native
  /**
    * The estimated delivery date for the given shipping method. Can be either a specific date or a range.
    */
  var delivery_estimate: Earliest = js.native
  /**
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: String = js.native
  var id: String = js.native
}

object IShippingMethod {
  @scala.inline
  def apply(amount: Double, currency: String, delivery_estimate: Earliest, description: String, id: String): IShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delivery_estimate = delivery_estimate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShippingMethod]
  }
  @scala.inline
  implicit class IShippingMethodOps[Self <: IShippingMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmount(value: Double): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelivery_estimate(value: Earliest): Self = this.set("delivery_estimate", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
  }
  
}

