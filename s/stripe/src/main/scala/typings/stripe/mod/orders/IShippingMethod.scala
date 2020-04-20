package typings.stripe.mod.orders

import typings.stripe.AnonEarliest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IShippingMethod extends js.Object {
  /**
    * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
    * representing the total amount for the line item.
    */
  var amount: Double
  /**
    * 3-letter ISO code representing the currency of the line item.
    */
  var currency: String
  /**
    * The estimated delivery date for the given shipping method. Can be either a specific date or a range.
    */
  var delivery_estimate: AnonEarliest
  /**
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: String
  var id: String
}

object IShippingMethod {
  @scala.inline
  def apply(amount: Double, currency: String, delivery_estimate: AnonEarliest, description: String, id: String): IShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], delivery_estimate = delivery_estimate.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[IShippingMethod]
  }
}

