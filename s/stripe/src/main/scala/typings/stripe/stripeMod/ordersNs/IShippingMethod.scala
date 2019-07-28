package typings.stripe.stripeMod.ordersNs

import typings.stripe.Anon_DateEarliest
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
  var delivery_estimate: Anon_DateEarliest
  /**
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: String
  var id: String
}

object IShippingMethod {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    delivery_estimate: Anon_DateEarliest,
    description: String,
    id: String
  ): IShippingMethod = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, delivery_estimate = delivery_estimate, description = description, id = id)
  
    __obj.asInstanceOf[IShippingMethod]
  }
}

