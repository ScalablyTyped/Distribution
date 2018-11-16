package typings
package stripeLib.stripeMod.StripeNs.ordersNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait IOrderItem
  extends stripeLib.stripeMod.StripeNs.IObject {
  /**
               * A positive integer in the smallest currency unit (that is, 100 cents for $1.00, or 1 for ¥1, Japanese Yen being a 0-decimal currency)
               * representing the total amount for the line item.
               */
  var amount: scala.Double
  /**
               * 3-letter ISO code representing the currency of the line item.
               */
  var currency: java.lang.String
  /**
               * Description of the line item, meant to be displayable to the user (e.g., "Express shipping").
               */
  var description: java.lang.String
  /**
               * value is "order_item"
               */
  @JSName("object")
  var object_IOrderItem: stripeLib.stripeLibStrings.order_item
  /**
               * The ID of the associated object for this line item. Expandable if not null (e.g., expandable to a SKU). [Expandable]
               */
  var parent: java.lang.String | stripeLib.stripeMod.StripeNs.skusNs.ISku
  /**
               * A positive integer representing the number of instances of parent that are included in this order item.
               * Applicable/present only if type is sku.
               */
  var quantity: scala.Double
  /**
               * The type of line item. One of "sku", "tax", "shipping", or "discount".
               */
  var `type`: stripeLib.stripeLibStrings.sku | stripeLib.stripeLibStrings.tax | stripeLib.stripeLibStrings.shipping | stripeLib.stripeLibStrings.discount
}

