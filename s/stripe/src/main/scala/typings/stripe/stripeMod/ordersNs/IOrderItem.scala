package typings.stripe.stripeMod.ordersNs

import typings.stripe.stripeMod.IObject
import typings.stripe.stripeMod.skusNs.ISku
import typings.stripe.stripeStrings.discount
import typings.stripe.stripeStrings.order_item
import typings.stripe.stripeStrings.shipping
import typings.stripe.stripeStrings.sku
import typings.stripe.stripeStrings.tax
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IOrderItem extends IObject {
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
    * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
    */
  var description: String
  /**
    * value is "order_item"
    */
  @JSName("object")
  var object_IOrderItem: order_item
  /**
    * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to a SKU). [Expandable]
    */
  var parent: String | ISku
  /**
    * A positive integer representing the number of instances of parent that are included in this order item.
    * Applicable/present only if type is sku.
    */
  var quantity: Double
  /**
    * The type of line item. One of "sku", "tax", "shipping", or "discount".
    */
  var `type`: sku | tax | shipping | discount
}

object IOrderItem {
  @scala.inline
  def apply(
    amount: Double,
    currency: String,
    description: String,
    `object`: order_item,
    parent: String | ISku,
    quantity: Double,
    `type`: sku | tax | shipping | discount
  ): IOrderItem = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, description = description, parent = parent.asInstanceOf[js.Any], quantity = quantity)
    __obj.updateDynamic("object")(`object`)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOrderItem]
  }
}

